package models

import interfaces.FinderByAddress
import interfaces.FinderByRoom

class Flat(address: String?, val area: Double, val rooms: Int, val price: Int) : RealEstate(address = address
        ?: "отсутствует"), FinderByRoom, FinderByAddress {
    override fun findHomeByNumOfRoom(finderNumOfRooms: Int): Flat? {
        if (finderNumOfRooms == rooms) {
            return this
        }
        return null
    }

    override fun findHomeByAddress(finderAddress: String): Flat? {
        address?.let {
            if (it.contains(finderAddress)) {
                return this
            }
        }
        return null
    }

    override fun toString(): String {
        return "Квартира. " + super.toString() + "площадь квартиры: $area, кол-во комнат: $rooms, цена : $price у.е."
    }

}