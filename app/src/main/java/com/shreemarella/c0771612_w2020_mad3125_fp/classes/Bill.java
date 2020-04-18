package com.shreemarella.c0771612_w2020_mad3125_fp.classes;

public class Bill
{
    private String billId;
    private String billDate;
    private String billType;
    private String totalBillAmount;

    public Bill(String billId, String billDate, String billType, String totalBillAmount) {
        this.billId = billId;
        this.billDate = billDate;
        this.billType = billType;
        this.totalBillAmount = totalBillAmount;
    }
}
