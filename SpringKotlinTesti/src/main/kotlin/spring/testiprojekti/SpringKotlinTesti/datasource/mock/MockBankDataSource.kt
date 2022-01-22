package spring.testiprojekti.SpringKotlinTesti.datasource.mock

import org.springframework.stereotype.Repository
import spring.testiprojekti.SpringKotlinTesti.datasource.BankDataSource
import spring.testiprojekti.SpringKotlinTesti.model.Bank

@Repository
class MockBankDataSource: BankDataSource {

    init {
        println("MockBankDataSource KONSTRUKTORI")
    }

    val banks = listOf(
        Bank("1234",3.14,17),
        Bank("1010",17.0,0),
        Bank("5786",0.0,100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}
