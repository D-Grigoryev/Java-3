import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);

        ChangeElements changeElements = new ChangeElements();
        String [] arr = {"111", "222", "333", "444"};
        System.out.println("Массив до замены элементов: "+Arrays.toString(arr));
        changeElements.ChangeArr(arr,1,2);
        System.out.println("Массив после замены элементов: "+Arrays.toString(arr));

        //2. Написать метод, который преобразует массив в ArrayList;

        //changeElements.convertToArrayList(arr);
        for (Object s:  changeElements.convertToArrayList(arr)) { //Наглядная элюстрация работы метода
            System.out.println(s);
        }

        //        3. Большая задача:
//
//        a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//        b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//        d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
//        (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//        e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
//        которую подадут в compare в качестве параметра, true - если их веса равны,
//        false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
//        (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается,
//        а в другую перекидываются объекты, которые были в этой коробке;
//        g. Не забываем про метод добавления фрукта в коробку.

        Apple apple = new Apple(); //Создаем первое яблоко
        Apple apple1 = new Apple(); //Создаем второе яблока
        Orange orange = new Orange(); //Создаем апельсин
        Orange orange1 = new Orange(); //Создаем второй апельсин

        Box<Orange> orangeBox = new Box<>();//Создем коробку для апельсинов
        Box <Apple> appleBox = new Box<>(); //Создаем Коробку для яблок
        Box <Apple> appleBox1 = new Box<>(); //Создаем вторую коробку для яблок

        appleBox.setBox(apple); //Кладем в коробку 1-е яблока
        appleBox.setBox(apple1); //Кладем в коробку 2-е яблока
        appleBox1.setBox(apple); //Кладем яблоко во вторую коробку
        // appleBox.setBox(orange); // Пытаемся добавить в коробку с яблоками апельсин. Не будет скомпилировано.

        orangeBox.setBox(orange); // Кладем в коробку 1-й апельсин
        orangeBox.setBox(orange1); //Кладем в коробку 2-й апельсин

        appleBox.getWeight(); //Вычисляем вес коробки яблок исходя из количества фруктов в ней
        orangeBox.getWeight(); //Вычисляем вес коробки апельсин исходя из количества фруктов в ней

        appleBox.compare(appleBox); //Сравниваем вес коробок
        appleBox.compare(orangeBox);

        //appleBox.toSprinkle(orangeBox); //Пытаемся пересыпать яблоки в коробку с апельс инами. Не будет скомпилировано
        appleBox.toSprinkle(appleBox1); //Пересыпаем яблоки из одной коробки в другую

        appleBox1.getWeight();
        appleBox.getWeight();

        System.out.println(appleBox.getBox());
        System.out.println(appleBox1.getBox());
        System.out.println(orangeBox.getBox());


    }
}

