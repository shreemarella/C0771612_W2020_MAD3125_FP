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
    }
}
