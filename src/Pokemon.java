public abstract class Pokemon {

//    Hieronder 3 variabelen op private
    private String name;
    private int level;
    private String sound;

//    Hieronder constructor
public Pokemon(String name, int level, String sound) {
    this.name = name;
    this.level = level;
    this.sound = sound;

}


//    Hieronder 2 methodes
    public abstract void eats();


    public String getName() {
        return name;
    }



    //    Hieronder getters & setters
    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void speak(){
        System.out.println(sound);








    }



    }




