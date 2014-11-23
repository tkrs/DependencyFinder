DependencyFinder
================

Find a classes from maven dependencies.

# SYNOPSIS

```bash
cd ${MVN_PROJ}
mvn dependency:build-classpath -Dmdep.outputFile=${DependencyFinder.DIR}/classpath.txt
java -cp . com.github.t8keru.DependencyFinder "com.xxx.Klass" "org.xxx.Klass"
```
