package com.shreemarella.c0771612_w2020_mad3125_fp.classes;

public class HydroBill extends Bill implements IDisplay
{
    private String agencyName;
    private int unitsConsumed;

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

    public HydroBill(String billId, String billDate, String billType, Double totalBillAmount, String agencyName, int unitsConsumed) {
        super(billId, billDate, billType, totalBillAmount);
        this.agencyName = agencyName;
        this.unitsConsumed = unitsConsumed;
    }
    public Double billCalculate(){
        double totalBillAmount = 0.0;
        if (unitsConsumed < 10)
        {
            totalBillAmount = 1.5 * unitsConsumed;
        }
        else
        {
            totalBillAmount = 2 * unitsConsumed;
        }
        return totalBillAmount;
    }



    @Override
    public void print() {

    }
}
