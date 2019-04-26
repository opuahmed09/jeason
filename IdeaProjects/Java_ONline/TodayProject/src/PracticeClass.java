import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class PracticeClass {

    public static void main(String[] args) throws Exception {



//    public static void json() throws MalformedURLException, IOException {

        String urls = "http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources";

        List<Employee> emp = new ArrayList<Employee>();


        Employee employee;

        URL ur = new URL(urls);

        URLConnection request = ur.openConnection();
        request.connect();  // hitting the url

        JsonArray jsonArray = null;
        JsonParser jp = new JsonParser();
        JsonElement element = jp.parse(new InputStreamReader((InputStream) request.getContent()));

        if (element instanceof JsonObject) {
            JsonObject rootobj = element.getAsJsonObject();
        } else if (element instanceof JsonArray) {
            jsonArray = element.getAsJsonArray();
        }

        employee = new Employee();


        for (int i = 0; i < jsonArray.size() - 1; i++) {
            try {

                JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();


                String empName = jsonObject.get("empName").toString();
                employee.setEmployeeName(empName);

                String empEmail = jsonObject.get("empEmail").toString();
                employee.setEmployeeEmail(empEmail);

                String salary = jsonObject.get("salary").toString();
                employee.setSalary(salary);

                String department = jsonObject.get("department").toString();
                employee.setSalary(department);
                employee = new Employee(employee.getEmployeeName(), employee.getEmployeeEmail(), employee.getSalary()
                        , employee.getDepartment());


                emp.add(employee);


            } catch (Exception e) {


            }


        }



        for (Employee e : emp) {
            System.out.println(e.getEmployeeName() + " \n " + e.getEmployeeEmail() + "\n" + e.getSalary() + "\n" + e.getDepartment());
        }


    }


}
