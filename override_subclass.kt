import kotlin.math.PI
import kotlin.math.sqrt
abstract class Dwelling(private var residents: Int) {
    //how many people can live in
    abstract val capacity: Int
    //which material this building use
    abstract val buildingMaterial: String 
    fun hasRoom(): Boolean {
    	return residents < capacity
	}
    //important
    abstract fun floorArea(): Double
    fun getRoom(){
        if(capacity>residents){
            residents++
            println("Lucky! You got a room")
        }
        else{
            println("Sorry no more room")
        }
    }
}
class SquareCabin(residents: Int, val length:Double) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 5
    override fun floorArea(): Double {
        return length * length
    }
    
    
}
// open makes RoundHut can be inherited from
open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 4
    override fun floorArea(): Double {
        return PI * radius * radius
    }
    fun calculateMaxCarpetSize(): Double {
        val diameter = 2 * radius
        return sqrt(diameter * diameter / 2)
    }

}
class RoundTower(residents: Int, radius: Double,val floors: Int =2 ) : RoundHut(residents, radius){
    override val buildingMaterial = "Stone"
    override val capacity = 1
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }

}

//how to use with:
fun main() {
    val squareCabin = SquareCabin(6,50.0)
    val RoundHut = RoundHut(3,10.0)
    val RoundTower = RoundTower(1,15.5)
    with(squareCabin){

        println("squareCabin buildingMaterial is "+buildingMaterial)
        println("squareCabin capacity is "+capacity)
        println("squareCabin has free room? "+hasRoom())
        println("Floor area: %.2f".format(floorArea()))
        getRoom()


    }
    with(RoundHut){

        println("RoundHut buildingMaterial is "+buildingMaterial)
        println("RoundHut capacity is "+capacity)
        println("RoundHut has free room? "+hasRoom())
        println("Floor area: %.2f".format(floorArea()))
        getRoom()
        println("Carpet size: ${calculateMaxCarpetSize()}")
    }
    with(RoundTower){

        println("RoundTower buildingMaterial is "+buildingMaterial)
        println("RoundTower capacity is "+capacity)
        println("RoundTower has free room? "+hasRoom())
        println("Floor area: %.2f".format(floorArea()))
        getRoom()
        println("Carpet size: ${calculateMaxCarpetSize()}")
    }
}