import java.util.Scanner;

public class Chaines {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer la première chaine de caractère :");
        String Chaine1 = scanner.nextLine();


        System.out.println("Entrer la deuxieme chaine de caractère :");
        String Chaine2 = scanner.nextLine();
        
        String reverse1 = Chaine1 = Chaine2;
        String reverse2 = Chaine2 = Chaine1;

       System.out.println("Chaine 1 : "+reverse1); 
       System.out.println("Chaine 2 : "+reverse2); 

       scanner.close();
    }
}