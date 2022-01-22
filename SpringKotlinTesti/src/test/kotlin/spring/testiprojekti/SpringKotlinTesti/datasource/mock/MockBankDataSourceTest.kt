package spring.testiprojekti.SpringKotlinTesti.datasource.mock

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()
    @Test
    fun `should provide a collection of banks`() {
        // given


        // when
        val banks = mockDataSource.retrieveBanks()

        // then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)

    }

    @Test
    fun `should provide some mock data`() {
        // given


        // when
        val banks = mockDataSource.retrieveBanks()
        val uniqueValues = mockDataSource.retrieveBanks().map{ bank -> bank.accountNumber}.distinct()

        // then
        assertThat(banks).allMatch{it.accountNumber.isNotBlank()}
        assertThat(banks).anyMatch{it.trust != 0.0}
        assertThat(banks).anyMatch{it.transactionFee != 0}
        assertThat(banks.size).isEqualTo(uniqueValues.size)



    }
}