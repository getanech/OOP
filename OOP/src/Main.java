public class Main {
    public static void main(String[] args) {


        Student s1 = new Student("123", "David", "Cohen", 30, "electricy");
        Student s2 = new Student(s1);
        System.out.println(s1.getId());
        System.out.println(s1.getAge());
        s1.setAge(31);
        System.out.println(s1.getAge());
        System.out.println(s1.getFirstname());
        System.out.println(s2.isPaid(1000));

    }
}