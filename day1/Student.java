class Student {
    String name;
    int roll_no;
    String phone_no;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Phone Number: " + phone_no);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Koustav";
        s.roll_no = 8;
        s.phone_no = "9876543210";

        s.display();
    }
}
