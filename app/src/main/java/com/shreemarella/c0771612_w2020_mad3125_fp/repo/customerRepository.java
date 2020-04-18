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
                HydroBill H2 = new HydroBill("HYD002","05/09/2003","HYDRO",350.89,"Hydro Life",67);
                HydroBill H3 = new HydroBill("HYD003","09/12/2004","HYDRO",650.56,"Hydro Life",54);
                MobileBill M1 = new MobileBill("MOB001","10/12/1998","MOBILE",325.89,"Apple INC","2.5Gb and Unlimited calls","+18199210696",25,890);
                InternetBill I1 = new InternetBill("INT001","03/08/2001","INTERNET",456.78,"Rogers",550);
                InternetBill I2 = new InternetBill("INT002","07/11/2002","INTERNET",340.98,"Fido",250);
                customer customer1 = new customer("C0001","Shree","Marella","Shree@gmail.com");
                customer customer2 = new customer("C0002","Shreya","Vaghasia","Shreya@gmail.com");
                customer customer3 = new customer("C0003","Gagandeep","Kaur","Gagn@gmail.com");
                customer1.addBill("HYD",H1);
                customer1.addBill("MOB",M1);
                customer1.addBill("INT",I1);
                customer2.addBill("HYD",H2);
                customer2.addBill("INT",I2);
                customer3.addBill("HYD",H3);
                customers.add(customer1);
                customers.add(customer2);
                customers.add(customer3);
            }

            public void addcustomer(customer customer)
            {
                customers.add(customer);
            }
}
