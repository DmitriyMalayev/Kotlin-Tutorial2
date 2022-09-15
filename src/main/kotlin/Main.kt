fun main() {
    val fullName: String = "Dmitriy Malayev"      //val is read only, var is not.
    println(fullName.lowercase())

    val lastName: String = "Malayev"   //explicitly providing data type to a variable
    val emptyName = ""
    println("Hello World")

    print(emptyName.isEmpty())
    println(fullName)
    println(fullName::class)
    println(lastName)
    val title = "Software Engineer"

    /*
    For words, we use double quotes.
    For single characters we use single quotes. A single character is a 16-bit unicode character which is more memory
    efficient than a String. A single character can also be placed in a string.  Additionally, escape commands are
    also single characters long.
     */

    val firstName = "Steve"
    val c: Char = 'x'
    val foo: String = "y"

    println(firstName)
    println(c)
    println(foo)

    val message = "Hello, \n My name is Dmitriy Malayev. \n How are you?"
    val message2: String = """
        Hello, 
        My name is Dmitriy Malayev. 
        How are you??
    """.trimIndent()

    println(message)
    println(message2)
    print("Hello my name is $fullName I work as a $title. My full name is ${fullName.length} characters long.")
    println("")
    println("")

    println("MATH")

    val myByte: Byte = 8  //8-bit signed integer
    val myShort: Short = 16 //16-bit signed integer
    val myInt: Int = 32  // 32-bit signed integer   (most common)
    val myLong: Long = 64 //64-bit signed integer

    //Decimals
    val myFloat: Float = 32.00F //32-bit floating point number
    val myDouble: Double = 64.00 //64-bit floating point number

    println(myByte.toDouble())
    println(myByte.toDouble()::class)

    val bigLong: Long = 1_000_000_000 //1 billion easier to read
    println(bigLong)

    val newInt = myInt.times(2)
    print(newInt)

    println("")
    println("")

    println("MATH")




}
