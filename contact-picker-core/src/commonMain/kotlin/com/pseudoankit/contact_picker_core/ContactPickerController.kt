package com.pseudoankit.contact_picker_core

import com.pseudoankit.contact_picker_core.internal.di.ContactPickerModule
import com.pseudoankit.contact_picker_core.model.ContactResult
import com.pseudoankit.contact_picker_core.model.FetchContactsPayload

public expect object ContactPickerController : ContactPickerControllerInternal

public abstract class ContactPickerControllerInternal {

    internal open var contactPickerModuleMutable: ContactPickerModule? = null

    private val contactPickerModule: ContactPickerModule
        get() {
            if (contactPickerModuleMutable == null) {
                throw Exception()
            }
            return contactPickerModuleMutable!!
        }

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
