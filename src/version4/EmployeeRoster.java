package version4;

/**
 *
 * @author Matt
 */
public class EmployeeRoster {

    private Employee[] empList;
    private int count = 0;
    private int size = 10;

    public EmployeeRoster() {
        empList = new Employee[size];
    }

    public EmployeeRoster(Employee[] empList) {
        this.empList = new Employee[size];
        this.empList = empList;
    }

    public EmployeeRoster(Employee[] empList, int size) {
        this.empList = empList;
        this.size = size;
        this.empList = new Employee[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void displayAllEmployees() {
        for (Employee employee : empList) {
            if (employee != null) {
                employee.displayInfo();
                System.out.println("");
            }
        }
    }

    public boolean addEmployee(Employee e) {
        if (count < size) {
            empList[count] = e;
            count++;
            System.out.println("EMPLOYEE " + e.getEmpName().getLastName() + " WITH ID #" + e.getEmpID() + " added\n");
            return true;
        } else {
            System.out.println("Roster is full.");
            return false;
        }
    }

    public Employee removeEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && id == empList[i].getEmpID()) {
                Employee removed = empList[i];
                empList[i] = null;
                count--;
                return removed;
            }
        }
        System.out.println("EMPLOYEE #" + id + " NOT FOUND!");
        return null;
    }

    public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster match = new EmployeeRoster();
        for (Employee employee : empList) {
            if (employee != null) {
                String empInfo = employee.getEmpName().toString().toLowerCase();
                String search = keyword.toLowerCase();

                if (empInfo.contains(search) || String.valueOf(employee.getEmpID()).contains(search)) {
                    match.addEmployee(employee);
                }
            }
        }
        return match;

    }

    public int countHourlyEmployee() {
        int cnt = 0;
        for (Employee employee : empList) {
            if (employee instanceof HourlyEmployee) {
                cnt++;
            }
        }

        return cnt;
    }

    public int countPieceWorkerEmployee() {
        int cnt = 0;
        for (Employee employee : empList) {
            if (employee instanceof PieceWorkerEmployee) {
                cnt++;
            }
        }

        return cnt;
    }

    public int countCommissionEmployee() {
        int cnt = 0;
        for (Employee employee : empList) {
            if (employee instanceof CommissionEmployee) {
                cnt++;
            }
        }

        return cnt;
    }

    public int countBasePlusCommisionEmployee() {
        int cnt = 0;
        for (Employee employee : empList) {
            if (employee instanceof BasePlusCommissionEmployee) {
                cnt++;
            }
        }

        return cnt;
    }

    public void displayEmployeeByType(String type) {
        String displayMessage = "";

        switch (type.toUpperCase().charAt(0)) {
            case 'H':
                displayMessage = "Displaying Hourly Employees: \n";
                break;
            case 'C':
                displayMessage = "Displaying Commission Employees: \n";
                break;
            case 'B':
                displayMessage = "Displaying Base Plus Commission Employees: \n";
                break;
            case 'P':
                displayMessage = "Displaying Piece Worker Employees: \n";
                break;
            default:
                System.out.println("Unknown employee type: " + type);
                return;
        }

        System.out.println(displayMessage);

        for (Employee employee : empList) {
            if (employee != null) {
                switch (type.toUpperCase().charAt(0)) {
                    case 'H':
                        if (employee instanceof HourlyEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                        break;
                    case 'C':
                        if (employee instanceof CommissionEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                        break;
                    case 'B':
                        if (employee instanceof BasePlusCommissionEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                        break;
                    case 'P':
                        if (employee instanceof PieceWorkerEmployee) {
                            employee.displayInfo();
                            System.out.println("");
                        }
                        break;
                }
            }
        }
    }

    public void updateEmpName(int id, String prefix, String firstName, String middleName, String lastName, String suffix) {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && id == empList[i].getEmpID()) {
                Name empName = empList[i].getEmpName();
                if (prefix != null) {
                    empName.setTitle(prefix);
                }
                if (firstName != null) {
                    empName.setFirstName(firstName);
                }
                if (middleName != null) {
                    empName.setMiddleName(middleName);
                }
                if (lastName != null) {
                    empName.setLastName(lastName);
                }
                if (suffix != null) {
                    empName.setSuffix(suffix);
                }
                System.out.println("Name updated for Employee #" + id);
                return;
            }
        }
        System.out.println("Employee #" + id + "does not exist!");
    }

    public void updateEmployeeSalary(int id, double newSalary) {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && id == empList[i].getEmpID()) {
                Employee employee = empList[i];

                if (employee instanceof HourlyEmployee) {
                    HourlyEmployee hourlyEmployee = (HourlyEmployee) employee;
                    hourlyEmployee.setRatePerHour((float) (newSalary / hourlyEmployee.getTotalHoursWorked()));
                } else if (employee instanceof CommissionEmployee) {
                    CommissionEmployee commissionEmployee = (CommissionEmployee) employee;
                    commissionEmployee.setRatePerPiece((float) (newSalary / commissionEmployee.getTotalPiecesFinished()));
                } else if (employee instanceof PieceWorkerEmployee) {
                    PieceWorkerEmployee pieceWorkerEmployee = (PieceWorkerEmployee) employee;
                    pieceWorkerEmployee.setRatePerPiece((float) (newSalary / pieceWorkerEmployee.getTotalPiecesFinished()));
                } else if (employee instanceof BasePlusCommissionEmployee) {
                    BasePlusCommissionEmployee basePlusCommissionEmployee = (BasePlusCommissionEmployee) employee;
                    basePlusCommissionEmployee.setBaseSalary(newSalary);
                } else {
                    System.out.println("Invalid employee type!");
                    return;
                }

                System.out.println("Salary updated for Employee #" + id);
                return;
            }
        }
        System.out.println("Employee #" + id + " not found!");
    }

}
