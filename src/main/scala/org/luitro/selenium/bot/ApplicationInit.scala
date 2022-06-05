package org.luitro.selenium.bot

import com.typesafe.config.{Config, ConfigFactory}
import org.luitro.selenium.bot.config.AppConfig
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.{DesiredCapabilities, RemoteWebDriver}

import java.net.URL


object ApplicationInit {

  /**
   * Main method
   *
   * @param args : config/application.conf
   */
  def main(args: Array[String]): Unit = {

    val applicationConfig = new AppConfig(ConfigFactory.parseResources(args(0)))

    var capabilities: DesiredCapabilities = new DesiredCapabilities()
    capabilities.setCapability("browserName", "chrome")
    val driver: WebDriver = new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"), capabilities)
    val sd: Config = ConfigFactory.parseResources(args(0))
  }
}
