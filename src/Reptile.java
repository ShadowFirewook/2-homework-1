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

    public Reptile(String name, String gender, Colour bodyСolor, Eyes eyes, String isHaveScale, String isCanSwim,String isItPredator) {
        super(name,  gender, bodyСolor, eyes);
        this.isHaveScale = isHaveScale;
        this.isCanSwim = isCanSwim;
        this.isItPredator = isItPredator;
    }
    @Override
    public String info(){
        return super.info() + " \nИмеет ли чешую: " + isHaveScale + " \nУмеет ли плавать: " + isCanSwim + " \nЯвляется ли хищником: " + isItPredator;
    }
    final void age(){
        System.out.println("Рептилии живут до 100 лет");
    }

    void age(int age){
        System.out.println("Возраст этой рептилии: " + age + " лет");
    }

}

