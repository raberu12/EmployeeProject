/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import employee.version1.*;
import java.time.LocalDate;
import employee.version2.*;

/**
 *
 * @author MAGDADADADADADADADARO, MATT VINCENT
 */
public class TestMain {

    public static void main(String[] args) {

        HourlyEmployee E = new HourlyEmployee(123, "Jacob Dirk",
                LocalDate.of(2023, 4, 6),
                LocalDate.of(2003, 5, 5),
                10, 60);
        E.displayInfo();

        System.out.println("");

        PieceWorkerEmployee A = new PieceWorkerEmployee(321, "Jack Stone",
                LocalDate.of(2023, 4, 5),
                LocalDate.of(2003, 2, 1),
                200.0f, 130.f);
        A.displayInfo();
        System.out.println("");

        CommissionEmployee B = new CommissionEmployee(323, "Achille O'Neal",
                LocalDate.of(2023, 4, 3),
                LocalDate.of(2003, 4, 2),
                200, 130, 120);

        B.displayInfo();
        System.out.println("");
        
        BasePlusCommissionEmployee C = new BasePlusCommissionEmployee(222, "Xander J. Cob",
                LocalDate.of(2023, 7, 3),
                LocalDate.of(2003, 9, 22),
                2000, 150, 100, 500);

        C.displayInfo();
    }

}
