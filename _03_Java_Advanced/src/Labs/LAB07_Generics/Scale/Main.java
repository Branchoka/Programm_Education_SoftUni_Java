package LAB07_Generics.Scale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(12,11);
        System.out.println(scale.getHeavier());
    }
}
