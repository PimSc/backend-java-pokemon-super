public class main {
    public static void main(String[] args) {

        Fire Charmander = new Fire("Charmander", 11, "Char-Char", true, false);



        Charmander.eats();
        System.out.println(Charmander.getName() + " " + Charmander.getSound() + "" + Charmander.isHasTrainer());
        Charmander.setSound("char-char");
        System.out.println(Charmander.getSound());

        Electric Pikachu = new Electric("Pikachu", 14, "picka-picka");

        Pikachu.sleep();

        Electric Pichu = new Electric("Pichu", 7, "chu-chu");

        Pichu.sleep();



    }
}
