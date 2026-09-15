public class StringFunctions {
    public static void main(String[] args) {
        
        // Creating strings
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "Hello World";

        // String Extraction
        char ch = str1.charAt(6);

        char[] chars = new char[5];
        str1.getChars(0, 5, chars, 0);

        char[] charArr = str1.toCharArray();

        
        // String Comparision
        System.out.println("Using equals: " + str1.equals(str2)); // returns bool

        System.out.println("Using equalsIgnoreCase(): "+ str1.equalsIgnoreCase(str3)); // returns bool

        System.out.println("Using compareTo(): "+ str1.compareTo(str2)); // returns [-ve, +ve]


        // String Modification
        String sub = str1.substring(0, 5);

        String concatString = str1.concat(" - java");

        String replacedString = str1.replace("World", "Java");
    }
}

