public class Reptile extends Animal {
    private String isHaveScale;
    private String isCanSwim;
    private String isItPredator;

    public int age = 0;

    public String isHaveScale() {
        return isHaveScale;
    }

    public String isCanSwim() {
        return isCanSwim;
    }

    public String isItPredator() {
        return isItPredator;
    }

    public Reptile(String name, String gender, Colour body�olor, Eyes eyes, String isHaveScale, String isCanSwim,String isItPredator) {
        super(name,  gender, body�olor, eyes);
        this.isHaveScale = isHaveScale;
        this.isCanSwim = isCanSwim;
        this.isItPredator = isItPredator;
    }
    @Override
    public String info(){
        return super.info() + " \n����� �� �����: " + isHaveScale + " \n����� �� �������: " + isCanSwim + " \n�������� �� ��������: " + isItPredator;
    }
    final void age(){
        System.out.println("�������� ����� �� 100 ���");
    }

    void age(int age){
        System.out.println("������� ���� ��������: " + age + " ���");
    }

}
