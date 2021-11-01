
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
class RoundHut(residents: Int) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 4


}

//how to use with:
fun main() {
    val squareCabin = SquareCabin(6)
    val RoundHut = RoundHut(3)

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
}