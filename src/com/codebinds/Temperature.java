package com.codebinds;

public class Temperature {
    public static double CelsToFahr(double Cels) {
        return (Cels*1.8 + 32.0);
    }

    public static double FahrToCels(double Fahr) {
        return ((Fahr - 32.0)/1.8);
    }
}
