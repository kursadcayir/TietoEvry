package com.example.TietoEvry.Core.Response;

import java.math.BigDecimal;

public class StatisticsResponse {
    private BigDecimal minimumInterestRateLoan;
    private BigDecimal maximumInterestRateLoan;
    private BigDecimal averageInterestRateLoan;

    public StatisticsResponse(BigDecimal minimumInterestRateLoan, BigDecimal maximumInterestRateLoan, BigDecimal averageInterestRateLoan) {

        this.minimumInterestRateLoan = minimumInterestRateLoan;
        this.maximumInterestRateLoan = maximumInterestRateLoan;
        this.averageInterestRateLoan = averageInterestRateLoan;
    }

    public BigDecimal getMinimumInterestRateLoan() {
        return minimumInterestRateLoan;
    }

    public BigDecimal getMaximumInterestRateLoan() {
        return maximumInterestRateLoan;
    }

    public BigDecimal getAverageInterestRateLoan() {
        return averageInterestRateLoan;
    }
}
