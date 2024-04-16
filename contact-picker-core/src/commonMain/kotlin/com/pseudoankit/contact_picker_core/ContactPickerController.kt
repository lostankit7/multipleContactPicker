package com.pseudoankit.contact_picker_core

import com.pseudoankit.contact_picker_core.internal.di.ContactPickerModule
import com.pseudoankit.contact_picker_core.internal.platform.ContactPickerPlatform
import com.pseudoankit.contact_picker_core.model.ContactResult
import com.pseudoankit.contact_picker_core.model.FetchContactsPayload

public object ContactPickerController {

    public fun initialise(androidApplication: Any?) {
        ContactPickerPlatform.validateAndStoreAndroidApplication(androidApplication)
    }

    public suspend fun fetchAllContacts(): ContactResult {
        return ContactPickerModule.getFetchAllContactsUseCase()
    }

    public suspend fun fetchPaginatedContacts(
        payload: FetchContactsPayload
    ): ContactResult {
        return ContactPickerModule.getFetchPaginatedContactsUseCase(
            payload = payload
        )
    }
}
