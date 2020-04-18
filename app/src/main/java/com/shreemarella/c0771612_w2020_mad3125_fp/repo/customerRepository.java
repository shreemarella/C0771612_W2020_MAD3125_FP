package com.shreemarella.c0771612_w2020_mad3125_fp.repo;

import com.shreemarella.c0771612_w2020_mad3125_fp.classes.HydroBill;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.InternetBill;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.MobileBill;
import com.shreemarella.c0771612_w2020_mad3125_fp.classes.customer;

import java.util.ArrayList;

public class customerRepository
{
    private static customerRepository dataStorage= new customerRepository();
            private ArrayList<com.shreemarella.c0771612_w2020_mad3125_fp.classes.customer> customers = new ArrayList<>();

            public customerRepository()
            {
                loadDetails();
            }

            public static customerRepository getInstance()
            {
                return dataStorage;
            }
            public ArrayList<customer> getCustomers()
            {
                return this.customers;
            }
            public void loadDetails()
            {
                HydroBill H1 = new HydroBill("HYD001","15/10/1996","HYDRO",200.50,"powertoronto",45);
                MobileBill M1 = new MobileBill("MOB001","10/12/1998","MOBILE",325.89,"Apple INC","2.5Gb and Unlimited calls","+18199210696",25,890);
                InternetBill I1 = new InternetBill("INT001","03/08/2001","INTERNET",456.78,"Rogers","256.78");
                customer customer1 = new customer("C0001","Shree","Marella","Shree@gmail.com");
//                customer customer2 = new customer()

            }
}
