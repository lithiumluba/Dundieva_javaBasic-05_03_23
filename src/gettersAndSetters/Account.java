package gettersAndSetters;

public class Account {
    private String firstName;
    private int day;
    private int month;
    private int year;
    private int age;
    private String email;
    private String phone;

    private String lastName;
    private String weight;
    private String pressure;
    private int stepsPerDay;

    public Account(String userFistName, String userLastName, int dayOfBirth, int monthOfBirth, int yearOfBirth,
                   String userWeight, String userPressure, int userStepsPerDay, String userEmail, String userPhone) {
        firstName = userFistName;
        lastName = userLastName;
        day = dayOfBirth;
        month = monthOfBirth;
        year = yearOfBirth;
        weight = userWeight;
        pressure = userPressure;
        stepsPerDay = userStepsPerDay;
        email = userEmail;
        phone = userPhone;
        age = 2023 - year;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public void printAccountInfo() {
        System.out.println("Ім я та Прізвище клієнта: " + firstName + " " + lastName);
        System.out.println("Дата народження: " + day + "/" + month + "/" + year);
        System.out.println("Вік: " + age);
        System.out.println("Номер телефону: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Вага: " + weight);
        System.out.println("Тиск: " + pressure);
        System.out.println("Кількість пройдених за день кроків: " + stepsPerDay);
        System.out.println("----------->--------->---------->---------->------------");
    }
}
