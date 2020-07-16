package stepDef;

import io.cucumber.java.ru.А;
import io.cucumber.java.ru.Пусть;

import java.util.HashMap;

public class StepDef {
    private static HashMap<String,Object> storage = new HashMap<>();
    @Пусть("у меня есть {int} огурца")
    public static void getMyCukes(int num){
        storage.put("Мои огурцы",num);
    }

    @А("^у тебя (\\d+) огурца$")
    public static void getYourCukes(int num){
        storage.put("Твои огурцы",num);
    }

}
