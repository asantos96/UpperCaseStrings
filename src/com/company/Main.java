package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Copy code from null presentation.
    //Revise the code in main() that an NPE is thrown by the code inside the UpperCaseStringList class.
    //Revise the code inside UpperCaseStringList class to prevent NPEs from being thrown.

    public static void main(String[] args) {
	List<String> myStrings = new ArrayList<>();
    myStrings.add("abc");
    myStrings.add(null);
    myStrings.add("def");
    myStrings.add("ghi");
    myStrings.add(null);
      //  myStrings = null;

        UpperCaseStringList upperCaseStrings = new UpperCaseStringList(myStrings);
        System.out.println(upperCaseStrings.getUpperCaseStrings());

    }

}
