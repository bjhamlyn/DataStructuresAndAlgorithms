public class A implements Presentable //adding "implements Presentable implements the class interface"
{  
    private String Name;
    private int Age;

    public String Present(){
        return "name = " + Name + ", Age = " + Age;
    }
}
