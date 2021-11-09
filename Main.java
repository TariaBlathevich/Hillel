import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // Создала заранее массив
        int[] userID = { 123, 124, 125, 126, 127, 128, 129, 130};

        // Создала несвязный лист, там где элементы не ссылаются друг на друга
        ArrayList<Integer> list = new ArrayList<>();
        list.add(131);

        // Добавила массив в лист
        for (int element : userID) {
            list.add(element);
        }

        // Выводим итоговый лист
        System.out.println(list);
        
        // выводим отсортированный список юзров
        Collections.sort(list);
        System.out.println(list);

    }
}

