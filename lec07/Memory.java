public class Memory {

   public static void main(String[] args) {
        int x = 28;

        Student c = new Student("Cinna", 4);
        Student e = new Student("Eliz", x);

        c.setBff(e);

        System.out.println("My bff is: " + e.getBff().name);
   }
}
