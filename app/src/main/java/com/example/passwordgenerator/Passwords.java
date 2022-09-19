package com.example.passwordgenerator;

public class Passwords {
    private int passwordLength;
    private final int minLength = 1;
    private final int maxLength = 64;
    private boolean upperCase;
    private boolean lowerCase;
    private boolean numbeCase;
    private boolean speciCase;
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIALSYMBOLS = "!@#$%&*()_+-=[]|,./?><";
    Passwords(int passwordLength,boolean upperCase,boolean lowerCase,boolean numbeCase,boolean speciCase){
        this.passwordLength = passwordLength;
        this.upperCase = upperCase;
        this.lowerCase = lowerCase;
        this.numbeCase = numbeCase;
        this.speciCase = speciCase;
    }

    public int getPasswordLength() {
        return passwordLength;
    }

    public void setPasswordLength(int passwordLength) {
        this.passwordLength = passwordLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setLowerCase(boolean lowerCase) {
        this.lowerCase = lowerCase;
    }

    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }

    public void setNumbeCase(boolean numbeCase) {
        this.numbeCase = numbeCase;
    }

    public void setSpeciCase(boolean speciCase) {
        this.speciCase = speciCase;
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

    public static String getSPECIALSYMBOLS() {
        return SPECIALSYMBOLS;
    }

}

