public class Student {
    private String id;
    private String firstname;
    private String lastname;
    private int age;
    private String domain;

    public Student(String id, String firstname, String lastname, int age, String domain) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.domain = domain;
    }

    public Student(Student s) { //בנאי משוכפל
        this.id = s.id;
        this.firstname = s.firstname;
        this.lastname = s.lastname;
        this.age = s.age;
        this.domain = s.domain;
    }

    public boolean isPaid(int money) { // פונקציה אישית

        if (money >= 1 && money <= 1000) {
            if (money == 1000) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getDomain() {
        return domain;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

