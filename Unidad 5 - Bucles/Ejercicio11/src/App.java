import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int x = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número: "+x);
        x = s.nextInt();
        s.close();
    }
}
