package com.raptor.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import net.minidev.json.JSONArray;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

public class ReadJSON {
    // load json file having test scripts
    public static JSONArray readTestScript(String path)
    {
        // please update the path of your file accordingl;y
        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        JSONArray testScript = null;
        try (FileReader reader = new FileReader(path))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            testScript = (JSONArray) obj;
            System.out.println(testScript);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return testScript;
    }
}
