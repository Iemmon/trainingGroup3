package task3.store.model;

import java.util.Arrays;
import java.util.Comparator;

public class Store {
    private String name;
    private Department[] departments = new Department[5];
    private int numOfDepartments;

    public class Department {
        String name;
        String goods;
        String service;
        String location;

        public Department(String name, String goods, String service, String location) {
            this.name = name;
            this.goods = goods;
            this.service = service;
            this.location = location;
        }

        @Override
        public String toString() {
            return "Department:" + name + '\n' +
                    "goods: " + goods + '\n' +
                    "service: " + service + '\n' +
                    "location: " + location + '\n';
        }
    }

    public Store(String name) {
        this.name = name;
    }

    public boolean createDepartment(String name, String goods, String service, String location) {
        int initLength = numOfDepartments;
        if (departments.length <= numOfDepartments) {
            departments = Arrays.copyOf(departments, numOfDepartments + 5);
        }
        departments[numOfDepartments++] = new Department(name, goods, service, location);
        return numOfDepartments > initLength;
    }

    public void removeDepartment(String name) {
        int index = findDepartment(name);
        if (index < 0) return;
        for (int i = 0; i < departments.length; i++) {
            if (i == index) {
                departments[i] = null;
            }
            if (i > index) {
                departments[i - 1] = departments[i];
            }
        }
        departments = Arrays.copyOf(departments, departments.length - 1);
        numOfDepartments--;

    }

    private int findDepartment(String name) {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String dept = "";
        for (Department d : departments) {
            if (d == null) break;
            dept += d.toString() + "\n";
        }

        return "Store name: " + name + '\n' +
                "departments: \n" + dept +
                "numOfDepartments=" + numOfDepartments;
    }

    public Department[] sortDepartmentByLocation() {
        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department d1, Department d2) {
                return d1.location.compareToIgnoreCase(d2.location);
            }
        });
        return departments;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public int getNumOfDepartments() {
        return numOfDepartments;
    }
}
