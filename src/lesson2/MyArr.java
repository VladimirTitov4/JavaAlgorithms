package lesson2;

public class MyArr {
    private int[] arr;
    private int size;

    public MyArr(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.arr[i]);
        }
    }

    public void delete(int value) {
        int i = 0;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == value) break;
        }

        for (int j = i; j < this.size-1; j++) {
            this.arr[j] = this.arr[j+1];
        }
        this.size--;
    }

    public void insert(int value) {
        arr[this.size] = value;
        this.size++;
    }

    // Линейный поиск
    public boolean find(int value) {
        int i = 0;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == value) break;
        }
        return i != this.size;
    }

    // Двоичный поиск
    public boolean binaryFind(int value) {
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (value == this.arr[mid]) {
                return true;
            } else {
                if (value < this.arr[mid]) {
                    high = mid;
                } else {
                    low = high + 1;
                }
            }
        }
        return false;
    }
}
