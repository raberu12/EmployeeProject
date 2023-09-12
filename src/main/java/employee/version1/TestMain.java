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
        
        LocalDate dateHired = LocalDate.of(2023, 4, 6);
        LocalDate birthDate = LocalDate.of(2003, 5, 5);

        HourlyEmployee E = new HourlyEmployee(123, "Jacob Dirk", dateHired, birthDate, 20, 10);
        E.displayInfo();
    }

}
