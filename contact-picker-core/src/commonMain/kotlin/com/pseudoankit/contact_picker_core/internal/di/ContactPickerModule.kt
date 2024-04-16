package com.pseudoankit.contact_picker_core.internal.di

import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchAllContactsUseCase
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchPaginatedContactsUseCase
import com.pseudoankit.contact_picker_core.internal.platform.ContactPickerPlatform


internal object ContactPickerModule {
    private val contactPickerRepository: ContactPickerRepository by lazy {
        ContactPickerPlatform.contactPickerRepository()
    }

    internal val getFetchAllContactsUseCase: FetchAllContactsUseCase
        get() = FetchAllContactsUseCase(
            contactPickerRepository = contactPickerRepository
        )

    internal val getFetchPaginatedContactsUseCase: FetchPaginatedContactsUseCase
        get() = FetchPaginatedContactsUseCase(
            contactPickerRepository = contactPickerRepository
        )
}
