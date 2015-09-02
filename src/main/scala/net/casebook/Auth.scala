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
  val element1 = ff.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[1]"))
  element1.click()
  val element2 = ff.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td/div/div[1]/form/div/div[1]/input"))
  element2.sendKeys("d.soldatenkov@parcsis.org")
  val element3 = ff.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td/div/div[1]/form/div/div[2]/input"))
  element3.sendKeys("84637857")
  val element4 = ff.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td/div/div[1]/form/div/div[5]/input"))
  element4.click()
  ff.manage().timeouts().implicitlyWait(5, TimeUnit SECONDS)
  val element5 = ff.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/ul/li[10]"))
  element5.click()
  val element6 = ff.findElement(By.xpath("/html/body/div[1]/div[8]/div/div[1]/div/div[3]/div[2]/div[3]"))
  element6.click()
  ff.close()
}
