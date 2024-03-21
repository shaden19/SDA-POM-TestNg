
package sda.tests;

import org.testng.Assert;
import sda.utilities.Driver;

public class C02_UserDriverClass {

//Go to URL: https://opensource-demo.orangehrmlive.com/
//Verify title contains OrangeHRM.
//Use Driver Class

    public void driverClassTest(){
//Go to URL: https://opensource-demo.orangehrmlive.com/
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
//Verify title contains OrangeHRM.
        String title = Driver.getDriver().getTitle(); //to get web address
        Assert.assertTrue(title.contains("OrangeHRM"));
//Use Driver Class
        Driver.closeDriver();
    }
}