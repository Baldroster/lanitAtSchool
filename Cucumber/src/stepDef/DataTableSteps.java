package stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.bg.И;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class DataTableSteps {
    @И("посчитаем количество огурцов")
    public void cuke(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps();
        dataTable.forEach(row -> {
            switch (row.get("Операция")) {
                case "Сложение":
                    System.out.println("Огурцов у меня:" + row.get("Мои огурцы") + ", огурцов у тебя: " + row.get("Твои огурцы") + " " + row.get("Операция") + " = " + (Integer.parseInt(row.get("Мои огурцы")) + Integer.parseInt(row.get("Твои огурцы"))));
                    break;
                case "Разница":
                    System.out.println("Огурцов у меня:" + row.get("Мои огурцы") + ", огурцов у тебя: " + row.get("Твои огурцы") + " " + row.get("Операция") + " = " + Math.abs(Integer.parseInt(row.get("Мои огурцы")) - Integer.parseInt(row.get("Твои огурцы"))));
                    break;
            }
        });
    }
}
