public class Electric extends Pokemon{

    public Electric(String name, int level, String sound) {
        super(name, level, sound);
    }

    @Override
    public void eats() {
        System.out.println(getName() + " Eats electric-berry");
    }

    public void weakness() {
        System.out.println(getName() + " Has a weakness to ground-type");

    }

    public void strongAgainst() {
        System.out.println(getName() + "is strong against water-type");
    }

    public void sleep() {
        System.out.println(getName() + " sleeps 2 hours a day");
    }

}
