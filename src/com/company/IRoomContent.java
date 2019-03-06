package com.company;

public class IRoomContent {
    Monster monster = new Monster();
    Food poition = new Food();
    Random gen2 = new Random(0, 2);

    public int getContent() {
        System.out.print("Ты вошел в комнату, в которой ");
        int random2 = gen2.getRandom();
        if (random2 == 0) {
            System.out.println("монстр");
            return monster.getModificator();
        } else if(random2 == 1) {
            System.out.println("еда");
            return poition.getModificator();
        } else {
            System.out.println("пусто");
            return 0;
        }
    }
}