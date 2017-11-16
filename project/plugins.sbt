addSbtPlugin("com.typesafe.sbt" %% "sbt-aspectj" % "0.10.0")

//resolvers += Resolver.bintrayIvyRepo("kamon-io", "sbt-plugins")
//addSbtPlugin("io.kamon" % "aspectj-runner" % "0.1.2")
resolvers += Resolver.bintrayIvyRepo("kamon-io", "sbt-plugins")
addSbtPlugin("io.kamon" %% "sbt-aspectj-runner" % "1.0.1")