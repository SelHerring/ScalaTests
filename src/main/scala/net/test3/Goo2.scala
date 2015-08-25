package net.test3

import java.util.concurrent.TimeUnit
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.firefox.FirefoxDriver

/**
 * Created by 1 on 25.08.2015.
 */

object Goo2 extends App {
  val ff: WebDriver = new FirefoxDriver()
  ff.navigate().to("http://www.google.ru")
  val element1 = ff.findElement(By.id("lst-ib"))
  element1.sendKeys("casebook.ru")
  element1.click()
  ff.manage().timeouts().implicitlyWait(3, TimeUnit SECONDS)
  val element2 = ff.findElement(By.xpath(".//*[@id='sblsbb']/button"))
  element2.click()
  val element3 = ff.findElement(By.xpath(".//*[@id='hdtb-msb']/div[2]/a"))
  element3.click()
  ff.close()
}

