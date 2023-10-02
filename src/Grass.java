public class Grass extends Pokemon {
    public Grass(String name, int level, String sound) {
        super(name, level, sound);
    }

    @Override
    public void eats() {
        System.out.println(getName() + " Eats grass-berry");
    }

    public void weakness() {
        System.out.println(getName() + " Has a weakness to fire-type");

    }

    public void strongAgainst() {
        System.out.println(getName() + "is strong against water-type");
    }

}
