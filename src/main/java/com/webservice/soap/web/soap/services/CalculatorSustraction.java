package com.webservice.soap.web.soap.services;

import com.webservice.soap.web.wsdl.*;

public class CalculatorSustraction {
    public int getSustraction(SubtractionInputRequest subtractionInput)
    {
        return subtractionInput.getNumber1() - subtractionInput.getNumber2();

    }
}
