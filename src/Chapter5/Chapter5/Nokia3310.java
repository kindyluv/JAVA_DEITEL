package ChapterFour;

import java.util.Scanner;

public class Nokia3310 {

    public static void main(String[] args) {

        Scanner nokia = new Scanner(System.in);

String mainMenu = """
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
    
        """;

        System.out.println("Enter option to display menu");
        System.out.println(mainMenu);
        int userInput = nokia.nextInt();

    switch(userInput){
        case 1:
            System.out.println("Phonebook");
            String phonebook = """
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

            switch (phoneOption){
                case 1:
                    System.out.println("Search");
                    break;
                case 2:
                    System.out.println("Service Nos");
                    break;
                case 3:
                    System.out.println("Add Name");
                    break;
                case 4:
                    System.out.println("Erase");
                    break;
                case 5:
                    System.out.println("Edit");
                    break;
                case 6:
                    System.out.println("Assign tone");
                    break;
                case 7:
                    System.out.println("Send b'card");
                    break;
                case 8 :
                    System.out.println("Option");
                    String option = """
                        1 -> Type of View
                        2 -> Memory status
                        """;
                    System.out.println(option);
                    int userOption = nokia.nextInt();
                    switch (userOption){
                        case 1:
                            System.out.println("Type of View");
                            break;
                        case 2:
                            System.out.println("Memory status");
                            break;
                    }
                    break;
                case 9:
                    System.out.println("Speed Dials");
                    break;
                case 10:
                    System.out.println("Voice Tags");
            }
        break;
    case 2:
        System.out.println("Message");
        String messages = """
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
        switch (messageOption){
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
                    1 -> Set
                    2 -> Common
                    """;
                System.out.println(messageSettings);
                int messageSettingsOption = nokia.nextInt();
                switch (messageSettingsOption){
                    case 1:
                        System.out.println("Set");
                        String set = """
                            1 -> Message Centre number
                            2 -> Message sent as
                            3 -> Message validity
                            """;
                        System.out.println(set);
                        int setOption = nokia.nextInt();
                        switch (setOption){
                            case 1:
                                System.out.println("Message Centre number");
                                break;
                            case 2:
                                System.out.println("Message sent as");
                                break;
                            case 3:
                                System.out.println("Message validity");
                        }
                    case 2:
                        System.out.println("Common");
                        String common = """
                            1 -> Delivery reports
                            2 -> Reply via same centre
                            3 -> Character support
                            """;
                        int commonOption = nokia.nextInt();
                        switch (commonOption){
                            case 1:
                                System.out.println("Delivery reports");
                                break;
                            case 2:
                                System.out.println("Reply via same centre");
                                break;
                            case 3:
                                System.out.println("Character support");
                        }
                        break;
                }
            case 8 :
                System.out.println("Info service");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service command editor");
        }
        break;
    case 3:
        System.out.println("Chat");
        break;
    case 4:
        System.out.println("Call Register");
        String callRegister = """
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
        switch (callRegisterOption){
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
            case 5:
                System.out.println("Show call duration");
                String showCallDuration = """
                    1 -> Last call duration
                    2 -> All calls duration
                    3 -> Receive calls duration
                    4 -> Dialled calls duration
                    5 -> Clear timers
                    """;
                System.out.println(showCallDuration);
                int callDuration = nokia.nextInt();
                switch (callDuration){
                    case 1:
                        System.out.println("Last call duration");
                        break;
                    case 2:
                        System.out.println("All calls duration");
                        break;
                    case 3:
                        System.out.println("Receive calls duration");
                        break;
                    case 4:
                        System.out.println("Dialled calls duration");
                        break;
                    case 5:
                        System.out.println("Clear timers");
                }
            case 6:
                System.out.println("Show call costs");
                String showCallCosts = """
                        1 -> Last call cost
                        2 -> All calls cost
                        3 -> Clear counters
                       """;
                System.out.println(showCallCosts);
                int callCosts = nokia.nextInt();
                switch (callCosts){
                    case 1:
                        System.out.println("Last call cost");
                        break;
                    case 2:
                        System.out.println("All calls cost");
                        break;
                    case 3:
                        System.out.println("Clear counters");
                }
                break;
            case 7:
                System.out.println("Call cost settings");
                String callCostSettings = """
                        1 -> Call cost limit
                        2 -> Show costs in
                        """;
                System.out.println(callCostSettings);
                int callSettings = nokia.nextInt();
                switch (callSettings){
                    case 1:
                        System.out.println("Call cost limit");
                        break;
                    case 2:
                        System.out.println("Show costs in");
                }
                break;
            case 8:
                System.out.println("Prepaid credit");
        }
        break;
    case 5:
        System.out.println("Tones");
        String tones = """
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
        switch (tonesOption){
            case 1:
                System.out.println("Ringing tone");
                break;
            case 2:
                System.out.println("Ringing volume");
                break;
            case 3:
                System.out.println("Incoming call alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert");
                break;
            case 6:
                System.out.println("Keypad tones");
                break;
            case 7:
                System.out.println("Warning and Game tone");
                break;
            case 8:
                System.out.println("Vibrating alert");
                break;
            case 9:
                System.out.println("Screen saver");
        }
        break;
    case  6:
        System.out.println("Settings");
        String settings = """
           1 -> Call settings
           2 -> Phone settings
           3 -> Security settings
           4 -> Restore factory
           """;
        System.out.println(settings);
        int settingsOption = nokia.nextInt();
        switch (settingsOption){
            case 1:
                System.out.println("Call settings");
                String callSettings = """
                        1 -> Automatic redial
                        2 -> Speed dialing
                        3 -> Call waiting options
                        4 -> Own number sending
                        5 -> Phone line in use
                        6 -> Automatic answer
                        """;
                System.out.println(callSettings);
                int callSettingsOption = nokia.nextInt();
                switch (callSettingsOption){
                    case 1:
                        System.out.println("Automatic redial");
                        break;
                    case 2:
                        System.out.println("Speed dialing");
                        break;
                    case 3:
                        System.out.println("Call waiting options");
                        break;
                    case 4:
                        System.out.println("Own number sending");
                        break;
                    case 5:
                        System.out.println("Phone line in use");
                        break;
                    case 6:
                        System.out.println("Automatic answer");
                }
                break;
            case 2:
                System.out.println("Phone settings");
                String phoneSetting = """
                        1 -> Language
                        2 -> Cell info display
                        3 -> Welcome note
                        4 -> Network selection
                        5 -> Light
                        6 -> Confirm SIM service option
                        """;
                System.out.println(phoneSetting);
                int phoneSettingOption = nokia.nextInt();
                switch (phoneSettingOption){
                    case 1:
                        System.out.println("Language");
                        break;
                    case 2:
                        System.out.println("Cell info display");
                        break;
                    case 3:
                        System.out.println("Welcome note");
                        break;
                    case 4:
                        System.out.println("Network selection");
                        break;
                    case 5:
                        System.out.println("Light");
                        break;
                    case 6:
                        System.out.println("Confirm SIM service option");
                }
                break;
            case 3:
                System.out.println("Security settings");
                String securitySetting = """
                        1 -> PIN code request
                        2 -> Call barring service
                        3 -> Fixed dialling
                        4 -> Closed user group
                        5 -> phone security
                        6 -> Change access codes
                        """;
                System.out.println(securitySetting);
                int securitySettingOption = nokia.nextInt();
                switch (securitySettingOption){
                    case 1:
                        System.out.println("PIN code request");
                        break;
                    case 2:
                        System.out.println("Call barring service");
                        break;
                    case 3:
                        System.out.println("Fixed dialling");
                        break;
                    case 4:
                        System.out.println("Closed user group");
                        break;
                    case 5:
                        System.out.println("phone security");
                        break;
                    case 6:
                        System.out.println("Change access codes");
                }
                break;
            case 4:
                System.out.println("Restore factory");
        }
        break;
    case 7:
        System.out.println("Call Divert");
        break;
    case 8:
        System.out.println("Games");
        break;
    case 9:
        System.out.println("Calculator");
        break;
    case 10:
        System.out.println("Remainder");
        break;
    case 11:
        System.out.println("Clock");
        String clock = """
            1 -> Alarm clock
            2 -> Clock setting
            3 -> Date setting
            4 -> Stopwatch
            5 -> Countdown timer
            6 -> Auto-update of date and time
            """;
        System.out.println(clock);
        int clockOption = nokia.nextInt();
        switch (clockOption){
            case 1:
                System.out.println("Alarm clock");
                break;
            case 2:
                System.out.println("Clock setting");
                break;
            case 3:
                System.out.println("Date setting");
                break;
            case 4:
                System.out.println("Stopwatch");
                break;
            case 5:
                System.out.println("Countdown timer");
                break;
            case 6:
                System.out.println("Auto-update of date and time");
        }
        break;
    case 12:
        System.out.println("Profile");
         break;
    case 13:
        System.out.println("SIM Services");
        break;
      }
    }
}
