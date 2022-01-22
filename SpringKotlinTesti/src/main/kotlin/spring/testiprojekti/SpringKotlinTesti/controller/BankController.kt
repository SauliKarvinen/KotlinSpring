package spring.testiprojekti.SpringKotlinTesti.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import spring.testiprojekti.SpringKotlinTesti.model.Bank
import spring.testiprojekti.SpringKotlinTesti.service.BankService
import sun.security.provider.certpath.CollectionCertStore

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {

    init {
        println("BANKCONTROLLER KONSTRUKTORI")
    }

    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()
}