public class Staff extends Employee {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff : " + super.getName();
    }

    public class FullTime extends Staff {
        @Override
        public String toString() {
            return "FullTime : " + super.getName();
        }
    }

    public class PartTime extends Staff {
        private static double hourlyWage = 105.5;
        private int hoursWorked;

        public double getHourlyWage() {
            return hourlyWage;
        }

        public int getHoursWorked() {
            return hoursWorked;
        }

        public void setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        public void salary() {
            super.setSalary(hourlyWage * hoursWorked);
        }

        @Override
        public String toString() {
            return "PartTime: " + super.toString();
        }
    }
}
