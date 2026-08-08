import java.util.Scanner;

public class SmartAIDrive {

    static Scanner sc = new Scanner(System.in);

    // ============================================================
    // 1. AI VOICE ASSISTANT
    // ============================================================

    static void aiVoiceAssistant() {

        System.out.println("\n===== AI VOICE ASSISTANT =====");

        System.out.println("AI Voice Assistant activated.");
        System.out.println("You can ask:");
        System.out.println("1. Navigate to a location");
        System.out.println("2. Check vehicle health");
        System.out.println("3. Check maintenance");
        System.out.println("4. Emergency SOS");
        System.out.println("5. Vehicle troubleshooting");

        System.out.print("Enter your request: ");
        String request = sc.nextLine();

        System.out.println("AI Assistant: Processing your request...");
        System.out.println("AI Assistant: You said -> " + request);
    }


    // ============================================================
    // 2. CHOOSE AI VOICE
    // ============================================================

    static void chooseAIVoice() {

        System.out.println("\n===== CHOOSE AI VOICE =====");

        System.out.println("1. Male Voice");
        System.out.println("2. Female Voice");
        System.out.println("3. Neutral Voice");

        System.out.print("Choose voice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.println("Male AI Voice selected.");
                break;

            case 2:
                System.out.println("Female AI Voice selected.");
                break;

            case 3:
                System.out.println("Neutral AI Voice selected.");
                break;

            default:
                System.out.println("Invalid voice selection.");
        }
    }


    // ============================================================
    // 3. CUSTOM PERSONAL VOICE
    // ============================================================

    static void customPersonalVoice() {

        System.out.println("\n===== CUSTOM PERSONAL VOICE =====");

        System.out.print("Enter your preferred voice name: ");
        String voiceName = sc.nextLine();

        System.out.println("Personal voice '" + voiceName + "' created successfully.");
        System.out.println("This voice can be used by the AI assistant.");
    }


    // ============================================================
    // 4. MULTILINGUAL VOICE ASSISTANT
    // ============================================================

    static void multilingualVoiceAssistant() {

        System.out.println("\n===== MULTILINGUAL VOICE ASSISTANT =====");

        System.out.println("1. English");
        System.out.println("2. Telugu");
        System.out.println("3. Hindi");
        System.out.println("4. Tamil");
        System.out.println("5. Kannada");

        System.out.print("Choose language: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.println("English voice assistant activated.");
                break;

            case 2:
                System.out.println("Telugu voice assistant activated.");
                break;

            case 3:
                System.out.println("Hindi voice assistant activated.");
                break;

            case 4:
                System.out.println("Tamil voice assistant activated.");
                break;

            case 5:
                System.out.println("Kannada voice assistant activated.");
                break;

            default:
                System.out.println("Language not available.");
        }
    }


    // ============================================================
    // 5. VEHICLE HEALTH ASSISTANT
    // ============================================================

    static void vehicleHealthAssistant() {

        System.out.println("\n===== VEHICLE HEALTH ASSISTANT =====");

        System.out.println("Checking vehicle health...");

        int engineHealth = 90;
        int batteryHealth = 85;
        int tyreHealth = 80;
        int brakeHealth = 88;

        System.out.println("Engine Health : " + engineHealth + "%");
        System.out.println("Battery Health: " + batteryHealth + "%");
        System.out.println("Tyre Health   : " + tyreHealth + "%");
        System.out.println("Brake Health  : " + brakeHealth + "%");

        if (engineHealth >= 80 &&
            batteryHealth >= 80 &&
            tyreHealth >= 80 &&
            brakeHealth >= 80) {

            System.out.println("Vehicle Status: HEALTHY");
        } else {
            System.out.println("Vehicle Status: NEEDS INSPECTION");
        }
    }


    // ============================================================
    // 6. LEVEL ASSISTANT
    // ============================================================

    static void levelAssistant() {

        System.out.println("\n===== LEVEL ASSISTANT =====");

        System.out.print("Enter road slope percentage: ");
        double slope = sc.nextDouble();
        sc.nextLine();

        if (slope < 3) {
            System.out.println("Road Level: Normal");
        } else if (slope < 7) {
            System.out.println("Road Level: Moderate slope");
        } else {
            System.out.println("Road Level: Steep slope");
        }

        System.out.println("AI Level Assistant: Adjust driving carefully.");
    }


    // ============================================================
    // 7. MAINTENANCE ASSISTANT
    // ============================================================

    static void maintenanceAssistant() {

        System.out.println("\n===== MAINTENANCE ASSISTANT =====");

        System.out.println("Vehicle Maintenance Checklist:");

        System.out.println("1. Engine Oil");
        System.out.println("2. Brake Inspection");
        System.out.println("3. Tyre Pressure");
        System.out.println("4. Battery Check");
        System.out.println("5. Air Filter");

        System.out.print("Enter vehicle kilometers: ");
        int km = sc.nextInt();
        sc.nextLine();

        if (km >= 10000) {
            System.out.println("Maintenance Alert:");
            System.out.println("Your vehicle should be serviced.");
            System.out.println("Please inspect the engine, brakes and oil.");
        } else {
            System.out.println("Regular maintenance is sufficient.");
        }
    }


    // ============================================================
    // 8. EMERGENCY SOS
    // ============================================================

    static void emergencySOS() {

        System.out.println("\n===== EMERGENCY SOS =====");

        System.out.println("Emergency SOS activated!");
        System.out.println("Checking vehicle location...");
        System.out.println("Location detected.");
        System.out.println("Emergency contacts notified.");
        System.out.println("Emergency assistance requested.");
    }


    // ============================================================
    // 9. NAVIGATION ASSISTANT
    // ============================================================

    static void navigationAssistant() {

        System.out.println("\n===== NAVIGATION ASSISTANT =====");

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.println("Finding route to " + destination + "...");
        System.out.println("Route calculated successfully.");
        System.out.println("Navigation started.");
    }


    // ============================================================
    // 10. ROAD DAMAGE ALERT
    // ============================================================

    static void roadDamageAlert() {

        System.out.println("\n===== ROAD DAMAGE ALERT =====");

        System.out.println("Scanning road conditions...");

        System.out.print("Is road damage detected? (yes/no): ");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("yes")) {

            System.out.println("ROAD DAMAGE DETECTED!");
            System.out.println("AI Alert: Reduce vehicle speed.");
            System.out.println("AI Alert: Drive carefully.");
            System.out.println("Road damage location can be reported.");
        } else {

            System.out.println("No road damage detected.");
            System.out.println("Road condition is currently normal.");
        }
    }


    // ============================================================
    // 11. SMART MONITORING
    // ============================================================

    static void smartMonitoring() {

        System.out.println("\n===== SMART MONITORING =====");

        System.out.println("Smart monitoring activated.");

        System.out.println("Monitoring:");
        System.out.println("- Vehicle speed");
        System.out.println("- Engine temperature");
        System.out.println("- Battery");
        System.out.println("- Tyre condition");
        System.out.println("- Road condition");
        System.out.println("- Driver safety");

        System.out.println("All monitoring systems are active.");
    }


    // ============================================================
    // 12. AI VEHICLE TROUBLESHOOTING
    // ============================================================

    static void aiVehicleTroubleshooting() {

        System.out.println("\n===== AI VEHICLE TROUBLESHOOTING =====");

        System.out.println("1. Engine overheating");
        System.out.println("2. Battery problem");
        System.out.println("3. Brake problem");
        System.out.println("4. Tyre problem");
        System.out.println("5. General problem");

        System.out.print("Choose problem: ");
        int problem = sc.nextInt();
        sc.nextLine();

        switch (problem) {

            case 1:
                System.out.println(
                    "AI Suggestion: Stop safely and allow the engine to cool."
                );
                System.out.println(
                    "Seek professional assistance if overheating continues."
                );
                break;

            case 2:
                System.out.println(
                    "AI Suggestion: Check battery terminals and battery condition."
                );
                break;

            case 3:
                System.out.println(
                    "AI Suggestion: Stop safely and have the braking system inspected."
                );
                break;

            case 4:
                System.out.println(
                    "AI Suggestion: Check tyre pressure and inspect the tyre."
                );
                break;

            case 5:
                System.out.println(
                    "AI Suggestion: Perform a complete vehicle inspection."
                );
                break;

            default:
                System.out.println("Invalid problem.");
        }
    }


    // ============================================================
    // 13. USER PROFILE & VEHICLE PROFILE
    // ============================================================

    static void userVehicleProfile() {

        System.out.println("\n===== USER & VEHICLE PROFILE =====");

        System.out.print("Enter user name: ");
        String userName = sc.nextLine();

        System.out.print("Enter vehicle model: ");
        String vehicleModel = sc.nextLine();

        System.out.print("Enter vehicle number: ");
        String vehicleNumber = sc.nextLine();

        System.out.println("\nProfile Created Successfully!");

        System.out.println("User Name     : " + userName);
        System.out.println("Vehicle Model : " + vehicleModel);
        System.out.println("Vehicle Number: " + vehicleNumber);
    }


    // ============================================================
    // 14. PRIVACY & SECURITY
    // ============================================================

    static void privacySecurity() {

        System.out.println("\n===== PRIVACY & SECURITY =====");

        System.out.println("User authentication : ENABLED");
        System.out.println("Vehicle profile      : PROTECTED");
        System.out.println("Personal data        : PROTECTED");
        System.out.println("Location sharing     : USER CONTROLLED");

        System.out.println("\nSecurity Recommendation:");

        System.out.println(
            "Only share vehicle and location information "
            + "with trusted services."
        );
    }


    // ============================================================
    // MAIN MENU
    // ============================================================

    public static void main(String[] args) {

        int choice;

        System.out.println("==========================================");
        System.out.println("        SMART AI DRIVE SYSTEM");
        System.out.println("==========================================");

        do {

            System.out.println("\n------------- MAIN MENU ----------------");

            System.out.println("1.  AI Voice Assistant");
            System.out.println("2.  Choose AI Voice");
            System.out.println("3.  Custom Personal Voice");
            System.out.println("4.  Multilingual Voice Assistant");
            System.out.println("5.  Vehicle Health Assistant");
            System.out.println("6.  Level Assistant");
            System.out.println("7.  Maintenance Assistant");
            System.out.println("8.  Emergency SOS");
            System.out.println("9.  Navigation Assistant");
            System.out.println("10. Road Damage Alert");
            System.out.println("11. Smart Monitoring");
            System.out.println("12. AI Vehicle Troubleshooting");
            System.out.println("13. User & Vehicle Profile");
            System.out.println("14. Privacy & Security");
            System.out.println("0.  Exit");

            System.out.println("-----------------------------------------");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    aiVoiceAssistant();
                    break;

                case 2:
                    chooseAIVoice();
                    break;

                case 3:
                    customPersonalVoice();
                    break;

                case 4:
                    multilingualVoiceAssistant();
                    break;

                case 5:
                    vehicleHealthAssistant();
                    break;

                case 6:
                    levelAssistant();
                    break;

                case 7:
                    maintenanceAssistant();
                    break;

                case 8:
                    emergencySOS();
                    break;

                case 9:
                    navigationAssistant();
                    break;

                case 10:
                    roadDamageAlert();
                    break;

                case 11:
                    smartMonitoring();
                    break;

                case 12:
                    aiVehicleTroubleshooting();
                    break;

                case 13:
                    userVehicleProfile();
                    break;

                case 14:
                    privacySecurity();
                    break;

                case 0:
                    System.out.println("\nThank you for using Smart AI Drive.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
