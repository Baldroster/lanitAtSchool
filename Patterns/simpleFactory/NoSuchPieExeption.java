package simpleFactory;

public class NoSuchPieExeption extends RuntimeException {
    NoSuchPieExeption (String typeOfPie){
        super("Пирог "+typeOfPie+" не существует");
    }
}
