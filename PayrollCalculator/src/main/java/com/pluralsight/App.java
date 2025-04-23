package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/data/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine(); // ignore header line

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);

                String[] employeeData = input.trim().split("\\|+");

                int employeeId = Integer.parseInt(employeeData[0]);
                String employeeName = employeeData[1];
                double employeeHoursWorked = Double.parseDouble(employeeData[2]);
                double employeePayRate = Double.parseDouble(employeeData[3]);

                Employee employee = new Employee(employeeId, employeeName, employeeHoursWorked,employeePayRate);

                System.out.printf("ID: %d | Name: %-15s | Hours Worked: %6.2f | Pay Rate: $%6.2f%n",
                        employee.getEmployeeId(),
                        employee.getName(),
                        employee.getHoursWorked(),
                        employee.getPayRate());

            }
            bufferedReader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
