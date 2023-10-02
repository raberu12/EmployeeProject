package version5;

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

    public CommissionEmployee(Name empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, double totalSales, float ratePerPiece) {
        super(empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.totalSales = totalSales;
        this.ratePerPiece = ratePerPiece;
    }

    public CommissionEmployee(float totalPiecesFinished, double totalSales, float ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.totalSales = totalSales;
        this.ratePerPiece = ratePerPiece;
    }

    public CommissionEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, double totalSales, float ratePerPiece) {
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
        double rate = 0.05;

        if (totalSales < 100_000) {
            rate = 0.20;
        } else if (totalSales < 500_000) {
            rate = 0.30;
        } else {
            rate = 0.50;
        }

        return totalSales * rate;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTotal Pieces Finished: " + getTotalPiecesFinished()
                + "\nTotal Sales: " + getTotalSales()
                + "\nRate per Piece: $" + getRatePerPiece()
                + "\nSalary: $" + computeSalary()
                + "\n";

    }
}
