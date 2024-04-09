package com.pseudoankit.contact_picker_core

import com.pseudoankit.contact_picker_core.internal.di.ContactPickerModule

public class ContactPickerController(
    private val contactPickerModule: ContactPickerModule
) {

    public suspend fun fetchAllContacts(): ContactResult {
        return contactPickerModule.getFetchAllContactsUseCase().invoke()
    }

    public suspend fun fetchPaginatedContacts(): ContactResult {
        return contactPickerModule.getFetchAllContactsUseCase().invoke()
    }
}