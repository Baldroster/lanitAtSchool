package fluentInterface;

public class FluentRequest extends Request {

    public FluentRequest setName(String name) {
        this.name = name;
        return this;
    }

    public FluentRequest setAge(int age) {
        this.age = age;
        return this;
    }

    public FluentRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public FluentRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }

}
