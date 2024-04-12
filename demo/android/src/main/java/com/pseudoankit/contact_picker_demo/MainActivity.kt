package com.pseudoankit.contact_picker_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.pseudoankit.contact_picker_core.ContactPickerController
import com.pseudoankit.contact_picker_core.internal.di.ContactPickerModule

class MainActivity : ComponentActivity() {

    private val controller by lazy {
        ContactPickerController(ContactPickerModule(this.applicationContext))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            LaunchedEffect(Unit) {
                println("contacts = ${controller.fetchAllContacts()}")
            }

            Box(
                modifier = Modifier.fillMaxSize(),
            ) {
                Text(text = "CP")
            }
        }
    }
}
