public class Main {
    public static void main(String[] args) {
        Eyes eyes = new Eyes("�������","��������");
        Reptile crocodile = new Reptile("��������","�������",Colour.Green,eyes,"���",
                "��","�� ");
        System.out.println(crocodile.info());
        crocodile.age();
        crocodile.age(5);
        Snake cobra = new Snake("�����","�������",Colour.Black,eyes,"��","��","��",4,"��");
        System.out.println(cobra.info());
        cobra.age();
        cobra.age(20);
        Snake python = new Snake("�����", "�������",Colour.White,eyes,"��","��","��",7,"���");
        System.out.println(python.info());
        python.age();
        python.age(13);
    }
}