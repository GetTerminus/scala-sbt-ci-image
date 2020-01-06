scalaVersion := "2.11.11"

val sparkVersion = "2.4.3"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core"  % sparkVersion % Provided,
  "org.apache.spark" %% "spark-sql"   % sparkVersion % Provided,
  "org.apache.spark" %% "spark-hive"  % sparkVersion % Provided,
  "com.amazonaws"    % "AWSGlueETL"   % "1.0.0"      % Provided,
  "org.scanamo"      %% "scanamo"     % "1.0.0-M10",
  "org.scalatest"    %% "scalatest"   % "3.0.4" % Test,
  "org.mockito"      % "mockito-core" % "3.2.4" % Test
)
