package GithubTry;

    class Teacher{

        String name;
        int age;
        String subject;

    }

public class main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        teacher.name = "Al-Raffy Sarip";
        teacher.age = 21;
        teacher.subject = "Science";

        System.out.println("Name:" + teacher.name + "Age: " +teacher.age);


    }
}

