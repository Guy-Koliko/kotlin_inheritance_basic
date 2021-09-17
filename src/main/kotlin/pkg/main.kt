package pkg
import kotlin.math.PI

fun main(){

    val squareCabin = SquareCabin(4,50.0)
    val roundHut = RoundHut(3,10.0)
    val roundTower=RoundTower(3,15.1)

    println("\nSquare Cabin\n============\"")
    with(squareCabin){
        println("Capacity: ${capacity}")
        println("Building Material: ${buildingMaterial}")
        println("Has Room: ${hasRoom()}")
        println("Floor Area: ${floorArae()}")

    }
    println("\nSquare Cabin\n============\"")
    with(roundHut){
        println("Capacity: ${capacity}")
        println("Building Material: ${buildingMaterial}")
        println("Has Room: ${hasRoom()}")
        println("Floor Area: ${floorArae()}")
    }
    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArae()}")
    }


}

abstract class Dwelling(private var residents:Int ){
    abstract val buildingMaterial:String
    abstract val capacity:Int

    fun hasRoom():Boolean{
        return residents < capacity
    }
    abstract fun floorArae():Double
}

//square cabin class
class SquareCabin(residents: Int, val length:Double):Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
    override fun floorArae(): Double {
        return length * length
    }
}

//Roundhut subclass
open class RoundHut(residents: Int, val radius: Double):Dwelling(residents){
    override val buildingMaterial = "Strew"
    override val capacity = 4
    override fun floorArae(): Double {
        return PI*radius*radius
    }
}

class RoundTower(
    residents: Int, radius: Double, val floor: Int =2): RoundHut(residents, radius){
    override val buildingMaterial = "Stone"
    override val capacity =4 *floor

    override fun floorArae(): Double {
        return super.floorArae() * floor
    }
}