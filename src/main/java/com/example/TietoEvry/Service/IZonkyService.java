package com.example.TietoEvry.Service;


import com.example.TietoEvry.Zonky.Core.Response.LoanResponse;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface IZonkyService {
    Map<String,LoanResponse> getLoanStatiscs(int numberOfLoans);
}
