public class Animal {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }

    public Colour getBody�olor() {
        return body�olor;
    }

    public Eyes getEyes() {
        return eyes;
    }

    private Colour body�olor;
    private Eyes eyes;

    public Animal(String name, String gender, Colour body�olor, Eyes eyes) {
        this.name = name;
        this.gender = gender;
        this.body�olor = body�olor;
        this.eyes = eyes;
    }

    public String info(){
        return "\n���: " + name + " \n���: " + gender + " \n����: " + body�olor + " \n���� ����: " + eyes.getColour() + " \n����� ����: " + eyes.getForm();
    }
}
