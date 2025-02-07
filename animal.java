class dog extends animal
 {
   void displayd();
   {
     System.out.println("Bhao Bhao"); 
   }
 }
class cat extends animal
{
void displayc();
   {
     System.out.println("Meow"); 
   }
 }
class goat extends animal
{
void displayg();
   {
     System.out.println("meeee"); 
   }
 }
class animal
{
void displaya();
   {
     System.out.println("The Animals are domestic"); 
   }
 }
class inheritance
{
public static void main(String args[])
{
animal d=new animal();
d.displayd();
d.displayc();
d.displaya();
}
}



