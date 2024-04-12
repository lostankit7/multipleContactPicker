package com.pseudoankit.contact_picker_core.internal.data.repository

import com.pseudoankit.contact_picker_core.model.ContactResult
import com.pseudoankit.contact_picker_core.model.FetchContactsPayload

internal expect class ContactPickerRepository {

    internal suspend fun fetchContacts(payload: FetchContactsPayload): ContactResult
}