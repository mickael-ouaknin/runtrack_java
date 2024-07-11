import java.util.Scanner;

class Facteur{

 public static void main(String args[]){

  Scanner scanner = new Scanner(System.in);

          System.out.println("Entrez votre nombre à factoriser : ");
        int a = scanner.nextInt();

  int i,fact=1;
  for(i=1;i<=a;i++){
      fact=fact*i;
  }
  System.out.println("La factorielle de "+ a +" est : "+fact);

 }
}