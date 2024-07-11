import java.util.Scanner;

public class First{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();

        int premierChiffre = nombre; 
        int dernierChiffre = nombre % 10; 

        while (premierChiffre >= 10) {
            premierChiffre /= 10;
        }

        System.out.println("Le premier chiffre est : " + premierChiffre);
        System.out.println("Le dernier chiffre est : " + dernierChiffre);
    }
}