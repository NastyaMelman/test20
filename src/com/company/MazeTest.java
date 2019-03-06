package com.company;

import com.company.IRoomContent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MazeTest {
    public static void main(String[] args) {
        List newRooms = new ArrayList(10);

        IRoomContent roomContent = new IRoomContent();

        newRooms.add("Мрачное подземелье, голая кирпичная стена, обвалившийся местами потолок, несколько дверей ведущих в разных направлениях");
        newRooms.add("Видимо это бывшая оружейная комната. Но все давно проржавело и покрыто пылью");
        newRooms.add("Похоже здесь что-то хранили, деревянные полки, мешки");
        newRooms.add("Все в паутине, скорее бы выбраться в другую комнату");
        newRooms.add("Кап-кап-кап - раздается звук падающих капель. Сыро и мерзко");
        newRooms.add("Голые каменные стены, кажется здесь ничего нет");
        newRooms.add("Остатки мебели натолкнули на мысль что здесь когда то была комора");
        newRooms.add("Четыре стены, сухой воздух, ничего особенного");
        newRooms.add("Обычная комната четыре метра на четыре");
        newRooms.add("Эта комната больше чем обычно, но похоже в ней ничего нет");

        Random forRooms = new Random(0, newRooms.size() - 1);

        int life = 5;
        int sum = 0;

        while (true) {
            System.out.println("Куда Вы хотите пойти (с/ю/з/в)?");
            Scanner sc = new Scanner(System.in);
            String phrase = sc.nextLine();

            if (phrase.equals("с")) {
                System.out.println("Вы пошли на север");
            } else if (phrase.equals("ю")) {
                System.out.println("Вы пошли на юг");
            } else if (phrase.equals("в")) {
                System.out.println("Вы пошли на восток");
            } else if (phrase.equals("з")) {
                System.out.println("Вы пошли на запад");
            } else if (phrase.equals("конец")) {
                System.out.println("Игра окончена");
                return;
            } else {
                System.out.println("Неправильная буква");
                continue;
            }
            int random1 = forRooms.getRandom();
            System.out.println(newRooms.get(random1));

            life += roomContent.getContent();
            System.out.println("Life = " + life);

            if (life <= 0) {
                System.out.println("Ты умер, игра окончена, побробуй еще раз");
                break;
            }

            if (sum == 10) {
                System.out.println("Поздравляю, ты победил!!!");
                break;
            }
            sum++;
        }
        System.out.println("Хочешь узнать сколько комнат ты прошел?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equals("да")) {
            System.out.println("Количество комнат: " + sum);
        } else {
            System.out.println("Хорошего дня!");
            return;
        }
        System.out.println("Hello");
    }
}
