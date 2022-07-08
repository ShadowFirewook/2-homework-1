public class Animal {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }

    public Colour getBodyÑolor() {
        return bodyÑolor;
    }

    public Eyes getEyes() {
        return eyes;
    }

    private Colour bodyÑolor;
    private Eyes eyes;

    public Animal(String name, String gender, Colour bodyÑolor, Eyes eyes) {
        this.name = name;
        this.gender = gender;
        this.bodyÑolor = bodyÑolor;
        this.eyes = eyes;
    }

    public String info(){
        return "\nÂèä: " + name + " \nÏîë: " + gender + " \nÖâåò: " + bodyÑolor + " \nÖâåò ãëàç: " + eyes.getColour() + " \nÔîðìà ãëàç: " + eyes.getForm();
    }
}
 
