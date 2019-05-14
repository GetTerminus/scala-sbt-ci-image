FROM getterminus/java-ci-image:20190122

# Env variables
ENV SCALA_VERSION 2.11.11
ENV SBT_VERSION 1.2.8

# Install Scala
## Piping curl directly in tar
RUN \
    wget http://scala-lang.org/files/archive/scala-$SCALA_VERSION.deb && \
    dpkg -i scala-$SCALA_VERSION.deb && \
    apt-get update && \
    apt-get install scala

# Install sbt
RUN \
    wget https://dl.bintray.com/sbt/debian/sbt-$SBT_VERSION.deb && \
    dpkg -i sbt-$SBT_VERSION.deb && \
    rm sbt-$SBT_VERSION.deb && \
    apt-get update && \
    apt-get install sbt  && \
    sbt sbtVersion && \
    mkdir project && \
    echo "scalaVersion := \"${SCALA_VERSION}\"" > build.sbt && \
    echo "sbt.version=${SBT_VERSION}" > project/build.properties && \
    echo "case object Temp" > Temp.scala && \
    sbt compile && \
    rm -r project && rm build.sbt && rm Temp.scala && rm -r target

COPY . app/
WORKDIR /app