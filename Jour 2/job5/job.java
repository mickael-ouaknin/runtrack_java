import java.util.Scanner;

public class Job {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre âge: ");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("Vous ne pouvez pas travailler.");
        } else if (age >= 16 && age <= 55) {
            System.out.println("Vous pouvez travailler.");
        } else if (age > 55 && age < 67) {
            System.out.println("Vous aurez du mal à trouver du travail.");
        } else if (age >= 67) {
            System.out.println("Vous êtes à la retraite.");
        }

        scanner.close();
    }
}
