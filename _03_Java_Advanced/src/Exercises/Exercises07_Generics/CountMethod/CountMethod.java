package Exercises07_Generics.CountMethod;


import java.util.ArrayList;
import java.util.List;

public class CountMethod<T extends Comparable<T>> {
    private List<T> elements;

    public CountMethod() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);

    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (T integer : elements) {
            sb.append(String.format("%s: %s",integer.getClass().getName(),integer)).append("\n");
        }
        return sb.toString();
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

}
