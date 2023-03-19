case class Currencyy(code: String, amount: Double, toUSD: Double)

object Implicits extends App

// money "USD 100"
implicit def stringToCurrency(money: String): Currencyy =
    // destructure pattern
    val Array(code: String, value: String) = money.split("\\s")
    val amountAsDouble = value.toDouble
    code match
        case "USD" => Currencyy("USD", amountAsDouble, amountAsDouble)
        case "NZD" => Currencyy("USD", amountAsDouble, amountAsDouble / 1.5)
        case "CAD" => Currencyy("USD", amountAsDouble, amountAsDouble / 1.3)

val cad: Currencyy = "CAD 100"
