name := "stackoverflow"
scalaVersion := "2.12.17"
run / baseDirectory := file(".")
Compile / scalaSource := baseDirectory.value / "src"
