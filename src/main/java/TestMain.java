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

        Name name1 = new Name()
                .title("Atty.")
                .firstName("Josh")
                .lastName("Juab")
                .middleName("Aparri")
                .suffix("Sr.");

        Name name2 = new Name()
                .firstName("Sarah")
                .lastName("Palabrica")
                .middleName("Marbella");

        Name name3 = new Name()
                .firstName("Xander")
                .lastName("Labide")
                .suffix("Jr.");

        Name name4 = new Name()
                .firstName("Karylle")
                .lastName("Bernate")
                .middleName("Ordonez")
                .title("Engr.");

        Name name5 = new Name()
                .firstName("Psalmantha")
                .lastName("Ipong")
                .middleName("Doble")
                .suffix("II");

        Name name6 = new Name()
                .firstName("Matt Vincent")
                .lastName("Magdadaro")
                .title("Engr.");

        Employee P = new HourlyEmployee(416, name5,
                LocalDate.of(2023, 7, 8),
                LocalDate.of(2003, 12, 3),
                60, 70);

        Employee E = new HourlyEmployee(123, name1,
                LocalDate.of(2023, 4, 6),
                LocalDate.of(2003, 5, 5),
                10, 60);
//        E.displayInfo();
//        System.out.println("");

        Employee A = new PieceWorkerEmployee(321, name2,
                LocalDate.of(2023, 4, 5),
                LocalDate.of(2003, 2, 1),
                200.0f, 130.f);
//        A.displayInfo();
//        System.out.println("");

        Employee B = new CommissionEmployee(323, name3,
                LocalDate.of(2023, 4, 3),
                LocalDate.of(2003, 4, 2),
                200, 130, 120);

//        B.displayInfo();
//        System.out.println("");
        Employee C = new BasePlusCommissionEmployee(222, name4,
                LocalDate.of(2023, 7, 3),
                LocalDate.of(2003, 9, 22),
                2000, 150, 100, 500);

        Employee update = new PieceWorkerEmployee(name5,
                LocalDate.of(2023, 7, 3),
                LocalDate.of(2003, 9, 22),
                300.0f, 200.0f);

//        C.displayInfo();
//        System.out.println("");
        roster.addEmployee(B);
        roster.addEmployee(C);
        roster.addEmployee(E);
        roster.addEmployee(A);
        roster.addEmployee(P);

        System.out.println("");

        roster.displayAllEmployees();

        System.out.println("");

        search = roster.searchEmployee("Ipong");
        search.displayAllEmployees();
        roster.displayAllEmployees();
        roster.updateEmployee(416, update);
        P.displayInfo();
        System.out.println("There are " + roster.countHourlyEmployee() + " Hourly Employees\n");
        roster.removeEmployee(416);
        roster.displayAllEmployees();
        System.out.println("There are " + roster.countHourlyEmployee() + " Hourly Employees\n");
        roster.removeEmployee(123);
        System.out.println("There are " + roster.countHourlyEmployee() + " Hourly Employees\n");
        System.out.println("There are " + roster.countCommissionEmployee() + " Commission Employees\n");
        System.out.println("There are " + roster.countBasePlusCommisionEmployee() + " Base Plus Commission Employees\n");

//        System.out.println("");
//        
//        roster.displayEmployeeByType("BasePlus");
//        roster.displayEmployeeByType("H");
//        roster.displayEmployeeByType("PI");
        roster.displayEmployeeByType("c");

    }

}
