package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class basics4 {
    @Test
    public void WebLoginHome(){
///selenium
        System.out.println("webloginhome");
    }
@Test
    public void ApiLoginHome(){
/// restAPI
    System.out.println("apiloginhome");
}
@Test
public void MobileLoginHome(){
    System.out.println("mobileloginhome");
///appium
}


}
