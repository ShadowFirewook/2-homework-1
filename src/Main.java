public class Main {
    public static void main(String[] args) {
        Eyes eyes = new Eyes("зеленый","овальная");
        Reptile crocodile = new Reptile("Крокодил","Мужской",Colour.Green,eyes,"нет",
                "да","да ");
        System.out.println(crocodile.info());
        crocodile.age();
        crocodile.age(5);
        Snake cobra = new Snake("Кобра","Женская",Colour.Black,eyes,"да","да","да",4,"да");
        System.out.println(cobra.info());
        cobra.age();
        cobra.age(20);
        Snake python = new Snake("Питон", "Мужской",Colour.White,eyes,"да","да","да",7,"нет");
        System.out.println(python.info());
        python.age();
        python.age(13);
    }
}
