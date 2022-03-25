const val COMMISSION = 0.75

fun main() {
    println("Введите сумму перевода в рублях: ")
    val input = readLine()?.toInt() ?: return
    val amount = if (input !== 0 && input > 0) input * 100 else return
    val commissionForTransfer = (amount * COMMISSION / 100).toInt()
    val lol = if (commissionForTransfer < 3500 ) 35 * 100 else commissionForTransfer

    print("Комиссия за перевод: $lol копеек")
}
