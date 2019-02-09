package main.sevenplus;

public class Color
{
    private String color;

    public String getColor()
    {
        return color;
    }

    public void setColor( String color )
    {
        this.color = color;
    }
    
    @Override
    public String toString()
    {
        return color ;
    }
}
