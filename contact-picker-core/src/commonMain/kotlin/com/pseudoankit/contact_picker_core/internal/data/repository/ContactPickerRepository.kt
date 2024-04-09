package com.pseudoankit.contact_picker_core.internal.data.repository

import com.pseudoankit.contact_picker_core.ContactResult

internal expect class ContactPickerRepository {

    // fetch by page no and size
    internal suspend fun fetchContacts(): ContactResult
}