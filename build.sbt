name := "Testing Scala"

version := "1.0"

scalaVersion := "2.11.2"

resolvers ++= Seq(
              "snapshots" at "http://scala-tools.org/repo-snapshots",
              "releases"  at "http://scala-tools.org/repo-releases")

resolvers ++= Seq(
              "sonatype-snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
              "sonatype-releases"  at "http://oss.sonatype.org/content/repositories/releases")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.2" % "test" withSources() withJavadoc(),
  "joda-time" % "joda-time" % "1.6.2" withSources() withJavadoc(),
  "junit" % "junit" % "4.10" % "test" withSources() withJavadoc(),
  "org.testng" % "testng" % "6.1.1" % "test" withSources() withJavadoc(),
  "org.specs2" %% "specs2" % "2.4.9" % "test"
  )
