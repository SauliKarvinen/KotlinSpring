package spring.testiprojekti.SpringKotlinTesti.datasource

import spring.testiprojekti.SpringKotlinTesti.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}