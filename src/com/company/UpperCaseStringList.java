package com.company;

import java.util.ArrayList;
import java.util.List;

public class UpperCaseStringList {
    //Declaring property of the class
    private List<String> upperCaseStrings;

    public List<String> getUpperCaseStrings(){
        return upperCaseStrings;
    }
    public UpperCaseStringList(List<String> strings){
        upperCaseStrings = new ArrayList<>();

        if (strings == null) return;
        for (String nextString : strings){
            if (nextString != null){
                String upper = nextString.toUpperCase();
                upperCaseStrings.add(upper);
            }

        }
    }
}
