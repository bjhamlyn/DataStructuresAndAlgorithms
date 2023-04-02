import java.time.LocalDate;

enum MilitaryBranch {AIRFORCE, ARMY, COASTGUARD, MARINES, NAVY, SPACEFORCE}

public class Classes {

    public static void main(String[] args) {
        String name = "Brandon";
        double salary = 50000;
        MilitaryBranch myBranch = MilitaryBranch.ARMY;
        System.out.println(myBranch);

        Student s1 = new Student();
        s1.setName("Brandon Hamlyn");
        s1.setGPA(1.5);
        //s1.address = "Lacey, WA";
        s1.setMajor(Major.COMPUTERSCIENCE);
        //s1.IsVeteran = true;
        //s1.DOB = LocalDate.parse("2000-08-15"); 

        Student s2 = s1;
        //System.out.println(s1.get.Name)
        //System.out.println();
        s1.PrintInfo();

        Student s3 = new Student();
        s3.setName("Bianca");


        Die d1 = new Die();
        d1.setNumberOfSides(6);
        d1.setColor(Color.RED);
        d1.Roll();
        System.out.println(d1.getResult());

        d1.Roll();
        System.out.println(d1.getResult());

        d1.Roll();
        System.out.println(d1.getResult());

        d1.Roll();
        System.out.println(d1.getResult());

        d1.Roll();
        System.out.println(d1.getResult());
        
    }


}