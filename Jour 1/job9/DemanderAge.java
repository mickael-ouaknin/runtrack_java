import java.util.Scanner;

public class DemanderAge {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Votre nom ? ");
        String nom = scanner.nextLine();


        System.out.println("Votre prénom ? ");
        String prenom = scanner.nextLine();

        System.out.println("Vous êtes : " + nom + " " + prenom);
        
        
        scanner.close();
    }
}
