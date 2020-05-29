package interfaces

import models.Flat

interface FinderByRoom {
    fun findHomeByNumOfRoom(finderNumOfRooms: Int): Any?
}