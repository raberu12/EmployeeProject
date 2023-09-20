package version2;

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

    public PieceWorkerEmployee(float totalPiecesFinished, float ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, float ratePerPiece) {
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

        double bonusPieces = getTotalPiecesFinished() / 100.0;
        double bonusAmount = bonusPieces * (getRatePerPiece() * 10);

        salary += bonusAmount;

        return salary;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
        System.out.println("Total Pieces Finished: " + getTotalPiecesFinished());
        System.out.println("Rate per Piece: " + getRatePerPiece());
        System.out.println("Salary: $" + computeSalary());
    }
}
