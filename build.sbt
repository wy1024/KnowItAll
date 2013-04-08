name := "project1"

description := "takes in sentences and outputs extractions."

version := "1.0"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
    "edu.washington.cs.knowitall.nlptools" % "nlptools-parse-stanford_2.9.2" % "2.4.0",
    "edu.washington.cs.knowitall.ollie" % "ollie-core_2.9.2" % "1.0.2"
    )
