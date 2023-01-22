package com.webservice.soap.web.soap.services;


import com.webservice.soap.web.wsdl.*;

public class CalculatorAddition {

    public int getAddition(AdditionInputRequest additionInput)
    {
        return additionInput.getNumber1() + additionInput.getNumber2();

    }
}
