[![Stories in Ready](https://badge.waffle.io/tkrs/DependencyFinder.png?label=ready&title=Ready)](https://waffle.io/tkrs/DependencyFinder)
DependencyFinder
================

## Description
Find a classes from maven dependencies.

## Requirement
* Maven
* Java8

## Usage
```bash
cd ${MVN_PROJ}
mvn dependency:build-classpath -Dmdep.outputFile=${DependencyFinder.DIR}/classpath.txt
java -cp . com.github.t8keru.DependencyFinder "com.xxx.Klass" "org.xxx.Klass"
```

## Install
```bash
sh build.sh
```

## Contribution

## Licence

## Author
