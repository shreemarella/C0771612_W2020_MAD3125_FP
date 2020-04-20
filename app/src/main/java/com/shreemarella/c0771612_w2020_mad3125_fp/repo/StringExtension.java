package com.shreemarella.c0771612_w2020_mad3125_fp.repo;

public class StringExtension
{
    public static boolean mobileValidation(String s)
    {
        if(s.matches("\\d{10}")) return true;
        else return false;
    }

    public static boolean emailValidation(String s)
    {
        if (s.matches("[A-Z0-9a-z.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}"))  return true;
        else return false;
    }

    public static String doubleFormatter(Double d)
    {
        return String.format(" $ " + "%,.2f", d);
    }


}
