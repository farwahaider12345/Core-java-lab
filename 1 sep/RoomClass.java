 /*Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine.
 In this class the member functions are setdata and displaydata.

Program :  
@author : Farwa Haider 
@Date : 1 September 2022
*/
class RoomClass 
{
   int roomNo;
   String roomType;
   float roomArea;
   boolean acMachine;
   
      void setData(int rno, String rt, float area, boolean ac)
      {
        roomNo = rno;
        roomType = rt;
        roomArea = area;
        acMachine = ac;
       }
	   
     void displayData()
 {
        System.out.println(“The room Is” + roomNo);
        System.out.println(“The room Type is” + roomType);
        System.out.println(“The room area is” + roomArea);
         String s = (acMachine) ? “true” : “false”;
         System.out.println(“The A / c Machine needed” + s);
}
            public static void main(String ...args) 
			{
             Room room1 = new Room();
              room1.setData(101, “Deluxe”, 240.0 f, true);
              room1.displayData();
             }
}