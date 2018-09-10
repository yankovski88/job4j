package ru.job4j.condition;

/**
 * В этом классе мы создали поля.
 *
 * @author yura yankovski mailto:
 * @version $Id$
 * @since 0.1
 *
 */
public class Point {
    public int x;
    public int y;
    /**
     *
     * и конструктор.
     */
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     *измеряет расстояние
     */
    public double distanceTo (Point that) {
        // Точка А - это текущая точка. К ней мы обращаемся через оператор this.
       // Point a = this;
        // Точка В - это входящая точка. К ней мы можем обратиться напрямую через имя переменной that.
        // или для удобства мы создали новую переменную b и к ней присвоили переменную that.
        //Point b = that;
        // сделаем вывод на консоль.
        //int x1 = a.x;
        //int y1 = a.y;
        //int x2 = b.x;
        //int y2 = b.y;
       return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        // сделаем вызов метода
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
