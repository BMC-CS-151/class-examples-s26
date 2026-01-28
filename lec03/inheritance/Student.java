public class Student {
  private String name;
  private int id;

  public Student(String name, int id) {
    this.name = name;

    if (id < 0) {
            //throw exception
    }
    this.id = id;
  }

  public Student() {
        this.name = "new student";
        this.id = 0;   
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public String toString() {
    return name+" "+id;
  }

  public static void main(String[] args) {
      Student s = new Student("Elizabeth", 211897);
      System.out.println(s);
  }

 }
