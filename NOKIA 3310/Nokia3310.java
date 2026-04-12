import java.util.Scanner;

     public class Nokia3310{
      public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean powerOn = true;
        int userMenuChoice = 0;
        int subMenuChoice = 0;
        
        while (powerOn) {
            
            System.out.println("\t ===== NOKIA MENU 🤝 ===== \n");
            System.out.println("1. Phone book");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call register");
            System.out.println("5. Tones");
            System.out.println("6. Settings");
            System.out.println("7. Call divert");
            System.out.println("8. Games");
            System.out.println("9. Calculator");
            System.out.println("10. Reminders");
            System.out.println("11. Clock");
            System.out.println("12. Profiles");
            System.out.println("13. SIM services");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            
            userMenuChoice = userInput.nextInt();

            System.out.println();
            
            switch (userMenuChoice) {

                case 1: 

                    System.out.println("\t ==== PHONE BOOK ☎️ ==== \n");
                    System.out.println("1. Search");
                    System.out.println("2. Service Nos.");
                    System.out.println("3. Add name");
                    System.out.println("4. Erase");
                    System.out.println("5. Edit");
                    System.out.println("6. Assign tone");
                    System.out.println("7. Send b'card");
                    System.out.println("8. Options");
                    System.out.println("9. Speed dials");
                    System.out.println("10. Voice tags");
                    System.out.print("Enter choice: ");

                    subMenuChoice = userInput.nextInt();

                    System.out.println();

                    switch (subMenuChoice) {

                        case 1: System.out.println("Search: Find name and phone number"); 
                            break;
                        case 2: System.out.println("Service Nos.: Call service provider"); 
                            break;
                        case 3: System.out.println("Add name: Store name and phone number"); 
                            break;
                        case 4: System.out.println("Erase: Delete names and numbers"); 
                            break;
                        case 5: System.out.println("Edit: Modify stored names/numbers"); 
                            break;
                        case 6: System.out.println("Assign tone: Set ringing tone for caller"); 
                            break;
                        case 7: System.out.println("Send b'card: Send name/number to another phone"); 
                            break;
                        case 8: System.out.println("Options: Type of view / Memory status"); 
                            break;
                        case 9: System.out.println("Speed dials: Assign number keys for speed dialing");
                            break;
                        case 10: System.out.println("Voice tags: Record voice tags for dialing"); 
                            break;

                        default: System.out.println("Invalid option");
                    }

                    break;
                    
                case 2: 

                    System.out.println("\t ==== MESSAGES ✉️  ==== \n");
                    System.out.println("1. Write messages");
                    System.out.println("2. Inbox");
                    System.out.println("3. Outbox");
                    System.out.println("4. Picture messages");
                    System.out.println("5. Templates");
                    System.out.println("6. Smileys");
                    System.out.println("7. Message settings");
                    System.out.println("8. Info service");
                    System.out.println("9. Voice mailbox number");
                    System.out.println("10. Service command editor");
                    System.out.print("Enter choice: ");

                    subMenuChoice = userInput.nextInt();

                    System.out.println();

                    switch (subMenuChoice) {

                        case 1: System.out.println("Write message (max 201 characters)"); 
                            break;
                        case 2: System.out.println("Inbox: Read received messages"); 
                            break;
                        case 3: System.out.println("Outbox: View saved messages"); 
                            break;
                        case 4: System.out.println("Picture messages: Send/receive picture messages");
                             break;
                        case 5: System.out.println("Templates: Use preset messages"); 
                             break;
                        case 6: System.out.println("Smileys: Edit smiley characters like :-)"); 
                             break;
                        case 7: System.out.println("Message settings: Set message centre number"); 
                             break;
                        case 8: System.out.println("Info service: Receive topic-based messages");
                             break;
                        case 9: System.out.println("Voice mailbox number: Store voice mail number");
                             break;
                        case 10: System.out.println("Service command editor: Send service requests"); 
                             break;

                        default: System.out.println("Invalid option");
                    }

                    break;
                    
                case 3: 
                    System.out.println("\t ==== CHATS 💬 ==== \n");

                    System.out.println("Start conversation using text messages");

                    System.out.println("Enter phone number and nickname to begin");
        
                    System.out.println();

                    break;
                    
                case 4: 

                    System.out.println("\t ==== CALL REGISTERS 📲 === \n");
                    System.out.println("1. Missed calls");
                    System.out.println("2. Received calls");
                    System.out.println("3. Dialled numbers");
                    System.out.println("4. Erase recent call lists");
                    System.out.println("5. Show call duration");
                    System.out.println("6. Show call costs");
                    System.out.println("7. Call cost settings");
                    System.out.println("8. Prepaid credit");
                    System.out.print("Enter choice: ");

                    subMenuChoice = userInput.nextInt();

                    System.out.println();

                    switch (subMenuChoice) {

                        case 1: System.out.println("Missed calls: Last 10 unanswered calls"); 
                            break;
                        case 2: System.out.println("Received calls: Last 10 answered calls"); 
                            break;
                        case 3: System.out.println("Dialled numbers: Last 20 called numbers");
                            break;
                        case 4: System.out.println("Erase recent call lists"); 
                            break;
                        case 5: System.out.println("Show call duration: Last/All calls duration"); 
                            break;
                        case 6: System.out.println("Show call costs: Cost of calls"); 
                            break;
                        case 7: System.out.println("Call cost settings: Set cost limit"); 
                            break;
                        case 8: System.out.println("Prepaid credit: Check remaining credit");
                            break;

                        default: System.out.println("Invalid option");
                    }

                    break;
                    
                case 5: 

                    System.out.println("\t ==== TONES 🎶 ==== \n");
                    System.out.println("1. Ringing tone");
                    System.out.println("2. Ringing volume");
                    System.out.println("3. Incoming call alert");
                    System.out.println("4. Composer");
                    System.out.println("5. Message alert tone");
                    System.out.println("6. Keypad tones");
                    System.out.println("7. Warning and game tones");
                    System.out.println("8. Vibrating alert");
                    System.out.println("9. Screen saver");
                    System.out.print("Enter choice: ");

                    subMenuChoice = userInput.nextInt();

                    System.out.println();

                    switch (subMenuChoice) {

                        case 1: System.out.println("Ringing tone: Select ringtone"); 
                                break;
                        case 2: System.out.println("Ringing volume: Adjust volume"); 
                                break;
                        case 3: System.out.println("Incoming call alert: Set alert type"); 
                                break;
                        case 4: System.out.println("Composer: Create your own ringing tone");
                                break;
                        case 5: System.out.println("Message alert tone: Select message tone");
                                break;
                        case 6: System.out.println("Keypad tones: Turn keypad sounds on/off"); 
                                break;
                        case 7: System.out.println("Warning and game tones");
                                break;
                        case 8: System.out.println("Vibrating alert: Turn vibration on/off");
                                break;
                        case 9: System.out.println("Screen saver: Set screen saver"); 
                                break;

                        default: System.out.println("Invalid option");
                    }
                        System.out.println();

                    break;
                    
                case 6:

                    System.out.println("\t ==== SETTINGS 🛠️ ==== \n");
                    System.out.println("1. Call settings");
                    System.out.println("2. Phone settings");
                    System.out.println("3. Security settings");
                    System.out.println("4. Restore factory settings");
                    System.out.print("Enter choice: ");

                    subMenuChoice = userInput.nextInt();
    
                    System.out.println();

                    switch (subMenuChoice) {

                        case 1: System.out.println("Call settings: Auto redial, Speed dialing, Call waiting");
                                break;
                        case 2: System.out.println("Phone settings: Language, Welcome note, Lights"); 
                                break;
                        case 3: System.out.println("Security settings: PIN code, Call barring, Fixed dialing");
                                break;
                        case 4: System.out.println("Restore factory settings: Reset to original values"); 
                                break;

                        default: System.out.println("Invalid option");
                    }

                    break;
                    
                case 7: 
                    System.out.println("\t ==== CALL DIVERT 📬 ==== \n");
                    System.out.println("Direct incoming calls to voice mailbox or another number");
                    System.out.println("Options: Divert when busy, Divert if not answered, etc.");

                    System.out.println();

                    break;
                    
                case 8:
                    System.out.println("\t ==== GAMES 🎮 ==== \n");
                    System.out.println("1. Snake Xenzia");
                    System.out.println("2. Sudoku");
                    System.out.println("3. Bounce");
                    System.out.println("4. Chicken");
                    System.out.print("Choose game: ");

                    subMenuChoice = userInput.nextInt();

                    System.out.println();

                    switch (subMenuChoice) {

                        case 1: System.out.println("Snake Xenzia: Classic snake game"); 
                                
                                break;
                        case 2: System.out.println("Sudoku: Puzzle game"); 
                                break;
                        case 3: System.out.println("Bounce: Bouncing ball game"); 
                                break;
                        case 4: System.out.println("Chicken: Traffic Chicken game"); 
                                break;

                        default: System.out.println("Invalid option");
                    }  
                         System.out.println();

                    break;
                    
                case 9: 
                    System.out.println("\t ==== CALCULATOR 🔢 ==== \n");
                    System.out.println("Use +, -, *, / for calculations");
                    System.out.println("Also supports currency conversion");
    
                    System.out.println();
                    
                    break;
                    
                case 10:
                    System.out.println("\t ==== REMINDER 🔔 ==== \n");
                    System.out.println("1. Add new");
                    System.out.println("2. Erase");
                    System.out.println("3. View all");
                    System.out.print("Enter choice: ");

                    subMenuChoice = userInput.nextInt();

                    System.out.println();

                    switch (subMenuChoice) {

                        case 1: System.out.println("Add new note with or without alarm"); 
                                break;
                        case 2: System.out.println("Erase notes one by one or all at once"); 
                                break;
                        case 3: System.out.println("View all reminders"); 
                                break;

                        default: System.out.println("Invalid option");
                    }
                        System.out.println();

                    break;
                    
                case 11: 
                    System.out.println("\t ==== CLOCK ⏰ ==== \n");
                    System.out.println("1. Alarm clock");
                    System.out.println("2. Clock settings");
                    System.out.println("3. Date setting");
                    System.out.println("4. Stopwatch");
                    System.out.println("5. Countdown timer");
                    System.out.println("6. Auto update of date and time");
                    System.out.print("Enter choice: ");

                    switch (subMenuChoice) {

                        case 1: System.out.println("Alarm clock: Set alarm time");
                                break;
                        case 2: System.out.println("Clock settings: Set time and format"); 
                                break;
                        case 3: System.out.println("Date setting: Set current date"); 
                                break;
                        case 4: System.out.println("Stopwatch: Measure time"); 
                                break;
                        case 5: System.out.println("Countdown timer: Set timer"); 
                                break;
                        case 6: System.out.println("Auto update: Network updates time"); 
                                break;

                        default: System.out.println("Invalid option");
                    }
                        System.out.println();

                    break;
                    
                case 12: 
                    System.out.println("\t ==== PROFILES 👥 ==== \n");
                    System.out.println("1. General");
                    System.out.println("2. Silent");
                    System.out.println("3. Meeting");
                    System.out.println("4. Outdoor");
                    System.out.println("5. Pager");
                    System.out.print("Select profile: ");

                    subMenuChoice = userInput.nextInt();

                    System.out.println();

                    switch (subMenuChoice) {

                        case 1: System.out.println("General: Normal profile"); 
                                break;
                        case 2: System.out.println("Silent: Mute all tones"); 
                                break;
                        case 3: System.out.println("Meeting: Discreet tones"); 
                                break;
                        case 4: System.out.println("Outdoor: Loud tones"); 
                                break;
                        case 5: System.out.println("Pager: Beep only");
                                break;

                        default: System.out.println("Invalid option");
                    }

                        System.out.println();

                    break;
                    
                case 13:
                    System.out.println("\t ==== SIM SERVICES 📶 ==== \n");
                    System.out.println("Additional services provided by your SIM card");
                    System.out.println("Contact your service provider for details");

                    System.out.println();

                    break;
                    
                case 0:
                    System.out.println("\t GOODBYE 🤝");
                    powerOn = false;

                    break;
                    
                    
                default:

                    System.out.println("Invalid choice! Please enter 0-13");
            }
        }
       } 
}
