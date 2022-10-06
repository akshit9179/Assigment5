package oops;

public class JokerTest {

   public static void main(String[] args)
   {
       
       Joker joker1 = new Joker();

       
       System.out.println(joker1.name);
       System.out.println(joker1.num);
   

   
        // This would invoke the parameterized constructor.
        Joker joker2 = new Joker("adam", 1);
        System.out.println("JokerName :" + joker2.name
                           + " and JokerId :" + joker2.id);
       
        Joker joker3 = new Joker("akshit", 2);
        System.out.println("JokerName :" + joker3.name
                           + " and JokerId :" + joker3.id);
       
        Joker joker4 = new Joker("suraj", 3);
        System.out.println("JokerName :" + joker4.name
                           + " and JokerId :" + joker4.id);
       
        Joker joker5 = new Joker("john", 4);
        System.out.println("JokerName :" + joker5.name
                           + " and JokerId :" + joker5.id);
       
        Joker joker6 = new Joker("anil", 5);
       System.out.println("JokerName :" + joker6.name
                                   + " and JokerId :" + joker6.id);
       
       Joker joker7 = new Joker("sunil", 6);
       System.out.println("JokerName :" + joker7.name
                          + " and JokerId :" + joker7.id);
       
       Joker joker8 = new Joker("subhajit", 7);
       System.out.println("JokerName :" + joker8.name
                          + " and JokerId :" + joker8.id);
       
       Joker a;
       
       // Now we will be calling print methods
       // inside main() method

       a = new subclass1();
       a.Print();

       a = new subclass2();
       a.Print();
       a = new subclass3();
       a.Print();
       a = new subclass4();
       a.Print();
       a = new subclass5();
       a.Print();
       a = new subclass6();
       a.Print();
       a = new subclass7();
       a.Print();
       a = new subclass8();
       a.Print();
    }
}
