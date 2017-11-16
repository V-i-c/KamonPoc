name := "KamonMetrics"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "0.6.7",
  "io.kamon" %% "kamon-log-reporter" % "0.6.8",
  "io.kamon" %% "kamon-system-metrics" % "0.6.7",
  "io.kamon" %% "kamon-autoweave" % "0.6.5",
  "io.kamon" %% "kamon-jmx" % "0.6.7",
  "org.aspectj" % "aspectjweaver" % "1.8.13",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)

// Bring the sbt-aspectj settings into this build
aspectjSettings

// Here we are effectively adding the `-javaagent` JVM startup
// option with the location of the AspectJ Weaver provided by
// the sbt-aspectj plugin.


// this only for getting all system metrics
javaOptions in run <++= AspectjKeys.weaverOptions in Aspectj

// We need to ensure that the JVM is forked for the
// AspectJ Weaver to kick in properly and do it's magic.
fork in run := true