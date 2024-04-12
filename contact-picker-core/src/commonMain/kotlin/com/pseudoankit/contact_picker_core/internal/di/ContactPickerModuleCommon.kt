package com.pseudoankit.contact_picker_core.internal.di

import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchAllContactsUseCase
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchPaginatedContactsUseCase


internal expect class ContactPickerModule : ContactPickerModuleCommon {
    internal override val getContactPickerRepository: ContactPickerRepository
}

internal abstract class ContactPickerModuleCommon {

    internal abstract val getContactPickerRepository: ContactPickerRepository

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
