package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basics2 {
    @Test
    public void demo1() {
        System.out.println("hello");
    }

    @Test
    public void secondTC1() {
        System.out.println("bye");
    }
@BeforeTest
    public void before(){
    System.out.println("print this before");
}
    @AfterTest
    public void after(){
        System.out.println("after test");
    }
}
