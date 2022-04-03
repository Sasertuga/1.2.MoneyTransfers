const val COMMISSION = 0.75

fun main() {
    println("Введите сумму перевода в рублях: ")
    val input = readLine()?.toInt() ?: return
    val amount = if (input !== 0 && input > 0) input * 100 else return
    val commissionForTransfer = (amount * COMMISSION / 100).toInt()
    val verification = if (commissionForTransfer < 35) 3500 else commissionForTransfer

    println("Комиссия за перевод: $verification копеек")
}
