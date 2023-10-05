package main.java;

import java.time.LocalDate;
//import employee.version1.*;
//import version2.*;
//import version3.*;
//import version4.*;
import version5.*;

/**
 *
 * @author MAGDADADADADADADADARO, MATT VINCENT
 */
public class TestMain {

    public static void main(String[] args) {

        EmployeeRoster roster = new EmployeeRoster();
        EmployeeRoster search = new EmployeeRoster();

        Name Matt = new Name().firstName("Matt").lastName("Magdadaro");
        Name Bob = new Name().firstName("Bob").lastName("Roberts");

        Employee Hourly = new HourlyEmployee(
                200,
                Matt,
                LocalDate.of(2023, 12, 1),
                LocalDate.of(2003, 5, 6),
                200,
                300
        );
        Employee Commission = new CommissionEmployee(
                201,
                Bob,
                LocalDate.of(2023, 12, 1),
                LocalDate.of(2003, 5, 6),
                200,
                300,
                200
        );

        roster.addEmployee(Hourly);
        roster.addEmployee(Commission);
        roster.displayAllEmployees();
        System.out.println("There is " + roster.countHourlyEmployee() + " Hourly Employees");
        roster.removeEmployee(201);
        roster.displayAllEmployees();
        roster.displayEmployeeByType("H");
        roster.searchEmployee("Matt");
        System.out.println("Searched Employees: \n");
        roster.displayAllEmployees();
        roster.updateEmployee(200, Commission);
        roster.displayAllEmployees();
    }

}
