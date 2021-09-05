name := "scalaLearn"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq ("org.apache.spark" %% "spark-sql" %"3.1.2")
libraryDependencies ++= Seq ("org.apache.spark" %% "spark-hive" % "3.1.2")
fork := true