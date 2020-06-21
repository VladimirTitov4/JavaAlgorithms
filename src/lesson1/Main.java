package lesson1;

public class Main {

    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{1, 2, 3, 4, 5, 6}));
        int[] arr = new int[]{1, 2, 3, 4, 5};
    }

    // Сложность алгоритма: O(n)
    public static int myPow(int target, int pow) {
        int source = target;
        for (int i = 1; i < pow; i++) {
            target *= source;
        }
        return target;
    }

    // Сложность алгоритма: O(2n) т.к. операций будет в 2 раза больше, на каждом шаге мы будем делать ещё одну проверку
    public static int myEvenPow(int target, int pow) {
        int count = 0;
        int source = target;
        for (int i = 1; i < pow; i++) {
            count++;
            if (i % 2 == 0) target *= source;
        }
        return target;
    }

    // Нахождение среднего арифметического в массиве
    // Сложность алгоритма: вроде бы тоже O(n)
    public static double findAverage(int[] arr) {
        int count = 0;
        for (int i : arr) {
            count += i;
        }
        return (double)count / arr.length;
    }

    // найти минимальный элемент рекурсивно
    public static int findMinRecursively(int[] arr) {
        int min = arr[0];
        for (int i : arr) {

        }
        return min;
    }
}
