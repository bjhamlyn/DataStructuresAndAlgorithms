enum Color {RED, WHITE, GREEN, YELLOW};

public class Die {
    //fields are used for characteristics
    private int NumberOfSides;
    private int Result;
    private Color Color;

    //methods
    public int getNumberOfSides()
    {
        return NumberOfSides;
    }

    public void setNumberOfSides(int newNumSides)
    {
        NumberOfSides = newNumSides;
    }

    public int getResult()
    {
        return Result;
    }

    public Color getColor()
    {
        return Color;
    }

    public void setColor(Color Color)
    {
        this.Color = Color;
    }

    public void Roll()
    {
        //choose a random number between 1 and  the number of sides
        Result = (int)(Math.random()*NumberOfSides)+1;
    }
}

