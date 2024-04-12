package com.pseudoankit.contact_picker_core.model

public sealed interface ContactResult {
    public data class Success(val contacts: List<Contact>) : ContactResult
    public data class Failure(val message: String) : ContactResult

    public val data: List<Contact>?
        get() = when (this) {
            is Failure -> null
            is Success -> contacts
        }
}
