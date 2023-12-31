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
        for (Employee emp : empList) {
            if (emp != null) {
                StringBuilder sb = new StringBuilder();

                sb.append(String.format("| %-5d", emp.getEmpID()));
                sb.append(String.format("| %-30s", emp.getEmpName()));
                sb.append(String.format("| %-30s|", emp.getClass().getSimpleName()));

                System.out.println(sb.toString());
            }
        }
        System.out.println("");
    }

    public boolean addEmployee(Employee e) {
        if (count < size) {
            empList[count] = e;
            count++;
            System.out.println("EMPLOYEE " + e.getEmpName().getLastName() + " WITH ID #" + e.getEmpID() + " added");
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

                for (int j = i; j < count; j++) {
                    empList[j] = empList[j + 1];
                }

                empList[count - 1] = null;
                count--;
                return removed;
            }
        }
        System.out.println("Employee with ID #" + id + " is not found!");
        return null;
    }

    public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster matchingEmployee = new EmployeeRoster();
        String search = keyword.toLowerCase();
        for (Employee employee : empList) {
            if (employee != null) {
                String empName = employee.getEmpName().toString().toLowerCase();
                String empIdString = String.valueOf(employee.getEmpID());

                if (empName.contains(search) || empIdString.contains(search)) {
                    matchingEmployee.addEmployee(employee);
                }
            }
        }
        return matchingEmployee;
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
        String displayMessage = switch (type.toUpperCase().charAt(0)) {
            case 'H' ->
                "Displaying Hourly Employees:";
            case 'P' ->
                "Displaying Piece Worker Employees:";
            case 'C' ->
                "Displaying Commission Employees";
            case 'B' ->
                "Displaying Base Plus Commission Employees";
            default ->
                "Unknown type";
        };

        System.out.println(displayMessage);

        for (Employee employee : empList) {
            if (employee != null) {
                if (matchEmployeeType(employee, type)) {
                    employee.displayInfo();
                    System.out.println();
                }
            }
        }
    }

    private boolean matchEmployeeType(Employee employee, String type) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'H' ->
                employee instanceof HourlyEmployee;
            case 'P' ->
                employee instanceof PieceWorkerEmployee;
            case 'C' ->
                employee instanceof CommissionEmployee;
            case 'B' ->
                employee instanceof BasePlusCommissionEmployee;
            default ->
                false;
        };
    }

    public boolean updateEmployee(int id, Employee updatedEmp) {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && id == empList[i].getEmpID()) {
                empList[i] = updatedEmp;
                System.out.println("Employee #" + id + " updated");
                return true;
            }
        }
        System.out.println("Employee #" + id + " not found!");
        return false;
    }
}
