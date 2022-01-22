package spring.testiprojekti.SpringKotlinTesti

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/testi")
class Testireitti {

    @GetMapping
    fun testing(): String {
        return "MITÄ ETTÄ"
    }

    @GetMapping("toinenreitti")
    fun toinenreitti(): String {
        println("Reactista otettiin yhteyttä")
        return "<div>Terve</div>"
    }
}