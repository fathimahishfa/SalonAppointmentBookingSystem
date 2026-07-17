package model;

public class Appointment {

    private int appointmentId;
    private Customer customer;
    private Staff staff;
    private SalonService service;
    private String appointmentDate;
    private String appointmentTime;
    private String status;

    // Default Constructor
    public Appointment() {

    }

    // Parameterized Constructor
    public Appointment(int appointmentId, Customer customer, Staff staff,
                       SalonService service, String appointmentDate,
                       String appointmentTime, String status) {

        this.appointmentId = appointmentId;
        this.customer = customer;
        this.staff = staff;
        this.service = service;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = status;
    }

    // Getters
    public int getAppointmentId() {
        return appointmentId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Staff getStaff() {
        return staff;
    }

    public SalonService getService() {
        return service;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void setService(SalonService service) {
        this.service = service;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {

        return "Appointment ID : " + appointmentId
                + "\nCustomer : " + customer.getCustomerName()
                + "\nStaff : " + staff.getStaffName()
                + "\nService : " + service.getServiceName()
                + "\nDate : " + appointmentDate
                + "\nTime : " + appointmentTime
                + "\nStatus : " + status;

    }

}
