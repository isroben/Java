public class constructors {
    static class Students{
        private int a;
        private int b;

        public Students(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public void getData(){
            System.err.println(a);
            System.err.println(b);

        }

        
    }
    public static void main(String[] args) {
        Students s1 = new Students(3, 7);
    }
}

public class CountryCheck {
    public static void main(String[] args) {

        String countries[] = {
            "nepal", "austria", "canada",
            "canada", "india", "china", "australia"
        };

        System.out.println("Countries starting and ending with same character:");

        for (int i = 0; i < countries.length; i++) {

            String country = countries[i];

            if (country.charAt(0) == country.charAt(country.length() - 1)) {
                System.out.println(country);
            }
        }
    }
}
