import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Cucumber/features",//путь до feature файлов
        glue = "stepDef",//название пакета с шагами
        tags = "@1" //Теги по которым будет запускаться сценарий
)
public class Test {
@org.junit.Test
    public static void run(String[] args) {

    }
}
