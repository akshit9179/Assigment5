package oops;
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}  
class Cat extends BabyDog{  
void sleep(){System.out.println("sleeping...");}  
}
class Cow extends Cat{  
void drink(){System.out.println("drinking...");}  
}
class Tiger extends Cow{  
void work(){System.out.println("working...");}  
}
class Question2 extends Tiger{  
void play(){System.out.println("playing...");}  
} 
