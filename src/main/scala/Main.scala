@main def hello: Unit = {
    println("Hello world!")
    println(msg)

    val x = List(1,2,3)
    println(x.map(_ + 1))
    println(x.filter(_ < 3))
}

def msg = "I was compiled by Scala 3. :)"
