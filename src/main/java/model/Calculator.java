package model;

public class Calculator {

    public int add(String int1, String int2){
        return Integer.parseInt(int1,4) + Integer.parseInt(int2,4);
    }

    public int subtract(String int1, String int2){
        return Integer.parseInt(int1,4) - Integer.parseInt(int2,4);
    }

    public int multiply(String int1, String int2){
        return Integer.parseInt(int1,4) * Integer.parseInt(int2,4);
    }

    public int divide(String int1, String int2){
        return Integer.parseInt(int1,4) / Integer.parseInt(int2,4);
    }
}
