package oops;


class Joker {
   int num;
   String name;

 
   Joker() { System.out.println("Constructor called"); }


   // data members of the class.
 
   int id;

   // Constructor would initialize data members
   // With the values of passed arguments while
   // Object of that class created
   Joker(String name, int id)
   {
       this.name = name;
       this.id = id;
   }
   void Print()
   {

       // Print statement
       System.out.println("parent class");
   }
}

// Class 2
// Helper class
class subclass1 extends Joker {

   // Method
   void Print() { System.out.println("Joker1 dancing bharatnatyam"); }
}

// Class 3
// Helper class
class subclass2 extends Joker {

   // Method
   void Print()
   {

       // Print statement
       System.out.println("Joker2 dancing Kathak");
   }
}
class subclass3 extends Joker {

   // Method
   void Print()
   {

       // Print statement
       System.out.println("Joker3 dancing Kathakali");
   }
}
class subclass4 extends Joker {

   // Method
   void Print()
   {

       // Print statement
       System.out.println("Joker4 dancing Manipuri");
   }
}
class subclass5 extends Joker {

   // Method
   void Print()
   {

       // Print statement
       System.out.println("Joker5 dancing Odissi");
   }
}
class subclass6 extends Joker {

   // Method
   void Print()
   {

       // Print statement
       System.out.println("Joker6 dancing Mohiniattam");
   }
}
class subclass7 extends Joker {

   // Method
   void Print()
   {

       // Print statement
       System.out.println("Joker7 dancing Sattriya");
   }
}

class subclass8 extends Joker {

   // Method
   void Print()
   {

       // Print statement
       System.out.println("Joker8 dancing Kuchipuri");
   }
}
