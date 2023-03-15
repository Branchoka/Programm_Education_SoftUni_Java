package Exercises06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E07_GroomingSalon {
    public static class Pet{
        private String name;
        private int age;
        private String owner;

        public Pet(String name, int age, String owner) {
            this.name = name;
            this.age = age;
            this.owner = owner;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        @Override
        public String toString() {
            return String.format("%s %d - (%s)",name,age,owner);
        }
    }
    public static class GroomingSalon{
        private List<Pet> data;
        private int capacity;

        public GroomingSalon(int capacity){
            this.capacity=capacity;
            this.data=new ArrayList<>();
        }
        public void add(Pet pet){
            if (this.data.size() < this.capacity){
                this.data.add(pet);
            }
        }
        public int getCount(){
            return this.data.size();
        }
        public boolean remove(String name){
            int index=findPetIndex(name);
            if (index!= -1){
                data.remove(index);
                return true;
            }
            return false;
        }
        public Pet getPet(String name,String owner){
            return this.data.stream().filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                    .findFirst().orElse(null);
        }
        private int findPetIndex(String name){
            for (int i = 0; i < this.data.size(); i++) {
                if (this.data.get(i).getName().equals(name)){
                    return i;
                }
            }
            return -1;
        }
        public String getStatistics(){
            StringBuilder builder=new StringBuilder("The grooming salon has the following clients:" + System.lineSeparator());

            for (Pet pet:data){
                builder.append(pet.getName().toString());
                builder.append(" ");
                builder.append(pet.getOwner().toString());
                builder.append(System.lineSeparator());
            }
            return builder.toString().trim();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

       GroomingSalon salon= new GroomingSalon(20);

        Pet dog=new Pet("Ellias", 5,"Tim");

        salon.add(dog);
        System.out.println(salon.remove("Ellias"));
        System.out.println(salon.remove("Pufa"));

        Pet cat=new Pet("Bella" , 2,"Mia");
        Pet bunny=new Pet("Zak", 4 , "Jon");

        salon.add(cat);
        salon.add(bunny);

        Pet pet=salon.getPet("Bella","Mia");
        System.out.println(pet);

        System.out.println(salon.getCount());

        System.out.println(salon.getStatistics());
    }
}
