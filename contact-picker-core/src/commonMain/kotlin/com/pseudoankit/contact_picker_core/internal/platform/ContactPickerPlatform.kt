package com.pseudoankit.contact_picker_core.internal.platform

import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository

internal expect object ContactPickerPlatform {

    fun contactPickerRepository(): ContactPickerRepository

    fun validateAndStoreAndroidApplication(androidApplication: Any?)
}