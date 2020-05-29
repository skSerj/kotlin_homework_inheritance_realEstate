package data

import models.*

fun getRealEstateList() = ArrayList<RealEstate>().apply{
    add(
      Flat(null,35.5,1,30000)
    )
    add(
        Flat("Харьков",45.0,2,35000)
    )
    add(
        Land(null,300.0,30000)
    )
    add(
        Land("Днепр",250.0,27000)
    )
    add(
        Stead("Одесса",300.0,50000)
    )
    add(
        Stead("Харьков",350.0,60000)
    )
    add(
        House("Днепр", 100.0,5,260.0,100000)
    )
    add(
        House("Харьков", 80.0,2,200.0,90000)
    )
    add(
            Garage(null)
    )
    add(
            Garage("Харьков")
    )
}