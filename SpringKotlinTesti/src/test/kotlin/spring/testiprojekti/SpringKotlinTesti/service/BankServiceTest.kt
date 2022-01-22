package spring.testiprojekti.SpringKotlinTesti.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import spring.testiprojekti.SpringKotlinTesti.datasource.BankDataSource
import spring.testiprojekti.SpringKotlinTesti.datasource.mock.MockBankDataSource

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call it's data source to retrieve banks`() {
        // given
        every { dataSource.retrieveBanks() } returns emptyList()
        // when
        bankService.getBanks();

        // then
        verify(exactly = 1){ dataSource.retrieveBanks()}
    }
}