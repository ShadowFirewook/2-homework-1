public class Animal {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }

    public Colour getBodyColor() {
        return bodyÑolor;
    }

    public Eyes getEyes() {
        return eyes;
    }

    private Colour bodyColor;
    private Eyes eyes;

    public Animal(String name, String gender, Colour bodyColor, Eyes eyes) {
        this.name = name;
        this.gender = gender;
        this.bodyÑolor = bodyÑolor;
        this.eyes = eyes;
    }

    public String info(){
        return "\nВид: " + name + " \nПол: " + gender + " \nЦвет: " + bodyСolor + " \nЦвет глаз: " + eyes.getColour() + " \nФорма глаз: " + eyes.getForm();
    }
}
 
