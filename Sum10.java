public class Sum10 {
    public static void main() {
        int sum = 0;
        int loop = 0;
        
        while ( loop <= 10 )
        {
            sum = sum + loop;
            loop++;
            System.out.println( sum );
        }
    }
}