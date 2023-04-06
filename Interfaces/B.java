public class B extends A implements Presentable
{
    private boolean IsHappy;
    private double Salary;

    public String Present()
    {
        return super.Present() + "Is Happy? " +  IsHappy + ", Salary: " + Salary;
    }
}
