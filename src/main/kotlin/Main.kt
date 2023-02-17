fun main() {
        val school = "akirachix"
   println(school[0] +""+school[2] +""+school[3] )
    println()
    info("Sharoni", 75)
    println()
    word("hotelTransilvania")
    word("GUI")
    println()
    Bool("Jenniffer", "Jenniffer")
    Bool("Washington", "Hudson")
}
fun info(x: String, y: Int):String{
    var X = "Hi my name is " + x +" "+"and am "+y +"years old"
    println(X)
    return X
}
fun word(t: String){
    println(t.length)
}
fun Bool(name1: String, name2: String){
    if (name1==name2)
        println("That's me")
    else

        println("I don't know who that is")
}