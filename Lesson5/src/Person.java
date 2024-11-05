
public class Person {
    String name;
    String position;
    String email;
    String phone;
    int zarplata;
    int age;

    public Person(String name, String position, String email, String phone, int zarplata, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.zarplata = zarplata;
        this.age = age;

    }

    @Override
    public String toString() {
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n", name, position, email, phone, zarplata, age);
    }


    public void toScreen() {
        System.out.println(this);
    }

}




