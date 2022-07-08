public final class Snake extends Reptile {
    private int length;
    private String isItPoisonous;

    public int getLength() {
        return length;
    }

    public String isItPoisonous() {
        return isItPoisonous;
    }

    public Snake(String name, String gender, Colour bodyСolor, Eyes eyes, String isHaveScale, String isCanSwim, String isItPredator, int length, String isItPoisonous) {
        super(name, gender, bodyСolor, eyes, isHaveScale, isCanSwim, isItPredator);
        this.length = length;
        this.isItPoisonous = isItPoisonous;
    }

    @Override
    public String info(){
        return super.info() + "\nДлина: " + length + " метра " + " \nЯдовитая ли: " +isItPoisonous;
    }
    @Override
    void age(int age){
        System.out.println("Возраст этой змеи: " + age + " лет");
    }
}
