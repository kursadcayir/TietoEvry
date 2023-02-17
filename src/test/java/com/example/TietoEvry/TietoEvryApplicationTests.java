package com.example.TietoEvry;

import com.example.TietoEvry.Controller.ZonkyStatisticController;
import com.example.TietoEvry.Core.Response.StatisticsResponse;
import com.example.TietoEvry.Provider.ZonkyRestTemplateProvider;
import com.example.TietoEvry.Service.ZonkyService;
import com.example.TietoEvry.Zonky.Core.Response.LoanResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@SpringBootTest
@AutoConfigureMockMvc
class TietoEvryApplicationTests {

	private ZonkyService service;

	@BeforeEach
	public void setUp() {

		service = mock(ZonkyService.class);
		when(service.getLoanStatiscs(100)).thenReturn(new HashMap<String, LoanResponse>() {{
			put("maximumInterestRate", new LoanResponse(10.0));
			put("minimumInterestRate", new LoanResponse(5.0));
			put("averageInterestRate", new LoanResponse(7.5));
		}});
	}

	@Test
	void ControllerTest() {
		ZonkyStatisticController c = new ZonkyStatisticController(service);
		ResponseEntity<StatisticsResponse> response = c.getStatisticalDataAboutCurrentZonkyLoans(100);
		Double min = 5.0;
		Double max = 10.0;
		Double avg = 7.5;
		Assertions.assertEquals(response.getBody().getMinimumInterestRateLoan(), new BigDecimal(5).setScale(6));
		Assertions.assertEquals(response.getBody().getMaximumInterestRateLoan(), new BigDecimal(10).setScale(6));
		Assertions.assertEquals(response.getBody().getAverageInterestRateLoan(), new BigDecimal(7.5).setScale(6));
	}
}
