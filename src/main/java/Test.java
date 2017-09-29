import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
*
* */
public class Test {
    public static void main(String[] args) {
        //writeValue();
        User user = readValue();
        System.out.println(user);

/*
        JSONArray ar = new JSONArray();
        JSONObject obj = new JSONObject();
        JSONObject resultJson = new JSONObject();

        ar.add("first");
        ar.add(new Integer(100));

        obj.put("one", "two");
        obj.put("three", "four");

        resultJson.put("paramsArray", ar);
        resultJson.put("paramsObj", obj);
        resultJson.put("paramsStr", "some string");
        System.out.print(obj.toString());
// {"paramsArray": ["first", 100],
//  "paramsObj": {"one": "two", "three": "four"},
//  "paramsStr": "some string"}

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Упя\\IdeaProjects\\JSONTest\\src\\main\\resources\\test.json"))) {
            writer.write(resultJson.toJSONString());

        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    private static void writeValue() {
        User user = new User(4714335, "Lena", 24, new ArrayList<String>() {{
            add("A");
            add("B");
            add("C");
        }});
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Выводим в json файл
            mapper.writeValue(new FileOutputStream("C:\\Users\\Упя\\IdeaProjects" +
                    "\\JSONTest\\src\\main\\resources\\test.json"), user);
            // Выводим на консоль
            System.out.println(mapper.writeValueAsString(user));
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    private static User readValue() {
        ObjectMapper mapper = new ObjectMapper();
        User user = null;
        try {
            user = (User) mapper.readValue(new FileInputStream("C:\\Users\\Упя\\IdeaProjects" +
                    "\\JSONTest\\src\\main\\resources\\test.json"), User.class);

          } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }

}
