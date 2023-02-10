import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Info_JSON {
    public static void main(String[] args) throws IOException {
            JSONObject jsonObject= new JSONObject();
            jsonObject.put("Name", "Md. Mosfik Us Salahin");
            jsonObject.put("Email", "shaon.mushfiq@gmail.com");
            jsonObject.put("Password", "123456789");
            jsonObject.put("Address", "Mirpur-12, Dhaka");
            jsonObject.put("Phone no.", "01122334455");

            System.out.println(jsonObject);

        FileWriter file = new FileWriter("./src/main/resources/User_info.json");
        file.write(jsonObject.toJSONString());
        file.flush();
        file.close();
    }
}
