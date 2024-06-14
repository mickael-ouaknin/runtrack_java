public class Facture {
    public static void main(String[] args) {

        double prix = 49.99;
        int quantite = 3;

        double totalHT = prix * quantite;
        System.out.println(totalHT); 

        double TVA = 0.20;
        double montantTVA = totalHT * TVA;
        double totalTTC = totalHT + montantTVA;

        System.out.println(montantTVA); 

        System.out.println(totalTTC);
    }
}
