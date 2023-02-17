package com.example.TietoEvry.Controller;

import com.example.TietoEvry.Core.Response.StatisticsResponse;
import com.example.TietoEvry.Service.IZonkyService;
import com.example.TietoEvry.Zonky.Core.Response.LoanResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ZonkyStatisticController {

    private final IZonkyService service;

    public ZonkyStatisticController(IZonkyService zonkyService) {
        this.service = zonkyService;
    }


    @GetMapping("/loanStatistics")
    public ResponseEntity<StatisticsResponse> getStatisticalDataAboutCurrentZonkyLoans(@RequestParam(name = "numberOfLoans",defaultValue = "100") int numberOfLoans)
    {
        Map<String, LoanResponse> statiscs = service.getLoanStatiscs(numberOfLoans);
        if(statiscs == null || statiscs.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        StatisticsResponse response = new StatisticsResponse(statiscs.get("minimumInterestRate").getInterestRate(), statiscs.get("maximumInterestRate").getInterestRate(), statiscs.get("averageInterestRate").getInterestRate());

        return new ResponseEntity<StatisticsResponse>(response, HttpStatus.OK)   ;
    }
}
