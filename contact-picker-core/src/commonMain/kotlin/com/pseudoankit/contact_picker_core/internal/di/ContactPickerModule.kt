package com.pseudoankit.contact_picker_core.internal.di

import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchAllContactsUseCase
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchPaginatedContactsUseCase


internal expect class ContactPickerModulePlatform {
    internal val getContactPickerRepository: ContactPickerRepository
}

internal class ContactPickerModule(
    private val contactPickerModulePlatform: ContactPickerModulePlatform
) {

    internal val getContactPickerRepository: ContactPickerRepository
        get() {
            return contactPickerModulePlatform.getContactPickerRepository
        }

    internal val getFetchAllContactsUseCase: FetchAllContactsUseCase
        get() {
            return FetchAllContactsUseCase(
                contactPickerRepository = getContactPickerRepository
            )
        }

    internal val getFetchPaginatedContactsUseCase: FetchPaginatedContactsUseCase
        get() {
            return FetchPaginatedContactsUseCase(
                contactPickerRepository = getContactPickerRepository
            )
        }
}
