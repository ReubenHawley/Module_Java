package com.reubenhawley;

public class Auto {
    private static String merk;
    private static String type;
    private static int pk;
    public static String getMerk() {
        return merk;
    }

    public static void setMerk(String merk) {
        Auto.merk = merk;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Auto.type = type;
    }

    public static int getPk() {
        return pk;
    }

    public static void setPk(int pk) {
        Auto.pk = pk;
    }
    public Auto(){
        merk = "merk onbekend";
        type = "";
        pk =20;
    }
    public String toString(){
        return merk +" "+ type+ " "+pk;
    }
}

