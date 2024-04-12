package com.pseudoankit.contact_picker_core

import com.pseudoankit.contact_picker_core.internal.di.ContactPickerModule
import com.pseudoankit.contact_picker_core.model.ContactResult
import com.pseudoankit.contact_picker_core.model.FetchContactsPayload

public class ContactPickerController(
    private val contactPickerModule: ContactPickerModule
) {

    public suspend fun fetchAllContacts(): ContactResult {
        return contactPickerModule.getFetchAllContactsUseCase()
    }

    public suspend fun fetchPaginatedContacts(
        payload: FetchContactsPayload
    ): ContactResult {
        return contactPickerModule.getFetchPaginatedContactsUseCase(
            payload = payload
        )
    }
}