package com.pseudoankit.contact_picker_core.internal.di

import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchAllContactsUseCase
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchPaginatedContactsUseCase

public expect class ContactPickerModule {

    internal fun getFetchAllContactsUseCase(): FetchAllContactsUseCase

    internal fun getFetchPaginatedContactsUseCase(): FetchPaginatedContactsUseCase

    internal fun getContactPickerRepository(): ContactPickerRepository
}
