fun main() {
    val squareCabin = SquareCabin(6)
    println(squareCabin.buildingMaterial)
    println(squareCabin.capacity)
    println(squareCabin.hasRoom())
}
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