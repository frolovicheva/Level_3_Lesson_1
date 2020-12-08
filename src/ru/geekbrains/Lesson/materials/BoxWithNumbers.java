package ru.geekbrains.Lesson.materials;

public class BoxWithNumbers<T extends Number> {
    private T[] arr;

    public BoxWithNumbers(T... arr) {
        this.arr = arr;
    }

    public double avg() {
        double d = 0.0;
        for (int i = 0; i < arr.length; i++) {
            d += arr[i].doubleValue();
        }
        d /= arr.length;
        return d;
    }

    public boolean sameAvg(BoxWithNumbers<?> another) {
        return Math.abs(avg() - another.avg()) < 0.00001;
        // avg() == another.avg()
    }
}
