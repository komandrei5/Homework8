package app;

public class MyList {
    private static final int INITIAL_VALUE = 1;
    private String[] array;
    private int size;

    public MyList() {
        array = new String[INITIAL_VALUE];
        size = 0;
    }

    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            return false;
        }

        if (size == array.length) {
            resizeArray();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = value;
        size++;
        return true;
    }

    public boolean add(String value) {
        return add(size, value);
    }

    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;
        return true;
    }

    public boolean delete(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return delete(i);
            }
        }
        return false;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    private void resizeArray() {
        int newCapacity = array.length * 2;
        String[] newArray = new String[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public String[] getArray() {
        return array;
    }
}