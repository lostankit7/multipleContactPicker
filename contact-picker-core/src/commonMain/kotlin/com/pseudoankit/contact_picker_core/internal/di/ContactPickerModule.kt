package com.pseudoankit.contact_picker_core.internal.di

import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchAllContactsUseCase
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchPaginatedContactsUseCase

public expect class ContactPickerModule {

    internal val getFetchAllContactsUseCase: FetchAllContactsUseCase

    internal val getFetchPaginatedContactsUseCase: FetchPaginatedContactsUseCase

    internal val getContactPickerRepository: ContactPickerRepository
}
