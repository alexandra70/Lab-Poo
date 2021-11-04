package task2;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import static java.nio.file.FileVisitResult.*;

/**
 * Counter for java files of a given directory using java.nio API
 */
public class JavaFilesVisitor extends SimpleFileVisitor<Path> {

    private ArrayList<Path> javaFiles = new ArrayList<>();

    public final ArrayList<Path> getJavaFiles() {
        return javaFiles;
    }

    /**
     * TODO - override the visitFile(Path file, BasicFileAttributes attr) method of the SimpleFileVisitor.
     * Add to javaFiles all the Java related files: the ones with .java and .class extensions.
     */

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attr) throws IOException {

        if(path.toString().endsWith(".java")
                || path.toString().endsWith(".class")) {
            this.javaFiles.add(path);
        }

        return CONTINUE;
    }

    public static void main(String[] args) throws IOException {

        Path startingDir = Paths.get(".");
        JavaFilesVisitor filesVisitor = new JavaFilesVisitor();

        /*
         * The walkFileTree methods does a depth-first traversal of a directory, starting from startingDir.
         * When it reaches a file, the visitFile method is invoked on the currently visited file.
         */

        try {
            Files.walkFileTree(startingDir, filesVisitor);
            ArrayList<Path> javaFiles = filesVisitor.getJavaFiles();

            javaFiles.forEach(path -> System.out.println(path));
            System.out.println("TOTAL NUMBER : " + javaFiles.size());

            // TODO: Print the number of files visited and their names

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
