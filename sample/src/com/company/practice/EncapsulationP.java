package com.company.practice;

public class EncapsulationP
{
    private int sno;
    private String empName;
    private int empAge;

    public EncapsulationP(int sno, String empName, int empAge)
    {
        this.sno = sno;
        this.empName = empName;
        this.empAge = empAge;
    }

    public int getSno() {
        return sno;
    }

//    public void setSno(int sno) {
//        this.sno = sno;
//    }

    public String getEmpName() {
        return empName;
    }

//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }

    public int getEmpAge() {
        return empAge;
    }

//    public void setEmpAge(int empAge) {
//        this.empAge = empAge;
//    }

}
class EncapsulationTest
{
    public static void main(String[] args)
    {
        EncapsulationP obj = new EncapsulationP(10,"Sandhya Rani",24);
        System.out.println(obj.getSno()+" "+obj.getEmpName()+" "+obj.getEmpAge());
    }
}
