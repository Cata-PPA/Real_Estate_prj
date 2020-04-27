package recapitulare;

public class Lawyer extends Employee {


    public Lawyer(double salary,
                   int workingHours,
                   int vacationDays,
                   String vacationForm){
        super(salary, workingHours, vacationDays, vacationForm);

    }

    @Override
    public String getVacationForm(){
        setVacationForm("Pink");
        return super.getVacationForm();
    }


}

