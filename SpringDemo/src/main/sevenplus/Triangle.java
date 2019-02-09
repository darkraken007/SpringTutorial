package main.sevenplus;

public class Triangle
{
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private String refBean;
    public String getRefBean()
    {
        return refBean;
    }
    public void setRefBean( String refBean )
    {
        this.refBean = refBean;
    }
    public Triangle(){
        
    }
    public Triangle( Point pointA, Point pointB, Point pointC )
    {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }
    
    public Point getPointA()
    {
        return pointA;
    }
    public void setPointA( Point pointA )
    {
        this.pointA = pointA;
    }
    public Point getPointB()
    {
        return pointB;
    }
    public void setPointB( Point pointB )
    {
        this.pointB = pointB;
    }
    public Point getPointC()
    {
        return pointC;
    }
    public void setPointC( Point pointC )
    {
        this.pointC = pointC;
    }
    
    public void draw(){
        System.out.println( "PointA= " + pointA );
        System.out.println( "PointB= " + pointB );
        System.out.println( "PointC= " + pointC );
    }
}
