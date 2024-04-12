package com.pseudoankit.contact_picker_core

import android.app.Application
import com.pseudoankit.contact_picker_core.internal.di.ContactPickerModule

public actual object ContactPickerController : InternalControllerDelegate() {

    public fun initialise(context: Application) {
        contactPickerModuleMutable = ContactPickerModule(
            context = context
        )
    }
}