package com.pseudoankit.contact_picker_core

public data class Contact(
    val name: String,
    val number: String
)

public sealed interface ContactResult {
    public data class Success(val contacts: List<Contact>) : ContactResult
    public data class Failure(val message: String) : ContactResult
}
