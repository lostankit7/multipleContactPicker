package com.pseudoankit.contact_picker_core.internal.di

import android.content.Context
import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository

internal actual class ContactPickerModulePlatform(
    private val context: Context
) {

    internal actual val getContactPickerRepository: ContactPickerRepository
        get() {
            return ContactPickerRepository(contentResolver = context.contentResolver)
        }
}