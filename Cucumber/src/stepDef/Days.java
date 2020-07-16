package stepDef;

public enum Days {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    Пятница("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресение");
    public String value;

    public String getValue() {
        return value;
    }



     Days(String value) {
        this.value = value;
    }
}
