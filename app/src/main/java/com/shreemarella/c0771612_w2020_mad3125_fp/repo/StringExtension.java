package com.shreemarella.c0771612_w2020_mad3125_fp.repo;

public class StringExtension
{
    public static boolean mobileValidation(String s)
    {
        if(s.matches("\\d{10}")) return true;
        else return false;
    }
    

}
