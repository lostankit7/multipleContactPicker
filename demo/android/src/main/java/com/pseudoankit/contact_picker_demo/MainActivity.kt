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

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ContactPickerController.initialise(this.application)

        setContent {

            LaunchedEffect(Unit) {
                println("contacts = ${ContactPickerController.fetchAllContacts()}")
            }

            Box(
                modifier = Modifier.fillMaxSize(),
            ) {
                Text(text = "CP")
            }
        }
    }
}
