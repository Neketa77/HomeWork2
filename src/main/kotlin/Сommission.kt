fun main () {
    val amount = 7_000_000
    val precent = 0.75
    val minCommission = 3500

    val commission = amount * precent
    val result = if (commission < 3500) minCommission
    else commission
    val result2: Int = result.toInt()
    val result3 = result2 / 100
    print( "Комиссия составляет : $result копеек или  $result3 рублей")


}