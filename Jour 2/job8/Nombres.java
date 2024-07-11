import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer une chaîne de chiffres :");
        String text = scanner.nextLine(); 
        int count = 0;

        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) 
                count++;
        }

        System.out.println("Nombre total de chiffres est : " + count);
    }
}