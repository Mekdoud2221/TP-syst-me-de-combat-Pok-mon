public class Main {
    public static void main(String[] args) {

        Pokemon salameche = new PokemonFeu("Salamèche", 100, 20);
        Pokemon carapuce = new PokemonEau("Carapuce", 100, 20);
        Pokemon bulbizarre = new PokemonPlante("Bulbizarre", 100, 20);

        System.out.println("=== ÉTAT INITIAL ===");
        System.out.println(salameche);
        System.out.println(carapuce);
        System.out.println(bulbizarre);

        System.out.println("\n=== COMBAT ===");

        try {
            salameche.attaquer(carapuce);
            carapuce.attaquer(salameche);
            bulbizarre.attaquer(carapuce);
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("\n=== ÉTAT FINAL ===");
        System.out.println(salameche);
        System.out.println(carapuce);
        System.out.println(bulbizarre);
    }
}
