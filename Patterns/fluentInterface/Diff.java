package fluentInterface;

public class Diff {
    public static void main(String[] args) {
        //Работа с объектом, не реализующим fluent interface
        NotFluentRequest notFluentRequest = new NotFluentRequest();
        notFluentRequest.setAge(20);
        notFluentRequest.setGender("Man");
        notFluentRequest.setName("Bob");
        notFluentRequest.setPhone("999-999");
        notFluentRequest.writeRequest();


        //Работа с объектом, реализующим fluent interface
        FluentRequest fluentRequest = new FluentRequest();
        fluentRequest.setAge(35)
                .setGender("Woman")
                .setName("Mary")
                .setPhone("787-878")
                .writeRequest();
    }
}
