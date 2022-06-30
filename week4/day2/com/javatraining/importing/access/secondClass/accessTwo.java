package week4.day2.com.javatraining.importing.access.secondClass;

import week4.day2.com.javatraining.importing.access.firstClass.accessOne;

public class accessTwo extends accessOne{
    
    public static void main(String[] args) {
        accessOne myObject = new accessOne();
        
        myObject.publicField = true;

        // myObject.protectedField = true;
        // System.out.println(myObject.protectedField);
        // This will throw an error due to access protection

        // myObject.defaultField = true;
        // This will throw an error due to default access protection

        // myObject.privateField = true;
        // This will throw an error due to private access protection
    }
    
}
