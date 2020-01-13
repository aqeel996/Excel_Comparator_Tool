import java.util.Map;
import java.util.HashMap;

public class CustomHashMap extends java.util.HashMap<java.lang.Object, java.lang.Object> {
    HashMap<String, Employee> Data = new HashMap<String, Employee>();

    public CustomHashMap() {
    }

    public void put(String key, Employee value) {
        Data.put(key, value);
    }


    public String get(String key) {
        Employee e = null;
        for (Map.Entry<String, Employee> chm : Data.entrySet()) {
            if (chm.getKey().equals(key)) {
                e = chm.getValue();
                return e.getName();
            }
        }

        return null;
    }


    public java.util.ArrayList<String> getListOf(java.lang.Object key) {
        java.util.ArrayList<String> element = new java.util.ArrayList<String>();
        Employee employee = null;

        for (Map.Entry<String, Employee> chm : Data.entrySet()) {
            if (chm.getKey().equals(key)) {
                employee = chm.getValue();
                element.add(employee.getName());
                element.add(employee.getAge());
                element.add(employee.getRollnumber());
                return element;
            }
        }


        return null;
    }
}
