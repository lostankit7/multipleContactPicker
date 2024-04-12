package com.pseudoankit.contact_picker_core

import android.app.Application
import com.pseudoankit.contact_picker_core.internal.di.ContactPickerModule
import com.pseudoankit.contact_picker_core.internal.di.ContactPickerModulePlatform

public actual object ContactPickerController : ContactPickerControllerInternal() {

    public fun initialise(context: Application) {
        contactPickerModuleMutable = ContactPickerModule(
            contactPickerModulePlatform = ContactPickerModulePlatform(context = context)
        )
    }
}