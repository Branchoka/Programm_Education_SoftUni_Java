package LAB07_Generics.ArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    public static <T> T[] create(int length,T item){
        T[] array = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }
    public static <T> T[] create(Class<T> toClass,int length,T item) {
        T[] array = (T[]) Array.newInstance(toClass, length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }
}
