package task3.store.model;

public class StoreModel {
    Store store = new Store("Shopping Mall");

    public boolean addDepartment(String input) {
        String[] deptInfo = input.split(",");
        System.out.println(input);
        return store.createDepartment(deptInfo[0], deptInfo[1], deptInfo[2], deptInfo[3]);
    }

    public void removeDepartment(String name){
        store.removeDepartment(name);
    }

    public Store.Department[] sortByLocation(){
        return store.sortDepartmentByLocation();
    }

    public Store.Department[] getDepartments(){
        return store.getDepartments();
    }

    public int getNumOfDepartments(){
        return  store.getNumOfDepartments();
    }

}
