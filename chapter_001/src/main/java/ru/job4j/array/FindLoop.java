package ru.job4j.array;

public class FindLoop {
    /**
     * FindLoop.indexOf(int[] data, int el) при добавлении массива, функция ищет в этом масиве индекс значения el
     * @param data массив в котором будет находиться объект
     * @param el объект который нужно найти
     * @author yura yankovski(mailto:boets003@mail.ru)
     * @version 1.
     */
        public static int indexOf (int[] data, int el){
            int rst = -1;
            for(int index = 0; index <= data.length ; index++){
                if(data[index] == el){
                    rst = index;
                    break;
                }
            }return rst;
            //System.out.println(rst);

        }
//    public static void main(String[] args){
//            int[] data = {1, 2, 3};
//            FindLoop.indexOf(data, 2);
//    }
}
//public class FindLoop {
//    public int indexOf(int[] data, int el) {
//        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
//        for (...) {
//            if (data[index] == el) {
//                rst = index;
//                break;
//            }
//        }
//        return rst;
//    }
//}