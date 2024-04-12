package com.pseudoankit.contact_picker_core.internal.di

import android.content.Context
import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository

internal actual class ContactPickerModule(
    private val context: Context
) : ContactPickerModuleCommon() {

    actual override val getContactPickerRepository: ContactPickerRepository
        get() {
            return ContactPickerRepository(
                contentResolver = context.contentResolver
            )
        }
}