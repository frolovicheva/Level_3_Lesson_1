package ru.geekbrains.Lesson.materials;


//T type, E element, K key, V value, N number


public class BoxGen<T> {

T obj;

    public BoxGen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}