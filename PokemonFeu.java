public class PokemonFeu extends Pokemon {

    public PokemonFeu(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public void attaquer(Pokemon p) {

        if (p == null) {
            throw new IllegalArgumentException("Le Pokémon cible n'existe pas");
        }

        if (this.isDead()) {
            throw new IllegalStateException(nom + " est KO et ne peut pas attaquer");
        }

        if (p.isDead()) {
            throw new IllegalStateException(p.nom + " est déjà KO");
        }

        double multiplicateur = 1.0;

        if (p instanceof PokemonPlante) {
            multiplicateur = 2.0;
        } else if (p instanceof PokemonEau || p instanceof PokemonFeu) {
            multiplicateur = 0.5;
        }

        int degats = (int) (atk * multiplicateur);
        p.hp -= degats;

        System.out.println(nom + " attaque " + p.nom + " et inflige " + degats + " dégâts");
    }
}
