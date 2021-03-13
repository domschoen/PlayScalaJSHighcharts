// Comment to get more information during initialization
logLevel := Level.Warn

// Use Scala.js v1.x
addSbtPlugin("com.vmunier"               % "sbt-web-scalajs"           % "1.0.8-0.6")
addSbtPlugin("org.scala-js"              % "sbt-scalajs"               % "0.6.23")

addSbtPlugin("com.typesafe.play"         % "sbt-plugin"                % "2.6.20")
addSbtPlugin("org.portable-scala"        % "sbt-scalajs-crossproject"  % "0.5.0")
addSbtPlugin("com.typesafe.sbt"          % "sbt-gzip"                  % "1.0.2")
addSbtPlugin("com.typesafe.sbt"          % "sbt-digest"                % "1.1.4")
