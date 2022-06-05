package org.luitro.selenium.bot.config

import com.typesafe.config.Config

import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`

class AppConfig(applicationConfig: Config) {

  val appName: String = applicationConfig.getString("appName")

  val browserList: List[Browser] = applicationConfig.getConfigList("browser").map(browser => new Browser(browser)).toList

}
