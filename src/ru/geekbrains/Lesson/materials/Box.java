package ru.geekbrains.Lesson.materials;

public class Box implements Comparable<Box> {
    private int size;

    public Box(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Box o) {
        return this.size - o.size;
    }

    //    @Override
//    public int compareTo(Object o) {
//        if(this == o){
//            return 0;
//        }
//        if( !(o instanceof Box)){
//            throw new RuntimeException();
//        }
//
//        Box another = (Box)o;
//        return this.size- another.size;
//    }


}
