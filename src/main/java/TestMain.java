package main.java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import employee.version1.*;
import java.time.LocalDate;
//import version2.*;
import version3.*;

/**
 *
 * @author MAGDADADADADADADADARO, MATT VINCENT
 */
public class TestMain {

    public static void main(String[] args) {

        Name name1 = new Name()
                .title("Dr.")
                .firstName("Josh")
                .lastName("Juab")
                .middleName("Aparri")
                .suffix("III");

        Name name2 = new Name()
                .firstName("Sarah")
                .lastName("Palabrica");
        
        Name name3 = new Name()
                .firstName("Xander")
                .lastName("Labide")
                .suffix("Sr.");
        
        Name name4 = new Name()
                .firstName("Karylle")
                .lastName("Bernate")
                .middleName("Ordonez")
                .title("Engr.");

        HourlyEmployee E = new HourlyEmployee(123, name1,
                LocalDate.of(2023, 4, 6),
                LocalDate.of(2003, 5, 5),
                10, 60);
        E.displayInfo();

        System.out.println("");

        PieceWorkerEmployee A = new PieceWorkerEmployee(321, name2,
                LocalDate.of(2023, 4, 5),
                LocalDate.of(2003, 2, 1),
                200.0f, 130.f);
        A.displayInfo();
        System.out.println("");

        CommissionEmployee B = new CommissionEmployee(323, name3,
                LocalDate.of(2023, 4, 3),
                LocalDate.of(2003, 4, 2),
                200, 130, 120);

        B.displayInfo();
        System.out.println("");
        
        BasePlusCommissionEmployee C = new BasePlusCommissionEmployee(222, name4,
                LocalDate.of(2023, 7, 3),
                LocalDate.of(2003, 9, 22),
                2000, 150, 100, 500);

        C.displayInfo();
    }

}
