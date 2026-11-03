public class Q1{
    public static void main(String[] args){
        String[] countries = {"Nepal", "austria", "canada", "india", "china", "australia"};

        for(int i=0; i<countries.length; ++i){
            int size = countries[i].length();
            if(countries[i].charAt(0) == countries[i].charAt(size-1)){
                System.out.println(countries[i] + " ");
            }
        }
    }
}