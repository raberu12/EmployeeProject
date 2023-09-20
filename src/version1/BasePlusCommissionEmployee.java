package version1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Matt
 */
public class BasePlusCommissionEmployee {

    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private float totalPiecesFinished;
    private double totalSales;
    private float ratePerPiece;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, double totalSales, float ratePerPiece, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.totalSales = totalSales;
        this.ratePerPiece = ratePerPiece;
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, double totalSales, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.totalSales = totalSales;
        this.ratePerPiece = ratePerPiece;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public LocalDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(LocalDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {

        double commissionRate;
        double commissionAmount;
        double pieceAmount;
        double salary;
        if (getTotalSales() < 50_000) {
            commissionRate = 0.05;
        } else if (getTotalSales() < 100_000) {
            commissionRate = 0.20;
        } else if (getTotalSales() < 500_000) {
            commissionRate = 0.30;
        } else {
            commissionRate = 0.50;
        }

        commissionAmount = getTotalSales() * commissionRate;
        pieceAmount = getTotalPiecesFinished() * getRatePerPiece();
        salary = commissionAmount + pieceAmount + getBaseSalary();
        
        return salary;
    }

    public void displayInfo() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Emplyee Name: " + getEmpName());
        System.out.println("Date Hired: " + getEmpDateHired().format(dateFormatter));
        System.out.println("Date of Birth: " + getEmpBirthDate().format(dateFormatter));
        System.out.println("Total Pieces Finished: " + getTotalPiecesFinished());
        System.out.println("Rate per Piece: " + getRatePerPiece());
        System.out.println("Base Salary: " + getBaseSalary());

        double salary = computeSalary();

        System.out.println("Salary: $" + salary);
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" + "empID=" + empID + ", empName=" + empName
                + ", empDateHired =" + empDateHired
                + ", empBirthDate =" + empBirthDate
                + ", totalPiecesFinished =" + totalPiecesFinished
                + ", totalSales =" + totalSales
                + ", ratePerPiece =" + ratePerPiece
                + ", baseSalary =" + baseSalary + '}';
    }

}
