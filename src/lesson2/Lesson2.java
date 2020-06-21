package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        MyArr myArr = new MyArr(10);

        myArr.insert(5);
        myArr.insert(5);
        myArr.insert(5);
        myArr.insert(5);
        myArr.insert(5);
        myArr.insert(7);
        myArr.insert(1);
        myArr.insert(8);
        myArr.insert(2);
        myArr.insert(2);

        System.out.println("Выводим массив");
        myArr.display();
    }
}
