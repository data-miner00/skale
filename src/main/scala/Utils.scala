class Utils // For static class, use `object`

private val cadToUsd: Double = 1/1.30
private val nzdToUsd: Double = 1/1.50

def getRateFrom(code: String): Double =
    println("getting rate from " + code)
    code match
        case "NZD" => nzdToUsd
        case "CAD" => cadToUsd
