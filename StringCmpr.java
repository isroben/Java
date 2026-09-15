public class StringCmpr {
    public static void main(String[] args) {
        String countries[] = {
            "nepal", "austria", "canada", "india",
            "china", "australia"
        };

        System.out.println("Countries starting and ending with same character: ");
        for(int i=0; i<countries.length; i++){
            String country = countries[i];

            if(country.charAt(0) == country.charAt(country.length() - 1)){
                System.err.println(country);
            }
        }
    }
}

