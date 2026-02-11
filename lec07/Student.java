public class Student {
        String name;
        int age;
        Student bff;

        public Student(String n, int a) {
            name = n;
            age = a;
        }

        public void setBff(Student s) {
            bff = s;
        }

        public Student getBff() {
            return bff;
        }
}
