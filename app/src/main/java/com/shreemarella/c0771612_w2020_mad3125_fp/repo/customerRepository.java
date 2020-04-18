package com.shreemarella.c0771612_w2020_mad3125_fp.repo;

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
                
            }
}
