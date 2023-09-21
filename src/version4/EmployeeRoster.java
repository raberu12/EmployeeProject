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
    public EmployeeRoster searchEmployee(String keyword){
        EmployeeRoster match = new EmployeeRoster();
        for(Employee employee : empList){
            if (employee != null){
                String empInfo = employee.getEmpName().toString().toLowerCase();
                String search = keyword.toLowerCase();
                
                if(empInfo.contains(search) || String.valueOf(employee.getEmpID()).contains(search)){
                    match.addEmployee(employee);
                }
            }
        }
        return match;
    }
}
