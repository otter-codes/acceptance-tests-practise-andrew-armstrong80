package steps

import collection.JavaConverters._
import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.By
import org.scalatest._
import support.Browser

class StepDefinitions extends ScalaDsl with EN with Matchers with Browser {

  Given("""^I am on the social care compliance homepage$""") { () =>
    go to "http://localhost:8550/apply-for-social-care-compliance-scheme/capacity-registering"
    find(cssSelector("h1")).get.text shouldBe "Which of these options best describes you?"
  }

  When("""^I choose the "Someone who pays for care directly" option$""") { () =>
    click on id("capacityRegistering.personalBudgetHolderDirect")
    click on id("submit")
  }

  When("""I choose the "An agent or representative of someone who pays for care directly" option""") { () =>
    click on id("capacityRegistering.personalBudgetHolderAgent")
    click on id("submit")
  }

  When("""I choose the "A company that employs social care worker" option""") { () =>
    click on id("capacityRegistering.companyEmployeeOrDirector")
    click on id("submit")
  }


  And("""^I enter "(.+)" in the name field$""") { name: String =>
    webDriver.findElement(By.id("value")).sendKeys(name)
    click on id("submit")
  }


  And("""^I choose the "Yes" option$""") { () =>
    click on id("value-yes")
    click on id("submit")
  }

//  def checkUrl(name: String) : Unit = {
//    webDriver.getCurrentUrl shouldBe baseUrl + name.replaceAll()  }

  And("""^I choose "(Yes|No)" on the (.*) page$""") { () =>
    click on id("value-yes")
    click on id("submit")
  }

  When("""^I enter the address$""") { (table: DataTable) =>
    table.asMaps[String, String](classOf[String], classOf[String]).asScala.foreach(row => {

      webDriver.findElement(By.name(row.get("Field"))).sendKeys(row.get("Value"))
      click on id("submit")
    })
  }

  And("""^I enter the phone number as "(.+)"$""") { number: String =>
    webDriver.findElement(By.id("value")).sendKeys(number)
    click on id("submit")
  }

  And("""^I enter my email address as "(.+)"@google.com"$""") { email: String =>
    webDriver.findElement(By.id("value")).sendKeys(email)
    click on id("submit")
  }

  And("""^I choose the "No" option$""") { () =>
    click on id("value-no")
    click on id("submit")
  }

  And("""^I submit the form$""") { () =>
    click on id("submit")
  }


}
