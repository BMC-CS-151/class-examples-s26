public class College {
    private String name;
    private int numStudents;
    private int yearFounded; //must be after 1700 

    //public static RATIO = .5;

    public College(String n, int students, int year) {
        this.name = n;
        this.numStudents = students;

        if (year < 1700) {
            System.out.println("Err! Year not valid");
            year = 1700;
        } else {
            this.yearFounded = year;
        }
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public int getYear() {
        return yearFounded;
    }

    public static void main(String[] args) {
        College c1 = new College("Bryn Mawr", 1400, 1885);        
        College c2 = new College("Haverford", 1300, 1833);        
        College c3 = new College("UPenn", 30000, 1792);        

        College[] arr = new College[3];
        arr[0] = c1;
        arr[1] = c2;
        arr[2] = c3;
        
        String myName = args[0];
        //System.out.println(myName);
       
        for (int i=0; i<arr.length; i++) {
            //System.out.println(i + " " + arr[i]);
            if (arr[i].getName().equals(myName)) {
                System.out.println(arr[i].getYear());
                //print year
            }
        }

        //System.out.println(College.RATIO);
        //System.out.println(College.name);

    }
}
