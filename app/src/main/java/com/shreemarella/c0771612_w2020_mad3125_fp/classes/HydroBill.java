package com.shreemarella.c0771612_w2020_mad3125_fp.classes;

public class HydroBill extends Bill implements IDisplay
{
    private String agencyName;
    private int unitsConsumed;

    public HydroBill(String billId, String billDate, String billType, Double totalBillAmount, String agencyName, int unitsConsumed) {
        super(billId, billDate, billType, totalBillAmount);
        this.agencyName = agencyName;
        this.unitsConsumed = unitsConsumed;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    @Override
    public void print() {

    }
}
