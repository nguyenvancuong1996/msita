package com.msita.form;

public class EmployeeForm {

    private String name;

    private char gender;

    private String homeTown;

    private int companyId;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(final char gender) {
        this.gender = gender;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(final String homeTown) {
        this.homeTown = homeTown;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(final int companyId) {
        this.companyId = companyId;
    }
}
