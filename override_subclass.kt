
abstract class Dwelling(private var residents: Int) {
    //how many people can live in
    abstract val capacity: Int
    //which material this building use
    abstract val buildingMaterial: String 
    fun hasRoom(): Boolean {
    	return residents < capacity
	}
}
class SquareCabin(residents: Int) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 5
    
    
}
// open makes RoundHut can be inherited from
open class RoundHut(residents: Int) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 4


}
class RoundTower(residents: Int) : RoundHut(residents){
    override val buildingMaterial = "Stone"
    override val capacity = 1


}

//how to use with:
fun main() {
    val squareCabin = SquareCabin(6)
    val RoundHut = RoundHut(3)
    val RoundTower = RoundTower(1)
    with(squareCabin){

        println("squareCabin buildingMaterial is "+buildingMaterial)
        println("squareCabin capacity is "+capacity)
        println("squareCabin has free room? "+hasRoom())

    }
    with(RoundHut){

        println("RoundHut buildingMaterial is "+buildingMaterial)
        println("RoundHut capacity is "+capacity)
        println("RoundHut has free room? "+hasRoom())

    }
    with(RoundTower){

        println("RoundTower buildingMaterial is "+buildingMaterial)
        println("RoundTower capacity is "+capacity)
        println("RoundTower has free room? "+hasRoom())

    }
}