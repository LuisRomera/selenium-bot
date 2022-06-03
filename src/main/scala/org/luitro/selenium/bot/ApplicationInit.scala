package org.luitro.selenium.bot

import com.typesafe.config.{Config, ConfigFactory}

object ApplicationInit {

  /**
   * Main method
   *
   * @param args : config/application.conf
   */
  def main(args: Array[String]): Unit = {
    val applicationConfig: Config = ConfigFactory.parseResources(args(0))
  }
}
