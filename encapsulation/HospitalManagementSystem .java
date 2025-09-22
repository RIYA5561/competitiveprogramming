// Abstract Class Patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation: Getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bill Amount: " + calculateBill());
        System.out.println("----------------------------");
    }
}

// InPatient Class
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}

// OutPatient Class
class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

// Main Class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Polymorphism: Different patients in one array
        Patient[] patients = new Patient[2];

        patients[0] = new InPatient(101, "Ravi Kumar", 45, 5, 2000);
        patients[1] = new OutPatient(102, "Sneha Sharma", 30, 500);

        System.out.println("------ Patient Records ------");
        for (Patient p : patients) {
            p.getPatientDetails(); // Polymorphic call
        }
    }
}
