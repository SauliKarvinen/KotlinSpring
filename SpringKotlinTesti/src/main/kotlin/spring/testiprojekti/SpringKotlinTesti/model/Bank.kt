package spring.testiprojekti.SpringKotlinTesti.model

data class Bank(

    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
    ) {
    init {
        println("BANK")
    }
}