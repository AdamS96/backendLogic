package com.example.applicants.businessLogic;

public class OutsideStateFactor {

    public double calculateOutsideStateFactor (String outsideState){

        double outsideStateFactor = 0.0;

        if (outsideState.equalsIgnoreCase("Yes")){
            return outsideStateFactor = 1.1;
        } else if (outsideState.equalsIgnoreCase("No")){
            return outsideStateFactor = 1.0;
        } else {
            return outsideStateFactor;
        }
    }
}