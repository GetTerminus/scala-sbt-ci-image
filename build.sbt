scalaVersion := "2.11.11"

val sparkVersion = "2.2.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % Provided,
  "org.apache.spark" %% "spark-sql" % sparkVersion % Provided,
  "org.apache.spark" %% "spark-hive" % sparkVersion % Provided,
  "org.scanamo"      %% "scanamo"    % "1.0.0-M10",
  "org.typelevel"    %% "cats-core"  % "2.0.0-RC1",
  "org.scalatest"    %% "scalatest"  % "3.0.4" % Test,
  "org.scalamock"    %% "scalamock"  % "4.4.0" % Test
)
