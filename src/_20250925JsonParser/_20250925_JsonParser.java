package _20250925JsonParser;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class _20250925_JsonParser {
    static List<User> userList = new ArrayList<>();

    public static void main(String[] args) throws MalformedURLException {
        String stringJson = getJsonFromUrl("https://raw.githubusercontent.com/BoostMyTool/JsonFile/master/example.json");
        System.out.println("Json String from URL: \n" + stringJson);
        stringJson = getJsonFromFile("/Users/ayhanunlu/IdeaProjects/NewlyLearned/src/_20250925JsonParser/Users.json");
        System.out.println("JSON String from file: " + stringJson);

        try {
            JSONParser jsonParser = new JSONParser();
JSONArray jsonArray = (JSONArray) jsonParser.parse(stringJson);

for(Object object :jsonArray){
    JSONObject jsonUser = (JSONObject) object;

    String nationalIdNumber = (String) jsonUser.get("nationalIdNumber");
    String birthDate = (String) jsonUser.get("birthDate");
    String password = (String) jsonUser.get("password");
    userList.add(new User(nationalIdNumber,birthDate,password));
}
            for(User user:userList){
                System.out.println(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getJsonFromFile(String filename) {
        String jsonText = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        ) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonText;
    }

    public static String getJsonFromUrl(String strUrl) throws MalformedURLException {
        String jsonText = "";
        URL url = new URL(strUrl);
        try (
                InputStream inputStream = url.openStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonText;
    }


}
