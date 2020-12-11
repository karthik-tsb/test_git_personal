organization := "com.kthiruk"
name := "test_git_personal"

version := "0.1"

scalaVersion := "2.13.4"

//import sbtrelease.ReleaseStateTransformations._
//import sbtrelease._

lazy val sparkVersion = SettingKey[String]("sparkVersion")
sparkVersion := "3"

//spark version is parsed as qualifier, so release plugin does not complain
version := version.value + "-spark" + sparkVersion.value

commands += Command.command("publish2JarsLocally"){ state =>
  val extracted = Project.extract(state)
  import extracted._
  runTask(publishLocal, appendWithSession(Seq(sparkVersion := "3"), state))
  state
}

//resolvers += "Maven Repository" at "https://mvnrepository.com/artifact/"
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.0.0"
libraryDependencies += "org.mockito" %% "mockito-scala" % "1.11.4" % Test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % Test

