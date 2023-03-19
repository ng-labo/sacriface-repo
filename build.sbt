name := "stackoverflow"
scalaVersion := "2.12.4"
run / baseDirectory := file(".")
Compile / scalaSource := baseDirectory.value / "src"
