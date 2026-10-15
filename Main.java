public class Main {

    static void showAll(Student s1, Student s2, Student s3,
                        Equipment e1, Equipment e2, Equipment e3, Equipment e4) {
        System.out.println("Student Information:");
        s1.display();
        System.out.println();
        s2.display();
        System.out.println();
        s3.display();
        System.out.println();

        System.out.println("Equipment Information:");
        e1.display();
        System.out.println();
        e2.display();
        System.out.println();
        e3.display();
        System.out.println();
        e4.display();
        System.out.println();
    }

    static void borrowTest(Student s, Equipment e) {
        System.out.println("===== BORROW EQUIPMENT =====");
        System.out.println("Student: " + s.name);
        System.out.println("Equipment: " + e.name);
        e.borrow();
        System.out.println();
    }

    static void returnTest(Equipment e) {
        System.out.println(" RETURN EQUIPMENT ");
        System.out.println("Equipment: " + e.name);
        e.giveBack();
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student("ST101", "Ahmed Hassan");
        Student s2 = new Student("ST102", "Amina Yusuf");
        Student s3 = new Student("ST103", "Omar Ali");

        Equipment e1 = new Equipment("EQ201", "Cisco Router", 5);
        Equipment e2 = new Equipment("EQ202", "Dell Laptop", 10);
        Equipment e3 = new Equipment("EQ203", "Network Switch", 1);
        Equipment e4 = new Equipment("EQ204", "Projector", 3);

        System.out.println("n/UNIVERSITY LABORATORY SYSTEM ....");
        showAll(s1, s2, s3, e1, e2, e3, e4);

        borrowTest(s1, e1);
        returnTest(e1);

        // switch has only 1 so the second borrow should fail
        borrowTest(s2, e3);
        borrowTest(s3, e3);

        System.out.println(" UPDATED EQUIPMENT INFORMATION ");
        showAll(s1, s2, s3, e1, e2, e3, e4);
    }
}
