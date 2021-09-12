package ChapterThree;

//declare instance variable month as type int
//declare instance variable day as type int
//declare instance variable year as type int
//declare a class constructor that initializes the three instance variable
//create a set and get methods for each instance variable
//create a method displayDate that displays all the instance variable seperately by forward slashes (/)
// test for the class date capabilities

public class Date {
    private int month;
    private int day;
    private int year;


    public Date(int day, int month, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setDay(int day) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        boolean isSeptemberAprilJuneNovember = (month == 4 || month == 6 || month == 9 || month == 11);
        boolean isJanuaryMarchMayJulyAugustOctoberDecember = (month == 1 || month == 3 || month == 7 || month == 8 ||
                month == 10 || month == 12);

        if (day >= 1) {
            if (month == 2 && isLeapYear && day <= 29) {
                this.day = day;
            } else if (month == 2 && day <= 28) {
                this.day = day;
            } else if (isSeptemberAprilJuneNovember && day < 31) {
                this.day = day;
            } else if (isSeptemberAprilJuneNovember && day >= 31) {
                this.day = 30;
            } else if (isJanuaryMarchMayJulyAugustOctoberDecember && day < 32) {
                this.day = day;
            }else if (isJanuaryMarchMayJulyAugustOctoberDecember && day >= 32) {
                this.day = 31;
            }
        }
    }

        public int getDay () {
            return day;
        }

        public void setMonth ( int month){
            if (month > 0 && month <= 12) {
                this.month = month;
            } else if (month < 1) {
                this.month = 1;
            } else {
                this.month = 12;
            }
        }

        public int getMonth () {
            return month;
        }
//
//        public void setYear ( int year){
//            this.year = year;
//        }
//
//        public int getYear () {
//            return year;
//        }
//
//        public String displayDate () {
//            return (String) "" + day + "/" + month + "/" + year;
//        }

    }
