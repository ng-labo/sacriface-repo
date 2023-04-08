package test

import org.scalatest._
import org.scalatest.tags.FirefoxBrowser
import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.Application
import play.api.inject.guice._

@FirefoxBrowser
class ExampleSpec extends PlaySpec with GuiceOneServerPerTest with OneBrowserPerTest with FirefoxFactory {

  // Override newAppForTest if you need an Application with other than non-default parameters.
  override def newAppForTest(testData: TestData): Application = {
    GuiceApplicationBuilder()
      //.configure("foo" -> "bar")
      //.appRoutes(app => TestRoutes.router(app))
      .build()
  }

  "The OneBrowserPerTest trait" must {
    "provide a web driver" in {
      go to ("https://tyo.balus.xyz")
      pageTitle mustBe "tyo.balus.xyz"
      //click.on(find(name("b")).value)
      //eventually { pageTitle mustBe "scalatest" }
    }
/*
    "provide an Application" in {
      app.configuration.getOptional[String]("foo") mustBe Some("bar")
    }
    "make the Application available implicitly" in {
      def getConfig(key: String) = app.configuration.getOptional[String](key)
      getConfig("foo") mustBe Some("bar")
    }
    "provide an http endpoint" in {
      runningServer.endpoints.httpEndpoint must not be empty
    }
    "provide an actual running server" in {
      import java.net._
      val url = new URI("http://localhost:" + port + "/boum").toURL
      val con = url.openConnection().asInstanceOf[HttpURLConnection]
      try con.getResponseCode mustBe 404
      finally con.disconnect()
    }
    "provide a web driver" in {
      go to ("http://localhost:" + port + "/testing")
      pageTitle mustBe "Test Page"
      click.on(find(name("b")).value)
      eventually { pageTitle mustBe "scalatest" }
    }
*/
  }
}
