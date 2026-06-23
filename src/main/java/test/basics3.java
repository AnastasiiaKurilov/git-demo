package test;

import org.testng.annotations.*;

public class basics3 {
    @Parameters("URL")
    @Test(groups = "web")
    public void WebLogin(String URLs){
///selenium
        System.out.println("weblogincar");
        System.out.println(URLs);
    }
@Test(priority = 0,timeOut = 4000)
    public void ApiLogin(){
/// restAPI
    System.out.println("apilogincar");
}
@Test(priority = 1)
public void MobileLogin(){
    System.out.println("mobilelogincar");
///appium
}
@BeforeSuite
public void before1(){
    System.out.println("firsr in before suite");
}
@BeforeMethod(groups = {"Smoke"})
public void beforemethid(){
    System.out.println("before method");
}

    @Test(groups = {"Smoke"})
    public void MobileLogin1(){
        System.out.println("mobilelogincar");
///appium
    }
    @Test
    public void MobileLogin2(){
        System.out.println("mobilelogincar");
///appium
    }
    @Test(groups = {"Smoke"})
    public void MobileLogin3(){
        System.out.println("mobilelogincar");
///appium
    }
    @AfterMethod
    public void aftermethid(){
        System.out.println("after method");
    }

}
