package ChapterFour;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;

        if (age < 0 && age > 100){
            System.out.println();
        }
    }

    public int getAge() {
        return age;
    }

 //   public boolean isTeen() {
//
 //   }


}
