package telran.interviews;

import java.util.HashMap;

/**
 * All methods of the class should have complexity O(1)
 * @author User
 *
 * @param <T>
 */
public class MyArray<T> {
    private Object[] array; // Underlying array to store elements
    private HashMap<T, Integer> indexMap; // HashMap to track indexes

    public MyArray(int size) {
        array = new Object[size];
        indexMap = new HashMap<>();
    }

    /**
     * sets all array's elements with a given value
     * @param value
     */
    public void setAll(T value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        indexMap.clear();
        indexMap.put(value, 0);
    }

    /**
     * 
     * @param index
     * @return value at given index or null if index is wrong
     */
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= 0 && index < array.length) {
            return (T) array[index];
        }
        return null;
    }

    /**
     * sets a given value at a given index
     * throws IndexOutOfBoundsException in the case of wrong index
     * @param index
     * @param value
     */
    public void set(int index, T value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
            indexMap.put(value, index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }
}




//package telran.interviews;
//
//import java.util.HashMap;
//
///**
// * All methods of the class should have complexity O[1]
// * @author User
// *
// * @param <T>
// */
//public class MyArray<T> {
//	//TODO
//	public MyArray(int size) {
//		//TODO
//	}
//	/**
//	 * sets all array's elements with a given value
//	 * @param value
//	 */
//	public void setAll(T value) {
//		//TODO
//	}
//	/**
//	 * 
//	 * @param index
//	 * @return value at given index or null if index is wrong
//	 */
//	public T get(int index) {
//		//TODO
//		return null;
//	}
//	/**
//	 * sets a given value at a given index
//	 * throws IndexOutOfBoundsException in the case of wrong index
//	 * @param index
//	 * @param value
//	 */
//	public void set(int index, T value) {
//		//TODO
//	}
//}
