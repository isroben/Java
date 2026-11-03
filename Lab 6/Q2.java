
public class Q2 {
    public static void main(String[] args) {

        String st1 = "Hello";
        String st2 = "World";

        // Character extraction
        char ch = st1.charAt(1);
        System.out.println("Character at 1st Index: " + ch);

        // Extracting characters using getChars()
        char[] st3 = new char[2];
        st1.getChars(1, 3, st3, 0);

        System.out.println("Extracted characters in range:");

        for (char chr : st3) {
            System.out.println(chr);
        }

        // Converting String into character array
        char[] st4 = st2.toCharArray();

        System.out.println("Character array:");

        for (char chArr : st4) {
            System.out.println(chArr);
        }

        // String Comparasion function
        if(st1.equals(st2)){
            System.out.println("Strings are same.");
        }
        else{
            System.out.println("Strings are different.");
        }


        if(st1.compareTo(st2) == 0){
            System.out.println("Both Strings are same.");
        }
        else if(st1.compareTo(st2) < 0){
            System.out.println("String 1 comes before String 2.");
        }
        else{
            System.out.println("String 1 comes after String 2.");
        }
    }
}
