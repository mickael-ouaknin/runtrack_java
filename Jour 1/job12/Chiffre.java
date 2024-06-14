import java.util.Scanner;

public class Chiffre {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    
    System.out.println("Donner un chiffre :");
    int scan = scanner.nextInt();
    
    for (int i = 0; i <= scan; i++) {
    System.out.println(i);
    }

    scanner.close();

    }
}