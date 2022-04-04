public class Cpu
{
int price;
   class Processor
    {
       int cores;
       String producer;
       Processor(int noC,String manu)
       {
          cores=noC;
           producer=manu;
       }
   void display()
   {
     System.out.println("\n processor info");
      System.out.println("no.of cores="+cores);
      System.out.println("manufacturer="+producer+"\n");
   }
}
  static class ram
  {
   int mem;
  String manuf;
  ram(int memory,String producer)
  {
    mem=memory;
    manuf=producer;
  }
 void display()
 {
   System.out.println("\nram info");
  System.out.println("memory="+mem+" GB");
  System.out.println("manufacturer="+manuf+"\n");
 }
}
  public static void main(String[]args)
  {
    Cpu.ram obj1=new Cpu.ram(8,"intel");
    Cpu obj2=new Cpu();
    Cpu.Processor obj3=obj2.new Processor(8,"Samsung");
   obj1.display();
   obj3.display();
}
}