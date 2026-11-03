class College{
    private static String collegeName = "RR Campus";

    private String studentName;

    College(String studentName){
        this.studentName = studentName;
    }


    static class getCollege{
        void display(){
            System.out.println("Name of Collage: " + collegeName);
        }
    }


    class getInfo{
        void display(){
            System.out.println("Name of College: " + collegeName);
            System.out.println("Name of Student: " + studentName);
        }
    }
}

public class Q4{
    public static void main(String[] args){
        // creating static nested object
        College.getCollege s = new College.getCollege();

        s.display();

        // creating non-static methods
        College t = new College("Roben");
        College.getInfo info = t.new getInfo();

        info.display();
    }
}