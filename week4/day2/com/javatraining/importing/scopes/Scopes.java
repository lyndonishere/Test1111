package week4.day2.com.javatraining.importing.scopes;

public class Scopes {
    
    public String myString;

    public static int mySharedNum;


    public static void main(String[] args) {
        Scopes objectOne = new Scopes();
        System.out.println(objectOne.myString);
        objectOne.myString = "This is the stringOne output";
        System.out.println(objectOne.myString);

        Scopes objectTwo = new Scopes();
        System.out.println(objectTwo.myString);
        objectTwo.myString = "This is the stringTwo output";
        System.out.println(objectTwo.myString);

        Scopes.mySharedNum = 5;
        System.out.println(Scopes.mySharedNum);

        methodBlockScopExample();

        // blockScopeVariable and methodScopeVariable will not print and throw an error
        // System.out.println(methodScopeVariable);
        // System.out.println(blockScopeVariable);
    }


    public static void methodBlockScopExample(){
        int methodScopeVariable = 10;
        if(true){
            int blockScopeVariable = 12;
            System.out.println(methodScopeVariable);
            System.out.println(blockScopeVariable);
        }
        // blockScopeVariable will not print and throw an error
        // System.out.println(methodScopeVariable);
        // System.out.println(blockScopeVariable);

    }

}
