package cucumber.steps

import cucumber.api.scala.{EN, ScalaDsl}
import steps.Driver
import org.scalatest.Matchers

class HomepageSteps extends ScalaDsl with EN with Matchers {

  Given("""^I have a homepage$"""){
  }


  When("""^I visit the homepage$"""){ () =>
    Driver.visit("/")
  }

  Then("""^I should be welcome$"""){ () =>
    Driver.browser.pageSource should include("It works!")
  }
}
