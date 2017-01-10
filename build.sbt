name := "HydraCommon"

version := "0.1.0"

organization := "io.github.wherby"

scalaVersion := "2.12.2"

useGpg := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.contains("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

licenses := Seq("GPL-3.0" -> url("https://opensource.org/licenses/GPL-3.0"))

homepage := Some(url("https://github.com/wherby/Hydra"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/wherby/HydraCommon"),
    "scm:git@github.com:wherby/HydraCommon.git"
  )
)

developers := List(
  Developer(
    id    = "wherby",
    name  = "Tao Zhou",
    email = "187225577@qq.com",
    url   = url("https://github.com/wherby")
  )
)
