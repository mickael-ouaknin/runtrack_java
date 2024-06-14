public class Mystring {
    public static void main(String[] args) {
        // Déclaration et initialisation en utilisant une chaîne de caractères littérale
        String a = "Bonjour";

        // Déclaration et initialisation en utilisant le mot clé 'new' et le constructeur de la classe String
        String b = new String("Salut");

        // Déclaration et initialisation en utilisant un tableau de caractères
        char[] char = {'H', 'e', 'l', 'l', 'o'};
        String c = new String(charArray);

        // Déclaration et initialisation en utilisant une autre variable de type String
        String d = a + " " + b;

        // Affichage des chaînes de caractères
        System.out.println("String 1: " + a);
        System.out.println("String 2: " + b);
        System.out.println("String 3: " + c);
        System.out.println("String 4: " + d);
    }
}
