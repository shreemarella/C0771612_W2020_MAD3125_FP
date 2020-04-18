package com.shreemarella.c0771612_w2020_mad3125_fp.classes;

public class HydroBill extends Bill implements IDisplay
{
    private String agencyName;
    private String unitsConsumed;

    public HydroBill(String billId, String billDate, String billType, Double totalBillAmount, String agencyName, String unitsConsumed) {
        super(billId, billDate, billType, totalBillAmount);
        this.agencyName = agencyName;
        this.unitsConsumed = unitsConsumed;
    }

    
}
