package CalculatorServer.com.java;

import Calculator.com.java.Calculator;

public class CalculatorServer implements Calculator {
	public final static String CHARACTER_ADD = "+";
    public final static String CHARACTER_MIN = "-";
    public final static String CHARACTER_DIV = "/";
    public final static String CHARACTER_MUL = "*";
    
    public  CalculatorServer(){
    	System.out.println("Executing " + this.getClass());
    }
    
	public float operation(float num1, float num2, String op) throws Exception
    {
        if(op.equals(CHARACTER_ADD))
        	return num1  +  num2;
        else if(op.equals(CHARACTER_MIN))
        	return num1 -  num2;
    
        else if(op.equals(CHARACTER_MUL))
        	return num1 *  num2;
        else if(op.equals(CHARACTER_DIV))
        {
        	if(num2 != 0)
        		return num1 /  num2;
        	else {
        		throw new Exception("ZeroDivisibilityException...");
        	}
        }	
		return -1;
    }
}
