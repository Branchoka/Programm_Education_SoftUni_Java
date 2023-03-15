package Exercises06_Defining_Classes.E01_Opinion_Poll;

public class Opinion_Poll {
   private String name;
   private int age;

    public Opinion_Poll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    @Override
    public String toString() {

        return name + " - " + age;
    }
}
