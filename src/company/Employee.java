package company;

import java.util.Date;

class Employee extends Person {
    protected Date startDate;
    protected long salary;

    public Employee(String name, int yearOfBirth, String address, Date startDate, long salary) {
        super(name, yearOfBirth, address); // вызывает конструктор родительского класса Person
        this.startDate = startDate;
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
