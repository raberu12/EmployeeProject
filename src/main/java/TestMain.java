package main.java;
import java.time.LocalDate;
//import employee.version1.*;
//import version2.*;
//import version3.*;
import version4.*;

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
        
        HourlyEmployee P = new HourlyEmployee(416, name5, 
                LocalDate.of(2023, 7,8), 
                LocalDate.of(2003, 12, 3), 
                60, 70);

        HourlyEmployee E = new HourlyEmployee(123, name1,
                LocalDate.of(2023, 4, 6),
                LocalDate.of(2003, 5, 5),
                10, 60);
//        E.displayInfo();
//        System.out.println("");


        PieceWorkerEmployee A = new PieceWorkerEmployee(321, name2,
                LocalDate.of(2023, 4, 5),
                LocalDate.of(2003, 2, 1),
                200.0f, 130.f);
//        A.displayInfo();
//        System.out.println("");

        CommissionEmployee B = new CommissionEmployee(323, name3,
                LocalDate.of(2023, 4, 3),
                LocalDate.of(2003, 4, 2),
                200, 130, 120);

//        B.displayInfo();
//        System.out.println("");
        
        BasePlusCommissionEmployee C = new BasePlusCommissionEmployee(222, name4,
                LocalDate.of(2023, 7, 3),
                LocalDate.of(2003, 9, 22),
                2000, 150, 100, 500);

//        C.displayInfo();
//        System.out.println("");
        roster.addEmployee(B);
        roster.addEmployee(C);
        roster.addEmployee(E);
        roster.addEmployee(A);
        roster.addEmployee(P);
        
        roster.displayAllEmployees();
        
        roster.removeEmployee(111);
        System.out.println("");
        
        search = roster.searchEmployee("Ipong");
        search.displayAllEmployees();
        
        int hourlyEmpCount = roster.countHourlyEmployee();
        System.out.println("There are " + hourlyEmpCount + " Hourly Employees");
        System.out.println("");
        
        roster.displayEmployeeByType("BasePlus");
        
    }

}
