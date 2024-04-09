package com.pseudoankit.contact_picker_core.internal.domain.usecase

import com.pseudoankit.contact_picker_core.ContactResult
import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository

internal class FetchAllContactsUseCase(
    private val contactPickerRepository: ContactPickerRepository
) {

    suspend operator fun invoke(): ContactResult {
        return contactPickerRepository.fetchContacts()
    }
}