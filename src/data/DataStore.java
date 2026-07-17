
    
package data;

import model.Customer;
import model.Staff;
import model.SalonService;
import model.Appointment;

public class DataStore {

    // Customer Array
    public static Customer[] customers = new Customer[100];
    public static int customerCount = 0;

    // Staff Array
    public static Staff[] staffs = new Staff[20];
    public static int staffCount = 0;

    // Salon Service Array
    public static SalonService[] services = new SalonService[20];
    public static int serviceCount = 0;

    // Appointment Array
    public static Appointment[] appointments = new Appointment[100];
    public static int appointmentCount = 0;

}
