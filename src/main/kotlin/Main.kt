fun main() {
    school()

    println(info("Sharoni", 75))

   println( word("hotelTransilvania"))
    println ( word("GUI"))

    println(Bool("Ashley"))
    Bool("Washington")
}
fun school(){
//A string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string
val school = "akirachix"

println(school[0] +""+school[2] +""+school[3] )
println((school[0].toString()+ school[2]+school[3]))
println()
}
//Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively.
fun info(x: String, y: Int):String{
    var X = "Hi my name is " + x +" "+"and am "+y +"years old"
       return X
}
//Write a function that takes in a String and returns its length
fun word(t: String): Int {
    var length = t.length
    return length
}
//Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”
fun Bool(name1: String){
    if (name1.equals("Ashley"))
        println("That's me!")
    else

        println("I don't know who that is")
}