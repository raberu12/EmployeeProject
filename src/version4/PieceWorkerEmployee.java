package version4;

import java.time.LocalDate;

/**
 *
 * @author Matt
 */
public class PieceWorkerEmployee extends Employee {

    private float totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(Name empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, float ratePerPiece) {
        super(empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(float totalPiecesFinished, float ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary() {
        double salary = getTotalPiecesFinished() * getRatePerPiece();
        double bonusAmount = (getTotalPiecesFinished() / 100.0) * (getRatePerPiece() * 10);
        return salary + bonusAmount;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTotal Pieces Finished: " + getTotalPiecesFinished()
                + "\nRate per piece: " + getRatePerPiece()
                + "\nSalary: $" + computeSalary()
                + "\n";

    }
}
