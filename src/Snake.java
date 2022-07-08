public final class Snake extends Reptile {
    private int length;
    private String isItPoisonous;

    public int getLength() {
        return length;
    }

    public String isItPoisonous() {
        return isItPoisonous;
    }

    public Snake(String name, String gender, Colour body�olor, Eyes eyes, String isHaveScale, String isCanSwim, String isItPredator, int length, String isItPoisonous) {
        super(name, gender, body�olor, eyes, isHaveScale, isCanSwim, isItPredator);
        this.length = length;
        this.isItPoisonous = isItPoisonous;
    }

    @Override
    public String info(){
        return super.info() + "\n�����: " + length + " ����� " + " \n�������� ��: " +isItPoisonous;
    }
    @Override
    void age(int age){
        System.out.println("������� ���� ����: " + age + " ���");
    }
}
