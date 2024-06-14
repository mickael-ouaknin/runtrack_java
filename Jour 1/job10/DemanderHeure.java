import java.util.Scanner;

public class DemanderHeure {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer une durée en minutes : ");
        int time = scanner.nextInt();

        int heure = time / 60;
        int minutes = time % 60;

        System.out.println(time + " minute(s) est équivalent à " + heure + " heure(s) et " + minutes + " minute(s).");

        scanner.close();
    }
}