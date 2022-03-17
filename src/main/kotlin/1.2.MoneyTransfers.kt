const val  COMMISSION = 0.75

fun main() {
    println("Введите сумму перевода в рублях но не меньше 35 рублей: ")
    val input = readLine()?.toInt() ?: return
    val amount: Int = if (input >= 35) input * 100 else "Сумма меньше 35 рублей".toInt()
    val commissionForTransfer = (amount * COMMISSION / 100).toInt()

    print("Комиссия за перевод: $commissionForTransfer копеек")
}
