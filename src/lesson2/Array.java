package lesson2;

public class Array {
    private int[] arr;
    private int size;

    public Array(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    void insert(int value) {
        if (size >= arr.length-1) {
            int[] tempArr = arr;
            arr = new int[size * 2];
            System.arraycopy(tempArr, 0, arr, 0, size);
        }
        arr[size++] = value;
    }
}
