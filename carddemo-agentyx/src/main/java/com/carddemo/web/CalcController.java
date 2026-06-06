package com.carddemo.web;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal; import java.math.RoundingMode;
import java.util.Map;
@RestController @RequestMapping("/api/calc")
public class CalcController {
    private static final BigDecimal D1200 = new BigDecimal("1200");
    @GetMapping("/interest")
    public Map<String,Object> interest(@RequestParam BigDecimal balance, @RequestParam BigDecimal rate) {
        BigDecimal monthly = balance.multiply(rate).divide(D1200, 2, RoundingMode.HALF_UP);
        return Map.of("monthlyInterest", monthly);
    }
}
