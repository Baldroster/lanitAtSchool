package fluentInterface;

public abstract class Request {
String name;
int age;
String gender;
String phone;

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


    public void writeRequest(){
        System.out.println(toString());
}

}
