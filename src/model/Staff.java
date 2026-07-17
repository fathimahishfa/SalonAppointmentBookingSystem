package model;

public class Staff {

    private int staffId;
    private String staffName;
    private String specialization;
    private String phoneNumber;
    private boolean available;

    // Default Constructor
    public Staff() {

    }

    // Parameterized Constructor
    public Staff(int staffId, String staffName, String specialization,
                 String phoneNumber, boolean available) {

        this.staffId = staffId;
        this.staffName = staffName;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
        this.available = available;
    }

    // Getters
    public int getStaffId() {
        return staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {

        return "Staff ID : " + staffId +
               "\nStaff Name : " + staffName +
               "\nSpecialization : " + specialization +
               "\nPhone Number : " + phoneNumber +
               "\nAvailable : " + available;

    }

}
