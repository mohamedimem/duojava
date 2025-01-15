package org.imem.duojava.qcm;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadJsonWithJackson {
    public String readFile() {
        try {
            // Create an ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON file
            File file = new File("C:\\Users\\medim\\OneDrive\\Desktop\\projects\\duojava\\src\\main\\resources\\data.json"); // Replace with your JSON file path
            JsonNode rootNode = objectMapper.readTree(file);

            // Print JSON content
            return rootNode.toPrettyString() ;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
