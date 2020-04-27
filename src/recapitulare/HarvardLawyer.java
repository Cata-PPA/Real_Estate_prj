package recapitulare;

public class HarvardLawyer extends Lawyer {
    public HarvardLawyer(double salary,
                         int workingHours,
                         int vacationDays,
                         String vacationForm){
    super(salary, workingHours, vacationDays, vacationForm);
}
    @Override
    public double getSalary(){
        return super.getSalary()+super.getSalary()/5;
    }

    @Override
    public int getVacationDays(){
        return super.getVacationDays()+3;
    }

    @Override
    public String getVacationForm(){
        return super.getVacationForm()+super.getVacationForm()+super.getVacationForm()+super.getVacationForm();
    }


}
