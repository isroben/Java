class OuterClass{
    private String instanceVar = "Outer Instance Variable";

    private static String staticVar = "Outer static Variable";

    static class StaticInnerClass{
        void display(){
            System.out.println("Inside of Static inner class.");

            System.out.println("Accessing: " + staticVar);
        }
    }

    class NonStaticInnerClass{
        void display(){
            System.out.println("Inside Non-Static Inner Class: ");

            System.out.println("Accessing: " + staticVar);
            System.out.println("Accessing: " + instanceVar);
        }
    }
}

public class InnerClassDemo{
    public static void main(String[] args){

        OuterClass.StaticInnerClass staticObj = new OuterClass.StaticInnerClass();
        staticObj.display();


        OuterClass outerObj = new OuterClass();
        OuterClass.NonStaticInnerClass nonStaticObj = outerObj.new NonStaticInnerClass();
        nonStaticObj.display();
    }
}