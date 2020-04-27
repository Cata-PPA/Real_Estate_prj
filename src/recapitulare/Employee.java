package recapitulare;

public class Employee {
    private double salary;
    private int workingHours;
    private int vacationDays;
    private String vacationForm;

    public Employee(double salary,
                    int workingHours,
                    int vacationDays,
                    String vacationForm){
        this.salary=salary;
        this.vacationDays=vacationDays;
        this.workingHours=workingHours;
        this.vacationForm=vacationForm;
    }
//getter
    public double getSalary() {
        return salary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public String getVacationForm(){
        return vacationForm;
    }
//setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    public void setVacationForm(String vacationForm){
        this.vacationForm=vacationForm;
    }


}
