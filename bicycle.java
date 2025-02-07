class bicycle
 {
   int gear=3;
   public static void main(String args[])
    {
      bicycle sportsbi=new bicycle();
      System.out.println(sportsbi.gear);
      sportsbi.accelerate();
    }
    void accelerate()
     {
       System.out.println("Sports bicycle");
      }
} 
