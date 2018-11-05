package ru.job4j.loop;


public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) { // продолжать цикл пока он меньше высоты
            for (int y = 0; y < width; y++) { // продолжать цикл пока он меньше ширины
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X

                if ((i + y) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
        //System.out.println(screen);

    }

//    public static void main(String[] args) {
//        Board aa = new Board();
//        Board.paint(3, 3);

    }
//}


/*
x x
 x
x x
 */