package com.pseudoankit.contact_picker_core.internal.di

import android.content.Context
import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchAllContactsUseCase
import com.pseudoankit.contact_picker_core.internal.domain.usecase.FetchPaginatedContactsUseCase

public actual class ContactPickerModule(
    private val context: Context
) {

    internal actual val getFetchAllContactsUseCase: FetchAllContactsUseCase
        get() {
            return FetchAllContactsUseCase(
                contactPickerRepository = getContactPickerRepository
            )
        }

    internal actual val getFetchPaginatedContactsUseCase: FetchPaginatedContactsUseCase
        get() {
            return FetchPaginatedContactsUseCase(
                contactPickerRepository = getContactPickerRepository
            )
        }

    internal actual val getContactPickerRepository: ContactPickerRepository
        get() {
            return ContactPickerRepository(
                contentResolver = context.contentResolver
            )
        }

}