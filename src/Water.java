public class Water extends Pokemon{
    public Water(String name, int level, String sound) {
        super(name, level, sound);
    }

    @Override
    public void eats() {

        System.out.println(getName() + " Eats water-berry");
    }


    public void weakness() {
        System.out.println(getName() + " Has a weakness to electric-type");

    }

    public void strongAgainst() {
        System.out.println(getName() + "is strong against fire-type");
    }




}
