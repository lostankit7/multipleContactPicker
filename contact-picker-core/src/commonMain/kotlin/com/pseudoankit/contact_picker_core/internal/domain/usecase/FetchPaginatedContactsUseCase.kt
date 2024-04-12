package com.pseudoankit.contact_picker_core.internal.domain.usecase

import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository
import com.pseudoankit.contact_picker_core.model.ContactResult
import com.pseudoankit.contact_picker_core.model.FetchContactsPayload

internal class FetchPaginatedContactsUseCase(
    private val contactPickerRepository: ContactPickerRepository
) {

    suspend operator fun invoke(
        payload: FetchContactsPayload
    ): ContactResult {
        return contactPickerRepository.fetchContacts(
            payload = payload
        )
    }
}
