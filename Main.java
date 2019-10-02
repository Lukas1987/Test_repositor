package sk.itsovy.family.lukas;

import sk.itsovy.mati.other.FreeClass;

public class Main {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person();

        Person person2=new Person();

        person1.setName("Dominik");
        person2.setName("Lucia");
        person1.setAge(25);
        System.out.println(person1);
        System.out.println(person2);
        person1.setHeight(1.83);
        person1.setWeight(105);

        Mobile mobile1=new Mobile();
        mobile1.setBrand("Huawei");
        mobile1.setModel("P30");
        mobile1.setPhoneNumber("456456456");

        Mobile mobile2=new Mobile("Samsung", "S9", "456465465");

        person1.about();
        System.out.println("Your BMI: "+person1.calculateBMI() );
        System.out.println ("Result: " + person1.getBMIStatus());
        System.out.println ("Birthyear: " + person1.getBirthYear());
        System.out.println("Person 1 is " +person1.getAge()+" Yo");

        Person student=new Person(name"Oliver", age 19, height 1.88, weight 97, gender: true, status ´s´);
        student.setMobile(mobile2);

        if (student.hasMobilePhone())
            System.out.println("Phone number: "+person1.getMobile());
        else
            System.out.println("Student has no mobile !");
        Calculator casio=new Calculator("Casio PX552");
        person2.setCalculator(casio);

        if(person2.hasCalculator()) {
            casio.turnOn();
            System.out.println(person2.getCalculator().add(58,77));
            System.out.println(person2.getCalculator().convertDecimalToBinary(85473));
        }
        FreeClass fc = new FreeClass();
        fc.sayNHallo(3);
        fc.test();
        for(int i=10;i<100;i++){
            System.out.println(if" ");
        }

        }
    }
}
