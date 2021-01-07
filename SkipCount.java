import java.util.Scanner;

public class SkipCount {
    public static void main() {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number");
        int skip;
        int loop = 0;
        skip = input.nextInt();
        
        while ( loop <= 100)
        {
            if ( loop % skip ==0 ){
                System.out.println( loop);
            }
            loop++;
        }
        
    }
}
