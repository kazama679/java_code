package ss18;

import java.util.TreeMap;

public class B4 {
    public static void main(String[] args) {
        TreeMap<String, Double> employee = new TreeMap<>();
        employee.put("E001", 50000000.0);
        employee.put("E003", 55000000.0);
        employee.put("E002", 52000000.0);
        employee.put("E005", 57000000.0);
        employee.put("E004", 53000000.0);
        System.out.println(employee);
        employee.put("E001", 80000000.0);
        employee.remove("E002");
        System.out.println(employee);
    }
}
