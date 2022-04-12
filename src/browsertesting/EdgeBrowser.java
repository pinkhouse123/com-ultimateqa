package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //Launch the URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //Get and print the title of the page
        String getTitle= driver.getTitle();
        System.out.println(getTitle);

        //Get Current URL
        System.out.println("Current URL =" + driver.getCurrentUrl());


        //Find the email field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        //Sending email to email field element
        emailField.sendKeys("umipatel14@gmail.com");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        //Sending password to password field element
        passwordField.sendKeys("umi123");

        //Close the browser
        //driver . close();

    }
}