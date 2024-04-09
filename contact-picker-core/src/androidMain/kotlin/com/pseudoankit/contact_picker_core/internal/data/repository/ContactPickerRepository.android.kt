package com.pseudoankit.contact_picker_core.internal.data.repository

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.database.Cursor
import android.provider.ContactsContract
import com.pseudoankit.contact_picker_core.Contact
import com.pseudoankit.contact_picker_core.ContactResult

internal actual class ContactPickerRepository(
    private val contentResolver: ContentResolver
) {

    internal actual suspend fun fetchContacts(): ContactResult {
        val contactList = mutableListOf<Contact>()

        val uri = ContactsContract.Contacts.CONTENT_URI
        val sort = ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME
        val cursor = contentResolver.query(uri, null, null, null, sort)

        if (cursor == null || cursor.count == 0) {
            cursor?.close()
            return ContactResult.Failure("")
        }

        while (cursor.moveToNext()) {
            val id = cursor get ContactsContract.Contacts._ID
            val name = cursor get ContactsContract.Contacts.DISPLAY_NAME
            val phoneCursor = contentResolver.query(
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                null,
                ContactsContract.CommonDataKinds.Phone.CONTACT_ID + "=?",
                arrayOf(id), null
            )

            if (phoneCursor == null || !phoneCursor.moveToNext()) {
                continue
            }

            val number = phoneCursor get ContactsContract.CommonDataKinds.Phone.NUMBER
            if (name != null && number != null) {
                val contact = Contact(
                    name = name,
                    number = number
                )
                contactList.add(contact)
            }
            phoneCursor.close()
        }
        cursor.close()

        return ContactResult.Success(contactList)
    }

    @SuppressLint("Range")
    infix fun Cursor.get(columnName: String): String? {
        return getString(getColumnIndex(columnName))
    }
}