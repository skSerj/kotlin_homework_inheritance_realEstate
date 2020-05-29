package models

import interfaces.FinderByAddress
import interfaces.FinderByRoom
import interfaces.FinderBySteadAreaRange

class House(address: String?, val area: Double, val rooms: Int, val landArea: Double, val price: Int) : RealEstate(address = address
        ?: "отсутствует"), FinderByRoom, FinderBySteadAreaRange,FinderByAddress {
    override fun findHomeByNumOfRoom(finderNumOfRooms: Int): House? {
        if (finderNumOfRooms == rooms) {
            return this
        }
        return null
    }

    override fun findHomeBySteadAreaRange(minSteadAreaRange: Double, maxSteadAreaRange: Double): House? {
        if (landArea in minSteadAreaRange..maxSteadAreaRange) {
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
        return "Дом. " + super.toString() + "площаль дома: $area, кол-во комнат: $rooms, площадь участка: $landArea, цена: $price"
    }

}