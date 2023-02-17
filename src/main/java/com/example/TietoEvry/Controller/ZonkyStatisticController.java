package com.example.TietoEvry.Controller;

import com.example.TietoEvry.Core.Response.StatisticsResponse;
import com.example.TietoEvry.Service.IZonkyService;
import com.example.TietoEvry.Zonky.Core.Response.LoanResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ZonkyStatisticController {

    private final IZonkyService service;

    public ZonkyStatisticController(IZonkyService zonkyService) {
        this.service = zonkyService;
    }


    @GetMapping("/loanStatistics")
    public StatisticsResponse getStatisticalDataAboutCurrentZonkyLoans(@RequestParam(name = "numberOfLoans",defaultValue = "100") int numberOfLoans)
    {
        Map<String, LoanResponse> response = service.getLoanStatiscs(numberOfLoans);
        return new StatisticsResponse(response.get("minimumInterestRate").getInterestRate(), response.get("maximumInterestRate").getInterestRate(),response.get("averageInterestRate").getInterestRate())  ;
    }
}
