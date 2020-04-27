package recapitulare;

public class Marketer extends Employee{


    public Marketer(double salary,
                   int workingHours,
                   int vacationDays,
                   String vacationForm,
                   String advertise){
        super(salary, workingHours, vacationDays, vacationForm);

    }


    @Override
    public double getSalary(){
        return super.getSalary()+10000;
    }

    public void advertise(){
        System.out.println("Act now, while supplies last!");
    }

}
