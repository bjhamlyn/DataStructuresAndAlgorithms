import java.time.LocalDate;

import javax.sql.rowset.spi.SyncResolver;

enum Major {ART, COMPUTERSCIENCE, HISTORY, MATHS, OTHERS};


public class Student {
    //characteristic / attributes / called fields when used in a class
    private String Name;
    private double GPA;
    private String Address;
    private Major Major;
    private boolean IsVeteran;
    private LocalDate DOB;

    public void PrintInfo()
    {
        System.out.println("name: " + Name);
        System.out.println("GPA: " + GPA);
        System.out.println("Address: " + Address);
        System.out.println("Major: " + Major);
        System.out.println("IsVeteran? " + IsVeteran);
        System.out.println("Date of Birth: " + DOB);
    }

    public Major getMajor()
    {
        return Major;
    }

    public void setMajor(Major Major)
    {
        this.Major = Major;
    }

   

    public String getName() //gives read access to name
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public double getGPA()
    {
        return GPA;
    }

    public void setGPA(double GPA)
    {
        if(GPA<0)
        {
            this.GPA = 0;
        }
        else
        {
            this.GPA = GPA;  
        }
    }


    
}
