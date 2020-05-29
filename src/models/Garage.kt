package models

import interfaces.FinderByAddress

class Garage(address: String?) : RealEstate(address = address ?: "отсутствует"), FinderByAddress {
    override fun findHomeByAddress(finderAddress: String): Any? {
        address?.let {
            if (it.contains(finderAddress)) {
                return this
            }
        }
        return null
    }

    override fun toString(): String {
        return "Гараж. " + super.toString()
    }

}