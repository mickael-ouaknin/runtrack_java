import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donner une hauteur de triangle (pas trop haut stp) : ");
        int nombre = scanner.nextInt();

        for (int i = 0; i < nombre; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
