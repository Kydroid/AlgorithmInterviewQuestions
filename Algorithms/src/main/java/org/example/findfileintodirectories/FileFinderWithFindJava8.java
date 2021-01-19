package org.example.findfileintodirectories;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Research file or directory inside a directory tree of a folder.
 * Below, an example of algorithm to find a file/directory in a directory tree.
 * But you can also use Files.walk() and Files.find() from Java 8.
 */
public class FileFinderWithFindJava8 {

    public static String find(String filenameToFind, Path pathRootDirectory) throws Exception {
        if (filenameToFind == null || filenameToFind.isEmpty()) {
            throw new Exception("Error : Filename is null or empty.");
        }

        if (pathRootDirectory == null) {
            throw new Exception("Error : ROOT_DIRECTORY is not valid.");
        }

        try (Stream<Path> pathStream = Files.find(pathRootDirectory,
                Integer.MAX_VALUE,
                (p, basicFileAttributes) -> p.getFileName().toString().equalsIgnoreCase(filenameToFind))
        ) {
            Optional<Path> fileFoundedOptional = pathStream.findFirst();
            if (fileFoundedOptional.isPresent()) {
                return fileFoundedOptional.get().getParent().toString();
            }
        }

        return null;
    }
}
