import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Entrer un premier nombre: ");
    int a = scanner.nextInt();
    System.out.println("Entrer le deuxieme nombre: ");
    int b = scanner.nextInt();
    int result = a + b ;
    System.out.println("Le résultat est : " + result);

    }
}