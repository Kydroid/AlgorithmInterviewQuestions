package org.example.findfileintodirectories;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FileFinderTest {
    // Adapt the ROOT_DIRECTORY_PATH to your environment.
    public static final File FILE_ROOT_DIRECTORY = new File("C:\\myfolder");

    public static final String FILE_ROOT_DIRECTORY_FOR_FILE_EXISTS = FILE_ROOT_DIRECTORY.getAbsolutePath() + "\\mysubfolder";
    public static final String FILENAME_FOR_FILE_EXISTS = "myfile.txt";

    public static final String FILE_ROOT_DIRECTORY_FOR_FILE_EXISTS_IN_DEEP = FILE_ROOT_DIRECTORY.getAbsolutePath() + "\\mysubfolder\\mydeepsubfolder";
    public static final String FILENAME_FOR_FILE_EXISTS_IN_DEEP = "mydeepfile.txt";

    @Test
    void throwException_whenFilenameIsNullOrEmpty() {
        assertThrows(Exception.class, () -> FileFinder.find(null, FILE_ROOT_DIRECTORY));
        assertThrows(Exception.class, () -> FileFinder.find("", FILE_ROOT_DIRECTORY));
    }

    @Test
    void throwException_whenRootDirectoryIsInvalid() {
        assertThrows(Exception.class, () -> FileFinder.find("rootDirectoryIsInvalid",
                new File("FAKE_ROOT_DIRECTORY")));
    }

    @Test
    void returnNull_whenFilenameDoesntExistInDirectories() throws Exception {
        assertNull(FileFinder.find("thisFilenameDoesntExist", FILE_ROOT_DIRECTORY));
    }

    @Test
    void returnFilePath_whenFileExistsInRootDirectory() throws Exception {
        assertEquals(FILE_ROOT_DIRECTORY.getAbsolutePath(),
                FileFinder.find("Dolby", FILE_ROOT_DIRECTORY));
    }

    @Test
    void returnFilePath_whenFileExistsInSubDirectories() throws Exception {
        assertEquals(FILE_ROOT_DIRECTORY_FOR_FILE_EXISTS,
                FileFinder.find(FILENAME_FOR_FILE_EXISTS, FILE_ROOT_DIRECTORY));
    }

    @Test
    void returnFilePath_whenFileExistsInDeepSubDirectories() throws Exception {
        assertEquals(FILE_ROOT_DIRECTORY_FOR_FILE_EXISTS_IN_DEEP,
                FileFinder.find(FILENAME_FOR_FILE_EXISTS_IN_DEEP, FILE_ROOT_DIRECTORY));
    }
}
