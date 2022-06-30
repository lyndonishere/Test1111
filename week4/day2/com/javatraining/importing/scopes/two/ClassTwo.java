package week4.day2.com.javatraining.importing.scopes.two;

import week4.day2.com.javatraining.importing.scopes.one.ClassOne;

public class ClassTwo {
    public static void main(String[] args) {
        ClassOne myObject = new ClassOne(13, "String Input", true);
        //////////////////////////////////////////////////////////////
        System.out.println(myObject.myNumber);
        System.out.println(myObject.myString);
        System.out.println(myObject.myBoolean);
        
    }
}
