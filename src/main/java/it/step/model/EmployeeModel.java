package it.step.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {
    private int rowsPerPage=10;
    private static EmployeeModel instance = new EmployeeModel();
    private List <Employee> employeeList = new ArrayList<Employee>();

   //singleton
    public static EmployeeModel getInstance(){
        return instance;
    }

    //constructor
    private EmployeeModel(){

        for (int i =0; i<100; i++){
            this.employeeList.add(new Employee(i, "John"+i, "Smith"+i, LocalDate.now()));

        }

    }

   private List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void add(Employee e){
        int nextId= this.employeeList.size();
        this.employeeList.add(new Employee(nextId, e.getName(), e.getSurname(), e.getBirthdate()));
    }

    public Employee get(int id){
        int index=-1;
        for (int i =0; i<employeeList.size();i++){
            if(employeeList.get(i).getId()==id)
                index=i;
       } return this.employeeList.get(index);
    }

    public void edit(int id, String name, String surname, LocalDate birthdate) {
        int index=-1;
        for (int i =0; i<employeeList.size();i++){
            if(employeeList.get(i).getId()==id){
                index=i; break;
            }
        }
        if(index!=-1){
        employeeList.get(index).setName(name);
        employeeList.get(index).setSurname(surname);
        employeeList.get(index).setBirthdate(birthdate);}}

    public List<Employee> getPage(int page){
// rowsPerPage variabila globala
        int to = page*rowsPerPage;
        int from = to-rowsPerPage;
        to=Math.min(to, employeeList.size());
        //sublist accepta 2 parametri , pana si dupa
        return employeeList.subList(from,to);

    }

    public int getTotalPages(){
       int numberOfPages= this.employeeList.size()/rowsPerPage;
       int rest = this.employeeList.size()%rowsPerPage;
       if(rest>0){numberOfPages+=1;}
        return numberOfPages;
    }

    public int getTotalPages(String filter){
        List <Employee> filtered = new ArrayList<>();
        for(Employee employee: this.employeeList){
            if(employee.getName().contains(filter)||employee.getSurname().contains(filter)){
                filtered.add(employee);}}
        int numberOfPages= filtered.size()/rowsPerPage;
        int rest = filtered.size()%rowsPerPage;
        if(rest>0){numberOfPages+=1;}
        return numberOfPages;
    }

    public void delete(int id){
        int index=-1;
        for (int i =0; i<employeeList.size();i++){
            if(employeeList.get(i).getId()==id){
                index=i; break;
            }
        }
        if(index!=-1) employeeList.remove(index);
    }

    public List<Employee> search(String searchBy, int page) {
        List <Employee> filtered = new ArrayList<>();
        for(Employee employee: this.employeeList){
            if(employee.getName().contains(searchBy)||employee.getSurname().contains(searchBy)){
                filtered.add(employee);
            }
        }
        int to = page*rowsPerPage;
        int from = to-rowsPerPage;
        to=Math.min(to, filtered.size());

return filtered.subList(from, to);
    }
}
