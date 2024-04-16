package com.pseudoankit.contact_picker_core.internal.platform

import android.app.Application
import com.pseudoankit.contact_picker_core.internal.data.repository.ContactPickerRepository

internal actual object ContactPickerPlatform {

    private var application: Application? = null
        get() {
            if (field == null) {
                throw Exception("Please initialise sdk by calling ContactPickerController.initialise(application)")
            }
            return field
        }

    actual fun contactPickerRepository(): ContactPickerRepository {
        return ContactPickerRepository(contentResolver = application!!.contentResolver)
    }

    actual fun validateAndStoreAndroidApplication(androidApplication: Any?) {
        if (androidApplication !is Application) {
            throw IllegalStateException("Please pass application while calling ContactPickerController.initialise(application)")
        }
        application = androidApplication
    }

}