package com.github.t8keru;

import java.util.*;
import java.util.stream.*;
import java.net.*;
import java.nio.file.*;

public class DependencyFinder {

    private static final String PATH_SEP = System.getProperty("path.separator");

    public static void main(String...args) throws Exception {
        if (args.length < 1) return;
        Files.lines(Paths.get("classpath.txt"))
            .flatMap(s -> Stream.of(s.split(PATH_SEP)))
            .map(s -> {
                try {
                    return Paths.get(s).toUri().toURL();
                } catch (Exception e) {
                    return null;
                }
            })
            .map(Optional::ofNullable)
            .filter(Optional::isPresent)
            .peek(System.out::println)
            .forEach(s -> {
                try {
                    URL jar = s.get();
                    URLClassLoader loader = new URLClassLoader(
                        new URL[] { jar }
                    );

                    Stream.of(args)
                        .filter(p -> {
                            try {
                                loader.loadClass(p);
                                return true;
                            } catch (Exception e) {
                                return false;
                            }
                        })
                        .forEach(p -> System.out.println("  -> " + p));

                } catch (Exception e) {
                }
            });
    }

}
