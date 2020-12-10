package ru.geekbrains.Lesson.home_work.task_3;

import ru.geekbrains.Lesson.home_work.task_3.fruits.Apple;
import ru.geekbrains.Lesson.home_work.task_3.fruits.Fruit;
import ru.geekbrains.Lesson.home_work.task_3.fruits.Orange;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>(new Apple (1.0f));
        Box<Apple> appleBox2 = new Box<>(new Apple (1.0f), new Apple (1.0f));
        Box<Orange> orangeBox1 = new Box<> (new Orange (1.5f), new Orange (1.5f));
        Box<Orange> orangeBox2 = new Box<> (new Orange (1.5f), new Orange (1.5f), new Orange (1.5f));
        Box<Fruit> fruitBox1 = new Box<>(); /*0*/
        Box<Fruit> fruitBox2 = new Box<>(); /*0*/

        appleBox1.shiftFruits (fruitBox1); /* +1*/
        appleBox2.shiftFruits (fruitBox1); /* +2*/
        System.out.println("Яблок в коробке: " + fruitBox1.getFruitsQuantity () + " шт."); /* Итого 3 шт.*/

        fruitBox1.addFruits (new Apple (1.0f), new Apple (1.0f)); /* +2*/
        System.out.println("Яблок в коробке стало: " + fruitBox1.getFruitsQuantity () + " шт."); /* Итого 5 шт.*/

        orangeBox1.shiftFruits (fruitBox2);/* +2*/
        orangeBox2.shiftFruits (fruitBox2);/* +3*/
        System.out.println("Апельсинов в коробке: " + fruitBox1.getFruitsQuantity () + " шт."); /* Итого 5 шт.*/

        System.out.println ("Количество фруктов в коробках одинаковое? -  " + fruitBox1.compareQuantity (fruitBox2));
        System.out.println ("Вес коробок одинаковый? -  " + fruitBox1.compareBoxes (fruitBox2));




    }
}
