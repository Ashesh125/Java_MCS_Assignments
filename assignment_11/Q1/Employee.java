public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return this.dateHired.getDate();
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public String getInfo() {
        return super.getInfo() + ", Office: " + this.office + ", Salary: " + this.salary + ", Date Hired: "
                + this.dateHired.getDate();
    }
}
