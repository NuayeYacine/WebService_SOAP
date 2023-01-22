package com.webservice.soap.web.soap.services;

import com.webservice.soap.web.wsdl.*;

public class CalculatorMultiplication {
    public int getMultiplication(MultiplicationInputRequest multiplicationInput)
    {
        return multiplicationInput.getNumber1() * multiplicationInput.getNumber2();

    }
}
