package stepDef;


import io.cucumber.java.Before;

public class hook {
    @Before
    public void before() {
        System.out.println("hello world\n");
    }
}
