package employee.version1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Matt
 */
public class PieceWorkerEmployee {

    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private float totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, String empName, LocalDate empDateHired,
            LocalDate empBirthDate,
            float totalPiecesFinished,
            float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, LocalDate empDateHired,
            LocalDate empBirthDate, float totalPiecesFinished) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = 50.0f;
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

    public void displayInfo() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Emplyee Name: " + getEmpName());
        System.out.println("Date Hired: " + getEmpDateHired().format(dateFormatter));
        System.out.println("Date of Birth: " + getEmpBirthDate().format(dateFormatter));
        System.out.println("Total Pieces Finished: " + getTotalPiecesFinished());
        System.out.println("Rate per Piece: " + getRatePerPiece());

        double salary = computeSalary();

        System.out.println("Salary: $" + salary);
    }

    @Override
    public String toString() {
        return "PieceWorkerEmployee{" + "empName = " + empName + ", empDateHired = " + empDateHired
                + ", empBirthDate = " + empBirthDate + '}';
    }

}
