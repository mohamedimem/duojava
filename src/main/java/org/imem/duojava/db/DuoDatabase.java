package org.imem.duojava.db;


import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import org.imem.duojava.Constants;
import org.json.*;
import org.json.JSONObject;
public class DuoDatabase {
    private final Path databaseFile= Path.of(Constants.BASE_PATH); // Database file path (private)
    static DuoDatabase instance;

    // Public method to get the single instance
    public static synchronized DuoDatabase getInstance( ) {
        if (instance == null) {
            instance = new DuoDatabase();
        }
        return instance;
    }
    // Constructor to initialize the database file
    private DuoDatabase() {
       ensureDatabaseFile();
    }
    public void addModule(Path directory){
        try {
            this.addDirectory(directory);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // Ensures the database file exists
    private void addDirectory(Path directory) throws IOException {
        if(!Files.isDirectory(directory)) {
            Files.createDirectories(directory);
        }
    }
    private void ensureDatabaseFile() {
        try {
            if (!Files.exists(databaseFile)) {
                Files.createDirectories(databaseFile.getParent()); // Create parent directories if needed
                Files.write(databaseFile, "{}".getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to initialize the database file.", e);
        }
    }

    // Reads the JSON database file and returns its content as a JSONObject
    private JSONObject readDatabase() {
        try {
            String content = new String(Files.readAllBytes(databaseFile));
            return new JSONObject(content); // Parse the content into a JSONObject
        } catch (IOException e) {
            throw new RuntimeException("Failed to read from the database file.", e);
        }
    }

    // Writes a JSONObject to the database file
    private void writeDatabase(JSONObject data) {
        try (BufferedWriter writer = Files.newBufferedWriter(databaseFile)) {
            writer.write(data.toString()); // Pretty-printed JSON
        } catch (IOException e) {
            throw new RuntimeException("Failed to write to the database file.", e);
        }
    }

    // CRUD Operations
    public void add(String key, Object value) {
        JSONObject db = readDatabase();
        db.put(key, value);
        writeDatabase(db);
    }

    public Object get(String key) {
        JSONObject db = readDatabase();
        return db.opt(key); // Use opt() to avoid throwing an exception if the key doesn't exist
    }

    public void update(String key, Object newValue) {
        JSONObject db = readDatabase();
        if (db.has(key)) { // Check if the key exists
            db.put(key, newValue);
            writeDatabase(db);
        } else {
            throw new RuntimeException("Key not found: " + key);
        }
    }

    public void delete(String key) {
        JSONObject db = readDatabase();
        db.remove(key);
        writeDatabase(db);
    }

    public List<String> listModules() {
        List<String> moduleNames = new ArrayList<>();
        Path parentDir = Paths.get(this.databaseFile.getParent().toString());

        // Check if the parent directory exists
        if (!Files.exists(parentDir) || !Files.isDirectory(parentDir)) {
            throw new RuntimeException("Parent directory not found: " + this.databaseFile.getParent().toString());
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(parentDir, Files::isDirectory)) {
            for (Path entry : stream) {
                // Add the directory name to the list of modules
                moduleNames.add(entry.getFileName().toString());
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to list modules in directory: " + this.databaseFile.getParent().toString(), e);
        }

        return moduleNames;
    }
    public List<String> listTasks( ) {
        List<String> moduleNames = new ArrayList<>();
        Path dir = Paths.get(databaseFile.toUri());

        // Check if the directory exists
        if (!Files.exists(dir) || !Files.isDirectory(dir)) {
            throw new RuntimeException("Directory not found: " + databaseFile);
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.json")) {
            for (Path entry : stream) {
                // Extract the file name without the .json extension
                String fileName = entry.getFileName().toString();
                String moduleName = fileName.substring(0, fileName.lastIndexOf('.'));
                moduleNames.add(moduleName);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to list modules in directory: " + databaseFile, e);
        }

        return moduleNames;
    }
}