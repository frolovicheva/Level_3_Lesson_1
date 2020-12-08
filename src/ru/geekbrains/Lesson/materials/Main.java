package ru.geekbrains.Lesson.materials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numberList = new ArrayList<>(Arrays.asList(10, 20, 30));
//        System.out.println(sumOfList(numberList));
//
//        int x = getFirstElement(numberList);

//        Collections.copy();

        exBoxGen();
        exBoxWithNumbers();

    }

    public static <T> T getFirstElement(List<T> list){
        return list.get(0);
    }

    public static double sumOfList(List<? extends Number> numberList) {
        double d = 0.0;
        for (int i = 0; i < numberList.size(); i++) {
            d += numberList.get(i).doubleValue();
        }
        return d;
    }

    private static void exBoxWithNumbers() {
        BoxWithNumbers<Float> boxFloat1 = new BoxWithNumbers<>(1.0f, 2.0f, 3.0f);
        BoxWithNumbers<Float> boxFloat2 = new BoxWithNumbers<>(1.0f, 2.0f, 3.0f);

        BoxWithNumbers<Integer> boxInteger = new BoxWithNumbers<>(1, 2, 3);

        System.out.println(boxFloat1.avg());
        System.out.println(boxFloat2.avg());
        System.out.println(boxFloat1.sameAvg(boxFloat2));

        System.out.println(boxInteger.avg());
        System.out.println(boxFloat1.sameAvg(boxInteger));
    }

    private static void exBoxGen() {
        BoxGen<Integer> bgi1 = new BoxGen<>(10);
        BoxGen<Integer> bgi2 = new BoxGen<>(20);

        int sum = bgi1.getObj() + bgi2.getObj();
        System.out.println(sum);

        BoxGen<String> bs = new BoxGen<>("java");

        System.out.println(bgi1.getClass());
        System.out.println(bs.getClass());
    }

    private void exSimpleBox() {
        SimpleBox box1 = new SimpleBox(10);
        SimpleBox box2 = new SimpleBox(20);

        ///
        box1.setObj(78);
        ///
        if (box1.getObj() instanceof Integer && box2.getObj() instanceof Integer) {
            int sum = (int) box1.getObj() + (int) box2.getObj();
            System.out.println(sum);
        }
    }
}
