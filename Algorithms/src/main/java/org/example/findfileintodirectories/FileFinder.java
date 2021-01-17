package org.example.findfileintodirectories;

import java.io.File;
import java.util.Arrays;

/**
 * Research file or directory inside a directory tree of a folder.
 * Below, an example of algorithm to find a file/directory in a directory tree.
 * But you can also use Files.walk() and Files.find() from Java 8.
 */
public class FileFinder {

    public static String find(String filenameToFind, File fileRootDirectory) throws Exception {
        if (filenameToFind == null || filenameToFind.isEmpty()) {
            throw new Exception("Error : Filename is null or empty.");
        }

        if (!fileRootDirectory.exists()) {
            throw new Exception("Error : ROOT_DIRECTORY is not valid.");
        }

        File[] listFiles = fileRootDirectory.listFiles();
        if (listFiles != null) {
            if (Arrays.stream(listFiles)
                    .anyMatch(file -> file.getName().equalsIgnoreCase(filenameToFind))) {
                return fileRootDirectory.getAbsolutePath();
            }

            for (File file : listFiles) {
                String filePath = find(filenameToFind, file);
                if (filePath != null && !filePath.isEmpty()) {
                    return filePath;
                }
            }
        }

        return null;
    }
}
