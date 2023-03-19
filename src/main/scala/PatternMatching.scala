def matching: Unit =
    val m = 450

    m match
        case 50: Int => println("40$")
        case 100: Int => println("69#")
        case _: Int => println("dunno")

    m match
        case a: Int if a == 40 => println(s"$a")
        case 100: Int => println("69#")
        case _: Int => println("dunno")

    val res: Int = m match
        case a: Int if a == 40 => 30
        case 100 => 204
        case _: Int => 404
    
abstract class Currency
case class USD() extends Currency
case class CAD() extends Currency
case class NZD() extends Currency

def classMatch: Unit =
    val currency: Currency = NZD()
    val amount = 100

    currency match
        case u: USD => println("USD " + amount)
        case c: CAD => println("USD " + amount * (1/1.30))
        case n: NZD => println("USD " + amount * (1/1.50))
    
def matchShape: Unit =
    val arr = Array(1, 2, 3)

    arr match
        case Array(first, second, third) => println(s"Second $second")
    
    val tup = ("NZD", 100)

    println(tup._1)

    tup match
        case (currency, amount) if currency == "USD" => println("USD" + amount)
