import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задание 1");

        // Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        // Код должен работать с любой последовательностью и объемом списка чисел.

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> resNums = new ArrayList<>(List.of());
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                resNums.add(nums.get(i));
            }
        }
        System.out.println(resNums);
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задание 2");

        // Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
        // Код должен работать с любой последовательностью и объемом списка чисел.

        List<Integer> nums = new ArrayList<>(List.of(-2, 1, 2, 3, 4, 4, 5, 5, 6, 8));
        List<Integer> resNums = new ArrayList<>(List.of());
        Collections.sort(nums);
        Integer a = nums.get(0);
        if (nums.get(0) % 2 == 0) {
            resNums.add(nums.get(0));
        }
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && nums.get(i) != nums.get(i - 1)) {
                resNums.add(nums.get(i));
            }
        }
        System.out.println(resNums);
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задание 3");
        // Напишите код, который выводит в консоль все уникальные слова из списка слов,
        // в котором могут встречаться дубли. В качестве отладочной информации возьмите
        // произвольный набор слов или текст, в котором встречаются повторения.

        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        List<String> stringsRes = new ArrayList<>(List.of());
        stringsRes.add(strings.get(0));
        for (int i = 0; i < strings.size(); i++) {
            if (!stringsRes.get(stringsRes.size() - 1).equals(strings.get(i))) {
                stringsRes.add(strings.get(i));
            }
        }
        System.out.println(stringsRes);
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задание 4");
        // Напишите код, который выводит в консоль количество дублей для каждого уникального слова.*/
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size() && i != j; j++) {
                if (strings.get(i).equals(strings.get(j))) {
                    counter++;
                    map.put(strings.get(i), counter);

                }
            }
            counter = 0;
        }
        System.out.println(map);
    }
}