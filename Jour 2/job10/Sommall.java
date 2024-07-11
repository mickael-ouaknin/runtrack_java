import java.util.Scanner;

public class Sommall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre : ");


        int nombre = scanner.nextInt();
        int somme = 0;

        while (nombre != 0) {
            somme = somme + nombre % 10;
            nombre = nombre / 10;
        };
        
        System.out.println("Le résultat est : " + somme);

    }
}
