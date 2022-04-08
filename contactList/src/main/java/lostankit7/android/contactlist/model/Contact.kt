package lostankit7.android.contactlist.model

import lostankit7.android.contactlist.base.BaseItemModel
import lostankit7.android.contactlist.factory.ItemTypeFactory

data class Contact(
    val name: String,
    val number: String,
) : BaseItemModel {
    override fun type(typeFactory: ItemTypeFactory): Int {
        return typeFactory.type(this)
    }
}


