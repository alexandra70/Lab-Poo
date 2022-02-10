package task2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

import static java.nio.file.FileVisitResult.CONTINUE;

/**
 * Counter for java files of a given directory using java.nio API
 */
public class JavaFilesVisitor extends SimpleFileVisitor<Path> {

    private ArrayList<Path> javaFiles;

    public JavaFilesVisitor(){
        this.javaFiles = new ArrayList<Path>();
    }

    public final ArrayList<Path> getJavaFiles() {

        return javaFiles;
    }


    // TODO - override the visitFile(Path file, BasicFileAttributes
    //  attr) method of the SimpleFileVisitor
    // add to javaFiles all the Java related files: the ones with
    // .java and .class extensions



    public FileVisitResult visitFile(Path file, BasicFileAttributes attr){


        if(file.getFileName().toString().endsWith(".class") ||
         file.getFileName().toString().endsWith(".java")){


            System.out.println(" Numele filei:" + file.getFileName().toString());
            System.out.println(" Maimea of file:" + attr.size());
            System.out.println(" E dir de file? :" + attr.isDirectory());
            System.out.println(" Creatie time? :" + attr.creationTime());
            javaFiles.add(file);
        }
        return CONTINUE;
    }

    public FileVisitResult visitFileFailed(Path file, IOException exc){
        System.out.println(exc);
        return CONTINUE;
    }

    public static void main(String[] args) throws IOException {

        Path startingDir = Paths.get(".");
        JavaFilesVisitor filesVisitor = new JavaFilesVisitor();
        // TODO
        // use Files.walkFileTree
        // obtain the list of files and print some info about them
        // (e.g. size and path)


        Files.walkFileTree(startingDir, filesVisitor);

        System.out.println("\n");
        for(Path p: filesVisitor.getJavaFiles()) {
            System.out.println(p);
        }


    }
}
