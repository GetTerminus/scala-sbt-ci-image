scalaVersion := "2.11.12"

resolvers += "aws-glue-etl-artifacts" at "https://aws-glue-etl-artifacts.s3.amazonaws.com/release/"

resolvers +=  "Toolkit Resolver" at "https://ninja-scala-toolkit.s3.amazonaws.com/releases/"

libraryDependencies ++= Seq(
  "com.amazonaws"    % "AWSGlueETL"     % "1.0.0" % Provided,
  "org.scanamo"      %% "scanamo"       % "1.0.0-M10",
  "com.chuusai"      %% "shapeless"     % "2.3.3",
  "com.terminus"     %% "scala-toolkit" % "0.1.0",
  "org.scalatest"    %% "scalatest"     % "3.0.4" % Test
)
