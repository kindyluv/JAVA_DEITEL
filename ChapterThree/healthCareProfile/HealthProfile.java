package chapter3;

import java.util.InputMismatchException;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private int day = 0;
    private int year;

    public HealthProfile(String firstName, String lastName, String gender, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setGender(String sex) {
//        this.gender = sex;
//
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//
//    public void setDayOfBirth(int day) {
//        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 && year % 400 == 0;
//        boolean isJanuaryMarchMayJulyAugustOctoberDecember = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
//        boolean isSeptemberAprilJuneNovember = month == 4 || month == 6 || month == 9 || month == 11;
//
//        if (day >= 1) {
//            if (month == 2 && isLeapYear && day <= 29) {
//                this.day = day;
//            } else if (month == 2 && (!isLeapYear) && day <= 28) {
//                this.day = day;
//            } else if (isJanuaryMarchMayJulyAugustOctoberDecember && day <= 31) {
//                this.day = day;
//            } else if (isJanuaryMarchMayJulyAugustOctoberDecember && day >= 32){
//                this.day = 31;
//            } else if (isSeptemberAprilJuneNovember && day < 31){
//                this.day = day;
//            }else if ((isSeptemberAprilJuneNovember && day >= 31)) {
//                this.day = 30;
//            }
//        }
//    }
//
//    public int getDayOfBirth() {
//        return day;
//    }
//
//    public void setMonthOfBirth(int month) {
//        if (month >0 && month < 13){
//            this.month = month;
//        }else if(month <0 && month > 12){
//            this.month = 12;
//        }
//    }
//
//    public int getMonthOfBirth() {
//        return month;
//    }
//
//    public void setYearOfBirth(int year) {
//        if (year >=1000 && year <= 9999) {
//            this.year = year;
//        }else if (year > 10000) {
//            this.year = 9999;
//        }
//    }
//
//    public int getYearOfBirth() {
//        return year;
//    }

}