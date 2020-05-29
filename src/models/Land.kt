package models

import interfaces.FinderByAddress
import interfaces.FinderBySteadAreaRange

class Land(address: String?, val steadArea: Double, val price: Int) : RealEstate(address = address
        ?: "отсутствует"), FinderBySteadAreaRange, FinderByAddress {
    override fun findHomeBySteadAreaRange(minSteadAreaRange: Double, maxSteadAreaRange: Double): Land? {
        if (steadArea in minSteadAreaRange..maxSteadAreaRange) {
            return this
        }
        return null
    }

    override fun findHomeByAddress(finderAddress: String): Any? {
        address?.let {
            if (it.contains(finderAddress)) {
                return this
            }
        }
        return null
    }

    override fun toString(): String {
        return "Участок. " + super.toString() + "Площадь участка: $steadArea, цена: $price"
    }

}