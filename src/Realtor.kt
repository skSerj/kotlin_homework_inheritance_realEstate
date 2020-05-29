import data.getRealEstateList
import interfaces.FinderByAddress
import interfaces.FinderByRoom
import interfaces.FinderBySteadAreaRange

val list = getRealEstateList()

fun findRealEstateByRooms(finderNumOfRooms: Int) {
    list.forEach { newHomeByRooms ->
        if (newHomeByRooms is FinderByRoom) {
            val finderByRoom = newHomeByRooms.findHomeByNumOfRoom(finderNumOfRooms)
            if (finderByRoom != null) {
                println("Обьект с искомым количеством комнат: $finderByRoom")
            }
        }
    }
}

fun findRealEstateBySteadAreaRange(minSteadAreaRange: Double, maxSteadAreaRange: Double) {
    list.forEach { newHomeBySteadAreaRange ->
        if (newHomeBySteadAreaRange is FinderBySteadAreaRange) {
            val finderBySteadAreaRange = newHomeBySteadAreaRange.findHomeBySteadAreaRange(minSteadAreaRange, maxSteadAreaRange)
            if (finderBySteadAreaRange != null) {
                println("Обьект в указанном диапазоне площадей участка : $finderBySteadAreaRange")
            }
        }
    }
}

fun findRealEstateByAddress(finderAddress: String) {

    list.forEach { newHomeByAddress ->
        if (newHomeByAddress is FinderByAddress) {
            val finderBySteadAreaRange = newHomeByAddress.findHomeByAddress(finderAddress)
            if (finderBySteadAreaRange != null) {
                println("Обьект по искомому адресу: $finderBySteadAreaRange")
            }
        }
    }

}