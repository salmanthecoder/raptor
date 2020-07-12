package com.raptor.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import net.minidev.json.JSONArray;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadJsonTestScripts {


    // load json file having test scripts
    public static JsonTestCase readTestScript(String path)
    {
        // please update the path of your file accordingl;y
        File directory = new File("./");
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        JSONArray testScript = null;
        JsonTestCase testCase = null;
        try (FileReader reader = new FileReader(path))
        {
            //Read JSON file
        	testCase = jsonParser.parse(reader, JsonTestCase.class);
            //Object obj = jsonParser.parse(reader);
            //testScript = (JSONArray) obj;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return testCase;
    }


}
