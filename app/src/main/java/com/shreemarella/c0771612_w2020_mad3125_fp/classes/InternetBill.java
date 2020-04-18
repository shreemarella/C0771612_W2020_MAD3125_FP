package com.shreemarella.c0771612_w2020_mad3125_fp.classes;

public class InternetBill extends Bill implements IDisplay
{
    private String providerName;
    private int internetGBused;

    public InternetBill(String billId, String billDate, String billType, Double totalBillAmount, String providerName, int internetGBused) {
        super(billId, billDate, billType, totalBillAmount);
        this.providerName = providerName;
        this.internetGBused = internetGBused;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public int getInternetGBused() {
        return internetGBused;
    }

    public void setInternetGBused(int internetGBused) {
        this.internetGBused = internetGBused;
    }

    @Override
    public void print() {

    }
}
