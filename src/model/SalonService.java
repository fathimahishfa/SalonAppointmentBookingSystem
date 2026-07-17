
package model;

public class SalonService {

    private int serviceId;
    private String serviceName;
    private double price;
    private int duration;

    // Default Constructor
    public SalonService() {

    }

    // Parameterized Constructor
    public SalonService(int serviceId, String serviceName, double price, int duration) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.price = price;
        this.duration = duration;
    }

    // Getters
    public int getServiceId() {
        return serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    // Setters
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Service ID : " + serviceId
                + "\nService Name : " + serviceName
                + "\nPrice : Rs. " + price
                + "\nDuration : " + duration + " Minutes";
    }

}