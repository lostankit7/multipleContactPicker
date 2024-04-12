package com.pseudoankit.contact_picker_core

import com.pseudoankit.contact_picker_core.internal.di.ContactPickerModuleCommon
import com.pseudoankit.contact_picker_core.model.ContactResult
import com.pseudoankit.contact_picker_core.model.FetchContactsPayload

public expect object ContactPickerController : InternalControllerDelegate

/**
 * This class is needed because we can't mix expect and non-expect methods in sinlge file
 */
public abstract class InternalControllerDelegate {

    internal open var contactPickerModuleMutable: ContactPickerModuleCommon? = null

    private val contactPickerModule: ContactPickerModuleCommon
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
