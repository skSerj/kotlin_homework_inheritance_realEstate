import data.getRealEstateList
import interfaces.FinderByAddress


fun main(args: Array<String>) {

    val finderNumOfRooms = 2
    val minSteadAreaRange = 250.0
    val maxSteadAreaRange = 300.0
    val finderAddress = "Харьков"

    findRealEstateByRooms(finderNumOfRooms)
    findRealEstateBySteadAreaRange(minSteadAreaRange, maxSteadAreaRange)
    findRealEstateByAddress(finderAddress)

}