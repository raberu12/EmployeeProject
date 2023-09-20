package version2;

import java.time.LocalDate;

/**
 *
 * @author Matt
 */
public class CommissionEmployee extends Employee {

    private float totalPiecesFinished;
    private double totalSales;
    private float ratePerPiece;

    public CommissionEmployee() {
    }

    public CommissionEmployee(float totalPiecesFinished, double totalSales, float ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.totalSales = totalSales;
        this.ratePerPiece = ratePerPiece;
    }

    public CommissionEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, double totalSales, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.totalSales = totalSales;
        this.ratePerPiece = ratePerPiece;
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

    public double computeSalary() {
        double commissionRate;
        double commissionAmount;
        double pieceAmount;
        double salary;
        double bonus = 0;
        if (getTotalSales() < 50_000) {
            commissionRate = 0.05;
        } else if (getTotalSales() < 100_000) {
            commissionRate = 0.20;
        } else if (getTotalSales() < 500_000) {
            commissionRate = 0.30;
        } else {
            commissionRate = 0.50;
        }
        if (getTotalPiecesFinished() > 100) {
            bonus = getTotalPiecesFinished() / 100 * getRatePerPiece() * 10;
        }
        commissionAmount = getTotalSales() * commissionRate;
        pieceAmount = getTotalPiecesFinished() * getRatePerPiece() + bonus;
        salary = commissionAmount + pieceAmount;
        return salary;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
        System.out.println("Total Pieces Finished: " + getTotalPiecesFinished());
        System.out.println("Rate per Piece: " + getRatePerPiece());
        System.out.println("Get Total Sales: " + getTotalSales());
        System.out.println("Salary: $" + computeSalary());
    }
}
