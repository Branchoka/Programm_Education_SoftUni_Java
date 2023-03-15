package LAB07_Generics.Scale;

public class Scale <T extends Comparable<T>>{
    private T right;
    private T left;

    public Scale(T right, T left) {
        this.right = right;
        this.left = left;
    }
    public T getHeavier(){
        if (left.compareTo(right) == 0){
            return null;
        }else if (left.compareTo(right) > 0){
            return left;
        }else {
            return right;
        }
    }
}
