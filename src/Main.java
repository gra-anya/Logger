import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner console = new Scanner(System.in);
        try {
            logger.log("Просим пользователя ввести входные данные для списка");
            System.out.print("Введите размер списка: ");
            int size = console.nextInt();
            System.out.print("Введите верхнюю границу для значений: ");
            int max = console.nextInt();

            logger.log("Создаём и наполняем список");
            List<Integer> source = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int temp = new Random().nextInt(max);
                source.add(temp);
            }
            System.out.print("Вот случайный список: ");
            source.forEach(x -> System.out.print(x + " "));
            System.out.println();

            logger.log("Просим пользователя ввести входные данные для фильтрации");
            System.out.print("Введите порог для фильтра: ");
            int treshold = console.nextInt();

            Filter filter = new Filter(treshold);
            logger.log("Запускаем фильтрацию");
            List<Integer> result = filter.filterOut(source);
            logger.log("Выводим результат на экран");

            System.out.print("Отфильтрованный список: ");
            result.forEach(x -> System.out.print(x + " "));
            System.out.println();

            logger.log("Завершаем программу");
        } catch (InputMismatchException e){
            logger.log("Пользователь ввел не числовое значение. Программа завершена с ошибкой");
            throw new InputMismatchException();
        }
    }
}