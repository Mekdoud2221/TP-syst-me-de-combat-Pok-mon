public class Pokemon {
    private String nom;
    private int hp;
    private int atk;

    // Constructeur
    public Pokemon(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setAtk(int atk) {
        if (atk < 0) atk = 0;
        this.atk = atk;
    }

    public boolean isDead() {
        return hp <= 0;
    }

    // Méthode d'attaque
    public void attaquer(Pokemon cible) {
        int degats = this.atk;
        cible.setHp(cible.getHp() - degats);
        System.out.println(this.nom + " attaque " + cible.getNom() + " et inflige " + degats + " dégâts.");
        if (cible.isDead()) {
            System.out.println(cible.getNom() + " est KO !");
        }
    }

    @Override
    public String toString() {
        return nom + " | HP: " + hp + " | ATK: " + atk;
    }
}
