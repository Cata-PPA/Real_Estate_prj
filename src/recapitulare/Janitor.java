package recapitulare;

public class Janitor extends Employee {

    public Janitor(double salary,
                   int workingHours,
                   int vacationDays,
                   String vacationForm){
        super(salary, workingHours, vacationDays, vacationForm);
    }


    @Override
    public double getSalary(){
        return super.getSalary()-10000;
    }
    @Override
    public int getWorkingHours(){
        return super.getWorkingHours()*2;
    }
    @Override
    public int getVacationDays(){
        return super.getVacationDays()/2;
    }

    public void clean(){
        System.out.println("Workin' for the man");
    }

}
