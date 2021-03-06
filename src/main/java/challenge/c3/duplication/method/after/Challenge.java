package challenge.c3.duplication.method.after;


import challenge.c3.duplication.method.support.Employee;

import java.util.ArrayList;
import java.util.List;

public class Challenge {
    class EmployeeFinder {

        public static final String ENGINEER = "ENGINEER";
        public static final String ADMINISTRATOR = "ADMINISTRATOR";
        private List<Employee> employees;

        public EmployeeFinder(List<Employee> employees) {
            this.employees = employees;
        }

        List<String> findEngineerNames() {
            return find(ENGINEER);
        }

        private List<String> find(String employeeType) {
            List<String> results = new ArrayList<>();
            for (Employee employee : employees) {
                if (employeeType.equalsIgnoreCase(employee.getType())) {
                    results.add(employee.getName());
                }
            }

            return results;
        }

        List<String> findAdministratorNames() {
            return find(ADMINISTRATOR);
        }

    }

}