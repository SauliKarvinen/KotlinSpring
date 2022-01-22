package spring.testiprojekti.SpringKotlinTesti.service

import org.springframework.stereotype.Service
import spring.testiprojekti.SpringKotlinTesti.datasource.BankDataSource
import spring.testiprojekti.SpringKotlinTesti.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank>  {
        println("TÄSSÄ HAETAAN PANKIT LUOKASSA BANKSERVICE KOHTEESTA BankDataSource.retrieveBanks()")
        return dataSource.retrieveBanks()
    }


}