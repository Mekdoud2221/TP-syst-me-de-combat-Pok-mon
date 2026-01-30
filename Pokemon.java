public class Pokemon {

    protected String nom;
    protected int hp;
    protected int atk;

    public Pokemon(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    public boolean isDead() {
        return hp <= 0;
    }

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

        p.hp -= atk;
    }

    @Override
    public String toString() {
        return nom + " | HP: " + hp + " | ATK: " + atk;
    }
}
