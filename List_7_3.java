//        #3 Реализовать метод, который принимает на вход список элементов любого типа данных,
//        создает список из 100 элементов заполненный элементами из переданного списка в
//        случайном порядке (Загуглить генерация случайных чисел Java)


import java.awt.*;
import java.awt.geom.*;
import java.util.Collections;
import java.util.LinkedList;

import static java.util.List.of;

public class List_7_3 {

    public static void main(String[] args) {

        // создаём различные объекты
        Man manObj = new Man() {void anonim() {}};
        Object objObj = new Object() {void object() {}};
        Integer intObj = new Integer("85");
        List listObj = new List(3, true);
        Shape shabeObj = new Line2D.Float();
        User<?,?> userObj = new User<>("run", 34);
        Exception excObj = new Exception("Ошибка");

        // инициализируем коллекцию и добавляем в неё элементы
        LinkedList<Object> collect = new LinkedList<>();
        collect.add(manObj);
        collect.add(objObj);
        collect.add(intObj);
        collect.add(listObj);
        collect.add(shabeObj);
        collect.add(userObj);
        collect.add(excObj);
        collect.add("Слово");
        collect.add(123);
        collect.add(true);
        collect.add(null);

        //перемешаем все элементы коллекции
        Collections.shuffle(collect);

        print100(collect);
        System.out.println("\nНа основе этой коллекции создадим новую из 100 элементов, заполненную случайным образом.\n");



        // инициализируем новый список из объектов любого типа
        LinkedList<Object> hundredList = new LinkedList<>();


        // на основе коллекции collect создадим коллекцию из 100 элементов любого типа,
        // занося в неё элементы первой случайным образом
        add100(collect, hundredList);


        //перемешаем коллекцию
        Collections.shuffle(hundredList);

        // распечатка коллекции
        print100(hundredList);

    }

    // метод заполнения коллекции из другой случайным образом
    public static void add100(LinkedList col1, LinkedList col2) {
            for (int i = 0; i < 100; ++i) {
                int n = ( int )Math.round((col1.size()-1)*Math.random());
                col2.add(col1.get(n));
            }
    }

    // распечатка элементов коллекции
    public static void print100(LinkedList col){
        System.out.println("Коллекция имеет следующие элементы:");
        int i=0;
        for (Object l: col) {
            System.out.println(++i + "  " + l);
        }
    }

    static class Man {}
}