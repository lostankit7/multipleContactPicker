package com.pseudoankit.contact_picker_core.internal.di

import android.content.Context
import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchAllContactsUseCase
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchPaginatedContactsUseCase

public actual class ContactPickerModule(
    private val context: Context
) {

    internal actual fun getFetchAllContactsUseCase(): FetchAllContactsUseCase {
        return FetchAllContactsUseCase(
            contactPickerRepository = getContactPickerRepository()
        )
    }

    internal actual fun getFetchPaginatedContactsUseCase(): FetchPaginatedContactsUseCase {
        return FetchPaginatedContactsUseCase(
            contactPickerRepository = getContactPickerRepository()
        )
    }

    internal actual fun getContactPickerRepository(): ContactPickerRepository {
        return ContactPickerRepository(
            contentResolver = context.contentResolver
        )
    }

}