package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class WorkHours {

    private Employee employee;


    public String minWork(String file) {
        Path path = Path.of("file");
        try {
            List<String> employees = Files.readAllLines(path);
            int minHour = Integer.MAX_VALUE;;
            for (String employee : employees) {
                String[] temp = employee.split(",");
                int hour = Integer.parseInt(temp[1]);
                if (hour < minHour) {
                    minHour = hour;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file");
        }

        return  employee;


    }
}
