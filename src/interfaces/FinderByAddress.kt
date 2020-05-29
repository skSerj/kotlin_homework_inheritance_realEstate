package interfaces

interface FinderByAddress {
    abstract fun findHomeByAddress(finderAddress: String): Any?
}