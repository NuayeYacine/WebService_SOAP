package com.webservice.soap.web.soap;


import com.webservice.soap.web.soap.services.CalculatorAddition;
import com.webservice.soap.web.soap.services.CalculatorDivision;
import com.webservice.soap.web.soap.services.CalculatorMultiplication;
import com.webservice.soap.web.soap.services.CalculatorSustraction;
import com.webservice.soap.web.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.webservice.soap.*;


// @Endpoint :  Cela indique à Spring que cette classe est un point de terminaison SOAP.
@Endpoint
public class Calculator {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    // ResponsePayload  :pour indiquer que cette méthode renvoie une valeur
    // qui doit être liée à getPayloadSource() de WebServiceMessage.

    @PayloadRoot(namespace = "http://ws.groupeisi.com",localPart = "getInfoRequest")
    public @ResponsePayload GetInfoResponse getInfoRequest (@RequestPayload GetInputRequest request) {
        GetInfoResponse response= new GetInfoResponse();
        response.setOutup("Bonjour M2GL "+ request.getInput());
        return response;
    }


    @PayloadRoot(namespace = "http://ws.groupeisi.com", localPart = "AdditionInputRequest")
    public  @ResponsePayload GetResultatResponse getAdditionRequest(@RequestPayload  AdditionInputRequest request){
        GetResultatResponse reponse = new GetResultatResponse();
        logger.info(" valeur addition "+request);
        CalculatorAddition calculatorAddition = new CalculatorAddition();
        reponse.setGetResultResponse(calculatorAddition.getAddition(request));
        return reponse;
    }

    @PayloadRoot(namespace = "http://ws.groupeisi.com", localPart = "SubtractionInputRequest")
    public @ResponsePayload SubtractionResponse getSubtraction(@RequestPayload SubtractionInputRequest request){
        SubtractionResponse reponse = new SubtractionResponse();
        logger.info(" valeur soustraction "+request);
        CalculatorSustraction calculatorSustraction = new CalculatorSustraction();
        reponse.setGetResultResponse(calculatorSustraction.getSustraction(request));
        return reponse;
    }

   //Multiplication
    @PayloadRoot(namespace = "http://ws.groupeisi.com", localPart = "MultiplicationInputRequest")
    public @ResponsePayload MultiplicationResponse getMultiplication(@RequestPayload MultiplicationInputRequest request){
        MultiplicationResponse resultm = new MultiplicationResponse();
        logger.info(" valeur multiplication "+request);
        CalculatorMultiplication calculatorMultiplication = new CalculatorMultiplication();
        resultm.setGetResultResponse(calculatorMultiplication.getMultiplication(request));
        return resultm;
    }

    // Division

    @PayloadRoot(namespace = "http://ws.groupeisi.com", localPart = "DivisionInputRequest")
    public @ResponsePayload DivisionResponse getDivision(@RequestPayload DivisionInputRequest request){
        DivisionResponse reponse = new DivisionResponse();
        logger.info(" valeur division "+request);
        CalculatorDivision calculatorDivision = new CalculatorDivision();
        reponse.setGetResultResponse(calculatorDivision.getDivision(request));
        return reponse;
    }



}
