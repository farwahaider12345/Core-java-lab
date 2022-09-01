/*
Program : Program 3(Lab assesement)
@author : Farwa Haider 
@Date : 1 September 2022
*/

//declaring a class
class Rectangle
{
    int length;
    int breadth;

    Rectangle()
    { 
        int length = 0;
        int breadth = 0;

    }

    Rectangle(int length, int breadth)
    {
        this.length = length ;
        this. breadth = breadth ;

    }
	
    Rectangle(int length)
    {
        this.length = length;
        this.breadth = length;
    }
	
    public void  printSum()
    {
        System.out.println(length*breadth);
    }
} 

//declaring second class
class RectangleTest 
{
	//calling main method 
    public static void main(String ... args)
	{
		//creating a instance
        Rectangle r1 = new Rectangle();
        r1.printSum();
        Rectangle r2 = new Rectangle(10);
        r2.printSum();
        Rectangle r3 = new Rectangle(12,2);
        r3.printSum();
    }
}