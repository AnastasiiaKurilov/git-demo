package test;

import com.beust.jcommander.Parameter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basics {
@Parameters("URL")
    @Test
    public void demo(String urlname){
        System.out.println("hello");
    System.out.println(urlname);


    }
@Test(groups = {"Smoke"})
    public void secondTC(){
    System.out.println("bye");

}
@Test(dataProvider = "getData")
public void thirdtest(String user,String password){
    System.out.println("Username and password:"+user+password);

}
    @DataProvider(name="getData")
    public Object[][]getData(){
    Object[][] data= new Object[3][2];
    /// 1st set
    data[0][0]="firstsetUserName";
    data[0][1]="firstsetPassword";
    /// 2ndSet
        data[1][0]="secondsetUser";
        data[1][1]="secondsetPassword";
        /// 3rd set
  data[2][0]="thirdsetUser";
  data[2][1]="thirdsetPassword";
   return data;

    }

}
