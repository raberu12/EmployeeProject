package version6;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class EmployeeRoster {

    private List<Employee> empList;

    public EmployeeRoster() {
        empList = new ArrayList<>();
    }

    public EmployeeRoster(List<Employee> empList) {
        this.empList = empList;
    }

    public int getSize() {
        return empList.size();
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
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
        if (empList.size() < 10) {
            empList.add(e);
            return true;
        } else {
            System.out.println("Roster is full.\n");
            return false;
        }
    }

    public Employee removeEmployee(int id) {
        Employee removedEmp = null;
        int indexRemove = -1;
        
        for(int i = 0; i < empList.size(); i++){
            Employee employee = empList.get(i);
            if(id == employee.getEmpID()){
                removedEmp = employee;
                indexRemove = i;
                break;
            }
        }
        if(indexRemove != -1){
            empList.remove(indexRemove);
            System.out.println("Employee #" + id + " removed!\n");
            return removedEmp;
        }else{
            System.out.println("Employee with ID #" + id + " does not exist!");
            return null;
        }
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
                "Displaying Hourly Employees:\n";
            case 'P' ->
                "Displaying Piece Worker Employees:\n";
            case 'C' ->
                "Displaying Commission Employees:\n";
            case 'B' ->
                "Displaying Base Plus Commission Employees:\n";
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
        for (int i = 0; i < empList.size(); i++) {
            Employee employee = empList.get(i);
            if (employee != null && id == employee.getEmpID()) {
                empList.set(i, updatedEmp);
                System.out.println("Employee #" + id + " updated\n");
                return true;
            }
        }
        System.out.println("Employee #" + id + " not found!\n");
        return false;
    }
}
