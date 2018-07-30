libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.1.0-M6")

addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")

resolvers += Resolver.typesafeIvyRepo("releases")

// addSbtPlugin("se.nullable.sbtix" % "sbtix" % "0.2-SNAPSHOT")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.1")
