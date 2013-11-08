logLevel := Level.Warn

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.1")

addSbtPlugin("templemore" % "sbt-cucumber-plugin" % "0.8.0")

resolvers += "Templemore Repository" at "http://templemore.co.uk/repo"
