package org.example.ktnc_01.model;

public class NhanVien {

    private int id;
    private String ma;
    private String firstName;
    private String lassName;
    private String position;
    private double salary;

    public NhanVien() {
    }

    public NhanVien(int id, String ma, String firstName, String lassName, String position, double salary) {
        this.id = id;
        this.ma = ma;
        this.firstName = firstName;
        this.lassName = lassName;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLassName() {
        return lassName;
    }

    public void setLassName(String lassName) {
        this.lassName = lassName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
