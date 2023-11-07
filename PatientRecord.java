import java.util.ArrayList;
import java.util.Scanner;

class PatientRecord
{
    private String name;
    private int age;
    private String gender;
    private ArrayList<String> diagnoses;

    // Default Constructor
    public PatientRecord()
    {
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.diagnoses = new ArrayList<>();
    }

    // Constructor Overloading 1: Creating an instance with name
    public PatientRecord(String name)
    {
        this.name = name;
        this.age = 0;
        this.gender = "";
        this.diagnoses = new ArrayList<>();
    }

    // Constructor Overloading 2: Creating an instance with name, age, and gender
    public PatientRecord(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.diagnoses = new ArrayList<>();
    }

    // Method Overloading 1: Adding a single diagnosis
    public void addDiagnosis(String diagnosis)
    {
        diagnoses.add(diagnosis);
    }

    // Method Overloading 2: Adding multiple diagnoses
    public void addDiagnosis(String... diagnoses)
    {
        for (String diagnosis : diagnoses)
        {
            this.diagnoses.add(diagnosis);
        }
    }

    // Method Overloading 3: Displaying diagnoses
    public void displayDiagnoses()
    {
        if (diagnoses.isEmpty())
        {
            System.out.println("No diagnoses recorded.");
        } 
        else 
        {
            System.out.println("Diagnoses:");
            for (String diagnosis : diagnoses) 
            {
                System.out.println(diagnosis);
            }
        }
    }

    public void displayInfo() {
        System.out.println("Patient Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) 
    {
        // Scenario: Managing a patient's medical record

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient's name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter patient's age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline
        
        System.out.print("Enter patient's gender: ");
        String gender = sc.nextLine();

        PatientRecord patient = new PatientRecord(name, age, gender);

        System.out.print("Enter diagnosis(es) (comma-separated): ");
        String diagnosisInput = sc.nextLine();
        String[] diagnoses = diagnosisInput.split(",");

        patient.addDiagnosis(diagnoses);

        System.out.println();
        patient.displayInfo();
        patient.displayDiagnoses();

        sc.close();
    }
}
