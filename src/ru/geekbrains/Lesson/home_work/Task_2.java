package ru.geekbrains.Lesson.home_work;

import java.util.*;

//2. Написать метод, который преобразует массив в ArrayList;
public class Task_2 {
    public static void main(String[] args) {
        Integer[][] intArr = {{1,2,3},{4,5}};
        String [][] strArr = {
                {"I","am"},
                {"your", "friend","Let's","go"}};

        System.out.println (arr2IntoArray (intArr));
        System.out.println (arr2IntoArray (strArr));

    }
    /*Попробовала написать метод, который преобразует двумерный массив*/

    private static  <T> ArrayList<T> arr2IntoArray(T[][] arr) {
      ArrayList<T> arrayList = new ArrayList<> ();
        for (T[] ts : arr) {
            arrayList.addAll (Arrays.asList (ts));
        }
        return arrayList;

    }

        public static <T> ArrayList<T> arrToArray(T[] arr) {
        return new ArrayList<> (Arrays.asList(arr));
    }

}
