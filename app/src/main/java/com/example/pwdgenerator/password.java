package com.example.pwdgenerator;

public class password {
    private static final int minLength = 1;
    private static final int maxLength = 64;
    private boolean isUpperCase;
    private boolean isLowerCase;
    private boolean isNumber;
    private boolean isSpecSymbol;
    private int length;
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIALSYMBOL = "!@#$%&*()_+-=[]|,./?><";
    password(int length,boolean LowerCase,boolean UpperCase,boolean Number,boolean SpecSymbol){
        this.length = length;
        this.isLowerCase = LowerCase;
        this.isUpperCase = UpperCase;
        this.isNumber = Number;
        this.isSpecSymbol = SpecSymbol;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setLowerCase(boolean lowerCase) {
        isLowerCase = lowerCase;
    }

    public void setUpperCase(boolean upperCase) {
        isUpperCase = upperCase;
    }

    public void setNumber(boolean number) {
        isNumber = number;
    }

    public void setSpecSymbol(boolean specSymbol) {
        isSpecSymbol = specSymbol;
    }

    public static String getLOWER() {
        return LOWER;
    }

    public static String getUPPER() {
        return UPPER;
    }

    public static String getNUMBERS() {
        return NUMBERS;
    }

    public static String getSPECIALSYMBOL() {
        return SPECIALSYMBOL;
    }
}
