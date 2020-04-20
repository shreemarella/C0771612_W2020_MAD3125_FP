package com.shreemarella.c0771612_w2020_mad3125_fp.classes;

public class MobileBill extends Bill implements IDisplay
{
    private String mobileManufacturer;
    private String planName;
    private String mobileNo;
    private int internetGBused;
    private int minutesUsed;

    public MobileBill(String billId, String billDate, String billType, Double totalBillAmount, String mobileManufacturer, String planName, String mobileNo, int internetGBused, int minutesUsed) {
        super(billId, billDate, billType, totalBillAmount);
        this.mobileManufacturer = mobileManufacturer;
        this.planName = planName;
        this.mobileNo = mobileNo;
        this.internetGBused = internetGBused;
        this.minutesUsed = minutesUsed;
        this.totalBillAmount = billCalculate();
    }

    public String getMobileManufacturer() {
        return mobileManufacturer;
    }

    public void setMobileManufacturer(String mobileManufacturer) {
        this.mobileManufacturer = mobileManufacturer;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getInternetGBused() {
        return internetGBused;
    }

    public void setInternetGBused(int internetGBused) {
        this.internetGBused = internetGBused;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    @Override
    public Double billCalculate(){
        double totalBillAmount = 0.0;
        totalBillAmount = (this.internetGBused ) * 25 + (this.minutesUsed) * 0.2;
        return totalBillAmount;
    }

    @Override
    public void print() {

    }
}
