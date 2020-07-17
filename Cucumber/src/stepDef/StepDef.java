package stepDef;

import io.cucumber.java.ru.А;
import io.cucumber.java.ru.Пусть;

import java.util.HashMap;

public class StepDef {
    private static HashMap<String, Integer> storage = new HashMap<>();

    @Пусть("у меня есть {int} огурца")
    public static void getMyCukes(int num) {
        System.out.println("Мои огурцы " + num + "\n");
        storage.put("Мои огурцы", num);
    }

    @А("^у тебя (\\d+) огурца$")
    public static void getYourCukes(int num) {

        System.out.println("Твои огурцы " + num + "\n");
        storage.put("Твои огурцы", num);
    }

    @А("сосчитать сколько всего у нас огурцов")
    public static void countSum() {
        System.out.println("Сумма огурцов: " + (storage.get("Мои огурцы") + storage.get("Твои огурцы")) + "\n");
    }

    @А("сосчитать нашу разницу в огурцах")
    public static void countSub() {
        System.out.println("Разница огурцов: " + Math.abs(storage.get("Мои огурцы") - storage.get("Твои огурцы")) + "\n");
    }
}
