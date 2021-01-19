package org.example.findfileintodirectories;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileFinderWithFindJava8Test {

    public static final Path FILE_ROOT_DIRECTORY = Paths.get("C:\\myfolder");

    public static final Path FILE_ROOT_DIRECTORY_FOR_FILE_EXISTS = Paths.get("C:\\myfolder\\mysubfolder");
    public static final String FILENAME_FOR_FILE_EXISTS = "myfile.txt";

    public static final Path FILE_ROOT_DIRECTORY_FOR_FILE_EXISTS_IN_DEEP = Paths.get("C:\\myfolder\\mysubfolder\\mydeepsubfolder");
    public static final String FILENAME_FOR_FILE_EXISTS_IN_DEEP = "mydeepfile.txt";

    @Test
    void throwException_whenFilenameIsNullOrEmpty() {
        assertThrows(Exception.class, () -> FileFinderWithFindJava8.find(null, FILE_ROOT_DIRECTORY));
        assertThrows(Exception.class, () -> FileFinderWithFindJava8.find("", FILE_ROOT_DIRECTORY));
    }

    @Test
    void throwException_whenRootDirectoryIsInvalid() {
        assertThrows(Exception.class, () -> FileFinderWithFindJava8.find("rootDirectoryIsInvalid",
                Paths.get("FAKE_ROOT_DIRECTORY")));
    }

    @Test
    void returnNull_whenFilenameDoesntExistInDirectories() throws Exception {
        assertNull(FileFinderWithFindJava8.find("thisFilenameDoesntExist", FILE_ROOT_DIRECTORY));
    }

    @Test
    void returnFilePath_whenFileExistsInRootDirectory() throws Exception {
        assertEquals(FILE_ROOT_DIRECTORY.toString(),
                FileFinderWithFindJava8.find("Dolby", FILE_ROOT_DIRECTORY));
    }

    @Test
    void returnFilePath_whenFileExistsInSubDirectories() throws Exception {
        assertEquals(FILE_ROOT_DIRECTORY_FOR_FILE_EXISTS.toString(),
                FileFinderWithFindJava8.find(FILENAME_FOR_FILE_EXISTS, FILE_ROOT_DIRECTORY));
    }

    @Test
    void returnFilePath_whenFileExistsInDeepSubDirectories() throws Exception {
        assertEquals(FILE_ROOT_DIRECTORY_FOR_FILE_EXISTS_IN_DEEP.toString(),
                FileFinderWithFindJava8.find(FILENAME_FOR_FILE_EXISTS_IN_DEEP, FILE_ROOT_DIRECTORY));
    }
}
