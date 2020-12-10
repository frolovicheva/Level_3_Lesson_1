package ru.geekbrains.Lesson.home_work;

//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {

        Integer[] intArr = {9, 10, 1984};
        String[] strArr = {"Day", "Month", "Year"};
        changeElementsInArr(intArr,1,3);
        changeElementsInArr(intArr,0,2);
        changeElementsInArr(strArr,0,2);

    }

    public static <T> void changeElementsInArr(T[] arr, int in, int out) {
        try {
        T memory = arr[in];
        arr[in] = arr[out];
        arr[out] = memory;
        } catch (IndexOutOfBoundsException e) {
            System.out.println ("Номера индексов указаны неверно");
        } finally {
            System.out.println (Arrays.toString (arr));
            System.out.println ();
        }
    }
}




