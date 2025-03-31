package ss22.b7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class B7 {
    private static final String FILE_NAME = "data.txt";
    public static void main(String[] args) {
        createFileWithData();
        List<Country> countryList = readCountriesFromFile();
        System.out.println("Danh sách các quốc gia:");
        for (Country country : countryList) {
            System.out.println(country);
        }
    }

    private static void createFileWithData() {
        String[] data = {
                "1,AU,Australia",
                "2,CN,China",
                "3,AU,Australia",
                "4,CN,China",
                "5,CN,China",
                "6,JP,Japan",
                "7,JP,Japan",
                "8,TH,Thailand"
        };
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Country> readCountriesFromFile() {
        List<Country> countries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String code = parts[1].trim();
                    String name = parts[2].trim();
                    countries.add(new Country(id, code, name));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }
}
