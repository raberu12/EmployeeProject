/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.time.LocalDate;

/**
 *
 * @author MAGDADADADADADADADARO, MATT VINCENT
 */
public class TestMain {

    public static void main(String[] args) {

        HourlyEmployee E = new HourlyEmployee(123, "Jacob Dirk",
                LocalDate.of(2023, 4, 6),
                LocalDate.of(2003, 5, 5),
                20, 10);

        E.displayInfo();

        PieceWorkerEmployee A = new PieceWorkerEmployee(321, "Jack Stone",
                LocalDate.of(2023, 4, 5),
                LocalDate.of(2003, 2, 1),
                20.0f, 30.f);
        A.displayInfo();

        CommissionEmployee B = new CommissionEmployee(323, "Achille O'Neal",
                LocalDate.of(2023, 4, 3),
                LocalDate.of(2003, 4, 2),
                20, 30, 30);

        B.displayInfo();

        BasePlusCommissionEmployee C = new BasePlusCommissionEmployee(222, "Xander J. Cob",
                LocalDate.of(2023, 7, 3),
                LocalDate.of(2003, 9, 22),
                20, 30, 30, 100);

        C.displayInfo();
    }

}
