val a = 100
val b = 10

val sum = a + b

val s = "HELLO"
val lower = s.toLowerCase()

def ifElseReturn: Int =
    if a > 10 then
        println(10)
    end if

    if b == 10 then
        20
    else
        30

def forLoop: Unit =
    val amounts = Array(10, 24, 25, 20, 12)

    for (amount <- amounts) println(amount)

    // Map array
    val results: Array[Int] = for(amount <- amounts) yield amount

    // Composit map array
    val currencies = Array("USD", "NZD")
    val resultss: Array[String] =
        for
            amount <- amounts
            currency <- currencies
            if amount > 20 && amount < 30
        yield currency + " " + amount

    currencies.foreach(x => println(x))

    // Map maps for for loop
    val maps = Map(
        "X" -> 1.0,
        "Y" -> 2.0,
        "Z" -> 3.0
    )

    for ((alphabet, floats) <- maps) println(s"Alpha: $alphabet, Floats: $floats")
    