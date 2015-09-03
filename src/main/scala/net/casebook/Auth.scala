package net.casebook

import java.util.concurrent.TimeUnit
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.firefox.FirefoxDriver

/**
 * Created by Денис on 02.09.2015.
 */

object Auth extends App {
  val ff: WebDriver = new FirefoxDriver()
  ff.navigate().to("http://casebook.ru/")
  val element1 = ff.findElement(By.xpath("//div[@class='b-button js-logon g-unselectable']")).click()
  val element2 = ff.findElement(By.xpath("//input[@name='UserName']")).sendKeys("d.soldatenkov@parcsis.org")
  val element3 = ff.findElement(By.xpath("//input[@type='password']")).sendKeys("84637857")
  val element4 = ff.findElement(By.xpath("//input[@type='submit']")).click()
  ff.manage().timeouts().implicitlyWait(10, TimeUnit SECONDS)
  val element5 = ff.findElement(By.xpath("//li[contains(@class, 'b-menu-item b-menu-item--profile_my b-menu-item--expandable')]")).click()
  val element6 = ff.findElement(By.xpath("//div[@class='b-profile-button b-profile-button--cancel g-clickable g-unselectable']")).click()
  ff.close()
}