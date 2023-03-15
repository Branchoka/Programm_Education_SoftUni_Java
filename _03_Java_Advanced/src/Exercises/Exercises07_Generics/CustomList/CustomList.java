package Exercises07_Generics.CustomList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> elements;

    public CustomList(){
        this.elements = new ArrayList<>();
    }
    public void add(T element){
        this.elements.add(element);
    }
    public T remove(int index){
        return this.elements.remove(index);
    }
    public boolean contains(T element){
        return elements.contains(element);
    }
    public void swap(int firstIndex,int secondIndex){
        T firstIndexElement = this.elements.get(firstIndex);
        T secondIndexElement = this.elements.get(secondIndex);

        this.elements.set(firstIndex,secondIndexElement);
        this.elements.set(secondIndex,firstIndexElement);

    }
    public int countGreaterThan(T element) {
        return(int) elements.stream().filter(e->e.compareTo(element)>0)
                .count();
    }
    public T getMax(){
        return elements.stream()
                .max(Comparator.naturalOrder()).get();
    }
    public T getMin(){
        return elements.stream().min((e1,e2) -> e1.compareTo(e2)).get();
    }
    public void print(){
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
