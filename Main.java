public class Main {
    public static void main(String[] args) {

        // --- Création des Pokémon ---
        Pokemon salameche = new PokemonFeu("Salamèche", 100, 20);
        Pokemon carapuce = new PokemonEau("Carapuce", 120, 20);
        Pokemon bulbizarre = new PokemonPlante("Bulbizarre", 90, 25);

        // --- État initial ---
        System.out.println("=== ÉTAT INITIAL ===");
        System.out.println(salameche);
        System.out.println(carapuce);
        System.out.println(bulbizarre);

        System.out.println("\n=== COMBAT ===");

        // --- Attaques ---
        try {
            salameche.attaquer(carapuce);   // Feu vs Eau → ×0.5
            carapuce.attaquer(salameche);   // Eau vs Feu → ×2
            bulbizarre.attaquer(carapuce);  // Plante vs Eau → ×2
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        // --- État final ---
        System.out.println("\n=== ÉTAT FINAL ===");
        System.out.println(salameche);
        System.out.println(carapuce);
        System.out.println(bulbizarre);
    }
}
