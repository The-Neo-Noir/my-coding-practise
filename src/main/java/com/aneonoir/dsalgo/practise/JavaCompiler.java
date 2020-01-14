package com.aneonoir.dsalgo.practise;

import javax.tools.ToolProvider;
import java.io.*;
import java.nio.file.Path;

public class JavaCompiler {

    public static void main(String[] args) throws FileNotFoundException {
        javax.tools.JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
        FileInputStream fis = new FileInputStream(new File("/Users/ab670958/IdeaProjects/my-coding-practise/src/main/java/com/aneonoir/dsalgo/practise/JavaCompiler.java"));

        PrintStream ps = new PrintStream(System.out);


        int run = systemJavaCompiler.run(fis, null, ps, new String[]{"/Users/ab670958/Desktop/BrickWall.java"});

        System.out.println(run);

    }
}
