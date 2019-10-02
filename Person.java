package sk.itsovy.family.lukas;

public class Person {
    private String name;
    private int age;
    private boolean gender; // T...man, F ... female
    private double height;
    private int weight;
    private char status; // S, M, D, W
    private Mobile mobile; // default
    private Calculator calculator;

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public boolean hasCalculator() {
        return calculator!=null;
    }

    public void about () {
        System.out.println("Hello. I am class Person. Have a nice day");

    }
    public double calculateBMI() {
        double bmi;
        bmi=weight/ (height*height);
        return bmi;

    }

    public String getBMIStatus() {
        if ( calculateBMI() < 20)
            return "underweight";
        if ( calculateBMI() < 25)
            return "optimal";
        if (calculateBMI() < 30 )
            return "overweight";

        return "obesity";
    }
    public int getBirthYear () {
        return 2019 - age;    };

    public void setName(String meno) {
        name = meno;
    }

    public void setAge(int vek) {
        age = vek;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getAge() {
        return this.age;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
    public boolean hasMobilePhone () {
        if (mobile==null)
            return false;
        else
            return true;
    }
    public void print () {
        System.out.println("-----------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height/weight: "+height+"/"+weight);
        System.out.println("BMI: "+calculateBMI()+"("+getBMIStatus()+")");
        System.out.println("Gender: "+gender);
        System.out.println("Status: "+status);
        if (hasMobilePhone)
    }
}



