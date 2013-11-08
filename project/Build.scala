import sbt._
import Keys._
import play.Project._
import templemore.sbt.cucumber.CucumberPlugin

object ApplicationBuild extends Build {

val appName         = "myproject"
val appVersion      = "1.0-SNAPSHOT"

val appDependencies = Seq()

lazy val main = play.Project(appName, appVersion, appDependencies)
  .settings(CucumberPlugin.cucumberSettings: _*)
  .settings(
    CucumberPlugin.cucumberFeaturesLocation := "cucumber",
    CucumberPlugin.cucumberStepsBasePackage := "cucumber.steps"
  )
}
