@echo off
if not exist "bin" mkdir bin
javac -sourcepath src -d bin src/com/github/t8keru/DependencyFinder.java
