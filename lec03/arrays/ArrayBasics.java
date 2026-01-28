public class ArrayBasics {
    public static void main(String[] args) {
        int[] scores1 = {95, 87, 92, 88, 91};

        int[] scores2 = new int[5];
        scores2[0] = 95;
        scores2[1] = 87;
        scores2[2] = 92;
        scores2[3] = 88;
        scores2[4] = 91;

        int[] scores3 = new int[]{95, 87, 92, 88, 91};

        int size = 5;
        int[] scores4 = new int[size];

        System.out.println("Array length: " + scores1.length); //5
        System.out.println("First element: " + scores1[0]); //95
        System.out.println("Last element: " + scores1[scores1.length - 1]); //91

        for (int i = 0; i < scores1.length; i++) {
            System.out.println("Index " + i + ": " + scores1[i]);
        }

        for (int score : scores1) {
            System.out.println("Score: " + score);
        }

        scores1[0] = 100;
        System.out.println("Modified first element: " + scores1[0]);

        Student[] students = new Student[3];
        students[0] = new Student("hank", 19243821);
        students[1] = new CSStudent("bobby", 1293129, "username");
        //students[2] = "my student"; compiler error
    }
}
