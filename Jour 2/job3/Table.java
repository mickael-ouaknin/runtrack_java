import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Entrer un chiffre pour y voir sa table : ");
    int a = scanner.nextInt();
    
    for (int i = 0; i <=10; i++) {
        System.out.println (i +"x"+ a + "=" + (i * a));
        }

    }

}