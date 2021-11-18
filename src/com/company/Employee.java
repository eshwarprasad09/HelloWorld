package com.company;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numbersOfEmployee;
    public static void totalEmployees(){
        numbersOfEmployee++;
        System.out.println("Total number of employees are " + numbersOfEmployee);
    }
    public Employee(int baseSalary){
       this(baseSalary,0);
       totalEmployees();
    }
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    } public int calculateWage(){
        return calculateWage(0);
    }
    public void setBaseSalary(int baseSalary){
        if (baseSalary <=0 )
            throw new IllegalArgumentException("Salary can not be 0 or less");
        this.baseSalary = baseSalary;
    }
    public void setHourlyRate(int hourlyRate){
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }
    private int getBaseSalary(){
        return baseSalary;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }
}
