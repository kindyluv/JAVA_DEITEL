package Chapter5.unknownFiles;

import java.util.Scanner;

public class Nokia {

        public static void main(String... args) {

            Scanner nokia = new Scanner(System.in);
            NokiaLogo.main();
            mainMenu(nokia);
        }


            private static void mainMenu(Scanner nokia) {
                System.out.println("""         
                        1  -> Phonebook                    
                        2  -> Messages                     
                        3  -> Chat                         
                        4  -> Call Register                
                        5  -> Tones                        
                        6  -> Settings                     
                        7  -> Call Divert                  
                        8  -> Games                        
                        9  -> Calculator                   
                        10 -> Remainder                    
                        11 -> Clock                        
                        12 -> Profiles                     
                        13 -> SIM Services                 
                         """);

                System.out.println("Enter option to display menu");

                //System.out.println(mainMenu);

                int userInput = nokia.nextInt();

                switch (userInput) {
                    case 1 -> {
                        phonebook(nokia);
                    }
                    case 2 -> {
                        messages(nokia);
                    }
                    case 3 -> System.out.println("Social Media");
                    case 4 -> {
                        callRegisterMenu(nokia);
                    }
                    case 5 -> {
                        tones(nokia);
                    }
                    case 6 -> {
                        settings(nokia);
                    }
                    case 7 -> System.out.println("Call Divert");
                    case 8 -> System.out.println("Games");
                    case 9 -> System.out.println("Calculator");
                    case 10 -> System.out.println("Remainder");
                    case 11 -> {
                        Clock(nokia);
                    }
                    case 12 -> System.out.println("Profile");
                    case 13 -> System.out.println("SIM Services");
                }
            }

                private static void Clock (Scanner nokia){
                    System.out.println("Clock");
                    String clock = """
                            0 -> Return to mainMenu
                            1 -> Alarm clock
                            2 -> Clock setting
                            3 -> Date setting
                            4 -> Stopwatch
                            5 -> Countdown timer
                            6 -> Auto-update of date and time
                            """;
                    System.out.println(clock);
                    int clockOption = nokia.nextInt();
                    switch (clockOption) {
                        case 0 -> mainMenu(nokia);
                        case 1 -> System.out.println("Alarm clock");
                        case 2 -> System.out.println("Clock setting");
                        case 3 -> System.out.println("Date setting");
                        case 4 -> System.out.println("Stopwatch");
                        case 5 -> System.out.println("Countdown timer");
                        case 6 -> System.out.println("Auto-update of date and time");
                    }
                }

                private static void settings(Scanner nokia){
                    System.out.println("Settings");
                    String settings = """
                            0 -> Return to mainMenu
                            1 -> Call settings
                            2 -> Phone settings
                            3 -> Security settings
                            4 -> Restore factory
                            """;
                    System.out.println(settings);
                    int settingsOption = nokia.nextInt();
                    switch (settingsOption) {
                        case 0 -> mainMenu(nokia);
                        case 1 -> {
                            System.out.println("Call settings");
                            String callSettings = """
                                    -1 -> return to previous settings menu
                                    1 -> Automatic redial
                                    2 -> Speed dialing
                                    3 -> Call waiting options
                                    4 -> Own number sending
                                    5 -> Phone line in use
                                    6 -> Automatic answer
                                    """;
                            System.out.println(callSettings);
                            int callSettingsOption = nokia.nextInt();
                            switch (callSettingsOption) {
                                case -1 -> settings(nokia);
                                case 1 -> System.out.println("Automatic redial");
                                case 2 -> System.out.println("Speed dialing");
                                case 3 -> System.out.println("Call waiting options");
                                case 4 -> System.out.println("Own number sending");
                                case 5 -> System.out.println("Phone line in use");
                                case 6 -> System.out.println("Automatic answer");
                            }
                        }
                        case 2 -> {
                            System.out.println("Phone settings");
                            String phoneSetting = """
                                    -1 -> return to previous settings menu
                                    1 -> Language
                                    2 -> Cell info display
                                    3 -> Welcome note
                                    4 -> Network selection
                                    5 -> Light
                                    6 -> Confirm SIM service option
                                    """;
                            System.out.println(phoneSetting);
                            int phoneSettingOption = nokia.nextInt();
                            switch (phoneSettingOption) {
                                case -1 -> settings(nokia);
                                case 1 -> System.out.println("Language");
                                case 2 -> System.out.println("Cell info display");
                                case 3 -> System.out.println("Welcome note");
                                case 4 -> System.out.println("Network selection");
                                case 5 -> System.out.println("Light");
                                case 6 -> System.out.println("Confirm SIM service option");
                            }
                        }
                        case 3 -> {
                            System.out.println("Security settings");
                            String securitySetting = """
                                    -1 -> return to previous settings menu
                                    1 -> PIN code request
                                    2 -> Call barring service
                                    3 -> Fixed dialling
                                    4 -> Closed user group
                                    5 -> phone security
                                    6 -> Change access codes
                                    """;
                            System.out.println(securitySetting);
                            int securitySettingOption = nokia.nextInt();
                            switch (securitySettingOption) {
                                case -1 -> settings(nokia);
                                case 1 -> System.out.println("PIN code request");
                                case 2 -> System.out.println("Call barring service");
                                case 3 -> System.out.println("Fixed dialling");
                                case 4 -> System.out.println("Closed user group");
                                case 5 -> System.out.println("phone security");
                                case 6 -> System.out.println("Change access codes");
                            }
                        }
                        case 4 -> System.out.println("Restore factory");
                    }
                }

                private static void tones(Scanner nokia){
                    System.out.println("Tones");
                    String tones = """
                            0 -> Return to mainMenu
                            1 -> Ringing tone
                            2 -> Ringing volume
                            3 -> Incoming call alert
                            4 -> Composer
                            5 -> Message alert
                            6 -> Keypad tones
                            7 -> Warning and Game tone
                            8 -> Vibrating alert
                            9 -> Screen saver
                            """;
                    System.out.println(tones);
                    int tonesOption = nokia.nextInt();
                    switch (tonesOption) {
                        case 0 -> mainMenu(nokia);
                        case 1 -> System.out.println("Ringing tone");
                        case 2 -> System.out.println("Ringing volume");
                        case 3 -> System.out.println("Incoming call alert");
                        case 4 -> System.out.println("Composer");
                        case 5 -> System.out.println("Message alert");
                        case 6 -> System.out.println("Keypad tones");
                        case 7 -> System.out.println("Warning and Game tone");
                        case 8 -> System.out.println("Vibrating alert");
                        case 9 -> System.out.println("Screen saver");
                    }
                }

                private static void callRegisterMenu(Scanner nokia){
                    System.out.println("Call Register");
                    String callRegister = """
                            0 -> Return to mainMenu
                            1 -> Missed calls
                            2 -> Received calls
                            3 -> Dialled numbers
                            4 -> Erase recent call lists
                            5 -> Show call duration
                            6 -> Show call costs
                            7 -> Call cost settings
                            8 -> Prepaid credit
                            """;
                    System.out.println(callRegister);
                    int callRegisterOption = nokia.nextInt();
                    switch (callRegisterOption) {
                        case 0: mainMenu(nokia);
                            break;
                        case 1:
                            System.out.println("09033333333");
                            break;
                        case 2:
                            System.out.println("08034345656");
                            break;
                        case 3:
                            System.out.println("07056473245");
                            break;
                        case 4:
                            System.out.println("Call Log Empty");
                            break;
                        case 5:
                            System.out.println("Show call duration");
                            String showCallDuration = """
                                    1 -> Last call duration
                                    2 -> All calls duration
                                    3 -> Receive calls duration
                                    4 -> Dialled calls duration
                                    5 -> Clear timers
                                    -5 -> return to Call Register main menu
                                    """;
                            System.out.println(showCallDuration);
                            int callDuration = nokia.nextInt();
                            switch (callDuration) {
                                case 1 -> System.out.println("Last call duration: \n10:20:27");
                                case 2 -> System.out.println("All calls duration: \n10:20:27");
                                case 3 -> System.out.println("Receive calls duration: \n10:20:27");
                                case 4 -> System.out.println("Dialled calls duration:\n10:20:27");
                                case 5 -> System.out.println("Call timers Cleared");
                                case -5 -> callRegisterMenu(nokia);
                            }
                        case 6:
                            System.out.println("Show call costs");
                            String showCallCosts = """
                                     1 -> Last call cost
                                     2 -> All calls cost
                                     3 -> Clear counters
                                    -5 -> return to Call Register main menu
                                    """;
                            System.out.println(showCallCosts);
                            int callCosts = nokia.nextInt();
                            switch (callCosts) {
                                case 1 -> System.out.println("Call Cost 600 Naira For 30 minutes 20 Seconds");
                                case 2 -> System.out.println("All calls cost 100 Naira For 10 minutes 20 Seconds");
                                case 3 -> System.out.println("Successfully Cleared");
                                case -5 -> callRegisterMenu(nokia);
                            }
                            break;
                        case 7:
                            System.out.println("Call cost settings");
                            String callCostSettings = """
                                    1 -> Call cost limit
                                    2 -> Show costs in
                                    -5 -> return to Call Register main menu
                                    """;
                            System.out.println(callCostSettings);
                            int callSettings = nokia.nextInt();
                            switch (callSettings) {
                                case 1 -> System.out.println("One Hour Per Caller");
                                case 2 -> System.out.println("Show costs in");
                                case -5 -> callRegisterMenu(nokia);
                            }
                            break;
                        case 8:
                            System.out.println("Prepaid credit");
                    }
                }

                private static void messages(Scanner nokia){
                    System.out.println("Message");
                    String messages = """
                            0 -> Return to mainMenu
                            1 -> Write messages
                            2 -> Inbox
                            3 -> Outbox
                            4 -> Picture messages
                            5 -> Templates
                            6 -> Smileys
                            7 -> Message Settings
                            8 -> Info service
                            9 -> Voice mailbox number
                            10 -> Service command editor
                            """;
                    System.out.println(messages);
                    int messageOption = nokia.nextInt();
                    switch (messageOption) {
                        case 0:
                            mainMenu(nokia);
                            break;
                        case 1:
                            System.out.println("Write messages");
                            break;
                        case 2:
                            System.out.println("Inbox");
                            break;
                        case 3:
                            System.out.println("Outbox");
                            break;
                        case 4:
                            System.out.println("Picture messages");
                            break;
                        case 5:
                            System.out.println("Templates");
                            break;
                        case 6:
                            System.out.println("Smileys");
                            break;
                        case 7:
                            System.out.println("Message Settings");
                            String messageSettings = """
                                    -0 -> c
                                    1 -> Set
                                    2 -> Common
                                    """;
                            System.out.println(messageSettings);
                            int messageSettingsOption = nokia.nextInt();
                            switch (messageSettingsOption) {
                                case -0: messages(nokia);
                                case 1:
                                    System.out.println("Set");
                                    String set = """
                                            -0 -> return to message main menu
                                            1 -> Message Centre number
                                            2 -> Message sent as
                                            3 -> Message validity
                                            """;
                                    System.out.println(set);
                                    int setOption = nokia.nextInt();
                                    switch (setOption) {
                                        case -0 -> messages(nokia);
                                        case 1 -> System.out.println("Message Centre number");
                                        case 2 -> System.out.println("Message sent as");
                                        case 3 -> System.out.println("Message validity");
                                    }
                                case 2:
                                    System.out.println("Common");
                                    String common = """
                                            -0 -> return to message main menu
                                            1 -> Delivery reports
                                            2 -> Reply via same centre
                                            3 -> Character support
                                            """;
                                    int commonOption = nokia.nextInt();
                                    switch (commonOption) {
                                        case -0 -> messages(nokia);
                                        case 1 -> System.out.println("Delivery reports");
                                        case 2 -> System.out.println("Reply via same centre");
                                        case 3 -> System.out.println("Character support");
                                    }
                                    break;
                            }
                        case 8:
                            System.out.println("Info service");
                            break;
                        case 9:
                            System.out.println("Voice mailbox number");
                            break;
                        case 10:
                            System.out.println("Service command editor");
                    }
                }

                private static void phonebook(Scanner nokia){
                    System.out.println("Phonebook");
                    String phonebook = """
                            0 -> Return to mainMenu
                            1 -> Search
                            2 -> Service Nos
                            3 -> Add Name
                            4 -> Erase
                            5 -> Edit
                            6 -> Assign tone
                            7 -> Send b'card
                            8 -> Option
                            9 -> Speed Dials
                            10 -> Voice Tags
                            """;
                    System.out.println(phonebook);
                    int phoneOption = nokia.nextInt();
                    switch (phoneOption) {
                        case 0 -> mainMenu(nokia);
                        case 1 -> System.out.println("Search");
                        case 2 -> System.out.println("Service Nos");
                        case 3 -> System.out.println("Contact List");
                        case 4 -> System.out.println("Erase");
                        case 5 -> System.out.println("Edit");
                        case 6 -> System.out.println("RingTone1");
                        case 7 -> System.out.println("Send b'card");
                        case 8 -> {
                            System.out.println("Option");
                            String option = """
                                    1 -> Type of View
                                    2 -> Memory status
                                    -2 -> return to phonebook menu
                                    """;
                            System.out.println(option);
                            int userOption = nokia.nextInt();
                            switch (userOption) {
                                case 1 -> System.out.println("Type of View");
                                case 2 -> System.out.println("Memory status");
                                case -2 -> phonebook(nokia);
                            }
                        }
                        case 9 -> System.out.println("Speed Dials");
                        case 10 -> System.out.println("Voice Tags");
                    }
                }
}



