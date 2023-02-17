package com.example.TietoEvry.Service;

import com.example.TietoEvry.Provider.ZonkyRestTemplateProvider;
import com.example.TietoEvry.Zonky.Core.Response.LoanResponse;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ZonkyService implements IZonkyService
{

    private final ZonkyRestTemplateProvider provider;

    public ZonkyService(ZonkyRestTemplateProvider zonkyRestTemplateProvider) {
        this.provider = zonkyRestTemplateProvider;
    }


    @Override
    public Map<String,LoanResponse> getLoanStatiscs(int numberOfLoans) {
        List<LoanResponse> response = provider.getLoanResponse("/loans/marketplace", 0, numberOfLoans, "-datePublished,-interestRate");
        if(response == null || response.isEmpty()){
            return new HashMap<>();
        }
        return new HashMap<String,LoanResponse>(){{
            put("maximumInterestRate",Collections.max(response, Comparator.comparing(LoanResponse::getInterestRate)));
            put("minimumInterestRate",Collections.min(response, Comparator.comparing(LoanResponse::getInterestRate)));
            put("averageInterestRate",new LoanResponse(response.stream().mapToDouble(LoanResponse::getInterestRateDouble).average().orElse(0.0)));
    }};
    }
}
