import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int total = a * 4 ;
        
        System.out.println(total);
        sc.close();
    }
}
