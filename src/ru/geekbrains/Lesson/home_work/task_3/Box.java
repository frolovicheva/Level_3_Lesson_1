package ru.geekbrains.Lesson.home_work.task_3;

import ru.geekbrains.Lesson.home_work.task_3.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*      b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можете использовать ArrayList;
        d. Сделать метод getWeight() который высчитывает вес коробки,
        зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
        e. Внутри класса коробка сделать метод compare,
        который позволяет сравнить текущую коробку с той,
        которую подадут в compare в качестве параметра,
        true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
        (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
        соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
        g. Не забываем про метод добавления фрукта в коробку.*/

public class Box <T extends Fruit> {
    List <Fruit> fruitsInBox;

    public Box() {
        this.fruitsInBox = new ArrayList<> ();
    }

    public Box(T... fruits) {
        this.fruitsInBox = new ArrayList(Arrays.asList(fruits));
    }


    public float getBoxWeight() {
        float totalWeight = 0.0f;
        for (Fruit inBox : fruitsInBox) {
            totalWeight += inBox.getWeight ();
        }
        return totalWeight;
    }

    public int getFruitsQuantity() {
        return fruitsInBox.size ();
    }

    public boolean compareBoxes (Box<?> secondBox) {
        return Math.abs(this.getBoxWeight ()- secondBox.getBoxWeight ()) < 0.001;

    }
    public boolean compareQuantity (Box<?> secondBox) {
        return this.fruitsInBox.size() - secondBox.fruitsInBox.size () == 0;

    }

    public void shiftFruits(Box<? super T> secondBox){
        if(secondBox == this){
            return;
        }
        secondBox.fruitsInBox.addAll(this.fruitsInBox);
        this.fruitsInBox.clear();
    }

    public void addFruits(T... fruits){
        fruitsInBox.addAll (Arrays.asList(fruits));
    }




}
