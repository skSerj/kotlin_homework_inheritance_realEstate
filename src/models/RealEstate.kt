package models

open class RealEstate (val address: String?) {
    override fun toString(): String {
        return "адрес: $address, "
    }
}