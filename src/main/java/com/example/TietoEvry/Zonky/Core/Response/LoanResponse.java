package com.example.TietoEvry.Zonky.Core.Response;

import com.example.TietoEvry.Zonky.Core.Pojo.InsuranceHistory;
import com.example.TietoEvry.Zonky.Core.Pojo.Photo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class LoanResponse {
    public LoanResponse() {
    }
    public LoanResponse(double v) {
        setInterestRate(new BigDecimal(v).setScale(6, RoundingMode.HALF_UP) );
    }
    private Integer  id;
    private String url;
    private String name;
    private String story;
    private String purpose;
    ArrayList<Photo> photos = new ArrayList < Photo > ();
    private Integer userId;
    private String borrowerNo;
    private String publicIdentifier;
    private String nickName;
    private Integer termInMonths;
    private Integer premium;
    private BigDecimal interestRate;
    private BigDecimal revenueRate;
    private BigDecimal annuity;

    private String rating;
    private Boolean topped;
    private BigDecimal amount;
    private BigDecimal remainingInvestment;
    private BigDecimal investmentRate;
    private Boolean covered;
    private BigDecimal reservedAmount;
    private BigDecimal zonkyPlusAmount;
    private String datePublished;
    private Boolean published;
    private String deadline;
    private Integer investmentsCount;
    private String region;
    private String mainIncomeType;
    private String mainIncomeIndustry;
    private BigDecimal activeLoansCount;
    private Boolean insuranceActive;
    private Boolean additionallyInsured;
    ArrayList < Object > flags = new ArrayList < Object > ();
    ArrayList <InsuranceHistory> insuranceHistory = new ArrayList < InsuranceHistory > ();
    private float annuityWithInsurance;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBorrowerNo() {
        return borrowerNo;
    }

    public void setBorrowerNo(String borrowerNo) {
        this.borrowerNo = borrowerNo;
    }

    public String getPublicIdentifier() {
        return publicIdentifier;
    }

    public void setPublicIdentifier(String publicIdentifier) {
        this.publicIdentifier = publicIdentifier;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(Integer termInMonths) {
        this.termInMonths = termInMonths;
    }

    public Integer getPremium() {
        return premium;
    }

    public void setPremium(Integer premium) {
        this.premium = premium;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }
    public Double getInterestRateDouble() {
        return interestRate.doubleValue();
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getRevenueRate() {
        return revenueRate;
    }

    public void setRevenueRate(BigDecimal revenueRate) {
        this.revenueRate = revenueRate;
    }

    public BigDecimal getAnnuity() {
        return annuity;
    }

    public void setAnnuity(BigDecimal annuity) {
        this.annuity = annuity;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Boolean getTopped() {
        return topped;
    }

    public void setTopped(Boolean topped) {
        this.topped = topped;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRemainingInvestment() {
        return remainingInvestment;
    }

    public void setRemainingInvestment(BigDecimal remainingInvestment) {
        this.remainingInvestment = remainingInvestment;
    }

    public BigDecimal getInvestmentRate() {
        return investmentRate;
    }

    public void setInvestmentRate(BigDecimal investmentRate) {
        this.investmentRate = investmentRate;
    }

    public Boolean getCovered() {
        return covered;
    }

    public void setCovered(Boolean covered) {
        this.covered = covered;
    }

    public BigDecimal getReservedAmount() {
        return reservedAmount;
    }

    public void setReservedAmount(BigDecimal reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    public BigDecimal getZonkyPlusAmount() {
        return zonkyPlusAmount;
    }

    public void setZonkyPlusAmount(BigDecimal zonkyPlusAmount) {
        this.zonkyPlusAmount = zonkyPlusAmount;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Integer getInvestmentsCount() {
        return investmentsCount;
    }

    public void setInvestmentsCount(Integer investmentsCount) {
        this.investmentsCount = investmentsCount;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMainIncomeType() {
        return mainIncomeType;
    }

    public void setMainIncomeType(String mainIncomeType) {
        this.mainIncomeType = mainIncomeType;
    }

    public String getMainIncomeIndustry() {
        return mainIncomeIndustry;
    }

    public void setMainIncomeIndustry(String mainIncomeIndustry) {
        this.mainIncomeIndustry = mainIncomeIndustry;
    }

    public BigDecimal getActiveLoansCount() {
        return activeLoansCount;
    }

    public void setActiveLoansCount(BigDecimal activeLoansCount) {
        this.activeLoansCount = activeLoansCount;
    }

    public Boolean getInsuranceActive() {
        return insuranceActive;
    }

    public void setInsuranceActive(Boolean insuranceActive) {
        this.insuranceActive = insuranceActive;
    }

    public Boolean getAdditionallyInsured() {
        return additionallyInsured;
    }

    public void setAdditionallyInsured(Boolean additionallyInsured) {
        this.additionallyInsured = additionallyInsured;
    }

    public ArrayList<Object> getFlags() {
        return flags;
    }

    public void setFlags(ArrayList<Object> flags) {
        this.flags = flags;
    }

    public ArrayList<InsuranceHistory> getInsuranceHistory() {
        return insuranceHistory;
    }

    public void setInsuranceHistory(ArrayList<InsuranceHistory> insuranceHistory) {
        this.insuranceHistory = insuranceHistory;
    }

    public float getAnnuityWithInsurance() {
        return annuityWithInsurance;
    }

    public void setAnnuityWithInsurance(float annuityWithInsurance) {
        this.annuityWithInsurance = annuityWithInsurance;
    }
}

