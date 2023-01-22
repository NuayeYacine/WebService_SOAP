package com.webservice.soap.web.soap.services;

import com.webservice.soap.web.wsdl.*;

public class CalculatorDivision
{
    public int getDivision(DivisionInputRequest divisionInput)
    {
        return divisionInput.getNumber1() / divisionInput.getNumber2();

    }
}
