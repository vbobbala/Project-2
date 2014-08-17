public class Comparators implements java.util.Comparator<String> 
{

    
    public Comparators() {
        super();
       }

    public int compare(String s1, String s2) {
        int distance1 = Math.abs(s1.length() );
        int distance2 = Math.abs(s2.length() );

        return distance2 - distance1;
    }
}