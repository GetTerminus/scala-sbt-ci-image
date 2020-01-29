scalaVersion := "2.11.12"

resolvers += "aws-glue-etl-artifacts" at "https://aws-glue-etl-artifacts.s3.amazonaws.com/release/"

val sparkVersion = "2.4.3"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core"  % sparkVersion % Provided,
  "org.apache.spark" %% "spark-sql"   % sparkVersion % Provided,
  "org.apache.spark" %% "spark-hive"  % sparkVersion % Provided,
  "com.amazonaws"    % "AWSGlueETL"   % "1.0.0"      % Provided,
  "org.scanamo"      %% "scanamo"     % "1.0.0-M10",
  "com.chuusai"      %% "shapeless"   % "2.3.3",
  "com.amazonaws"    % "aws-java-sdk" % "1.11.714",
  "org.scalatest"    %% "scalatest"   % "3.0.4" % Test,
  "org.scalamock"    %% "scalamock"   % "4.4.0" % Test
)
