package oops;
public class Question6Test {  
    public static void main(String[] args) {  
        String[] strArray = { "Ani", "Sam", "Joe", "Aksh","Ram" };  
        String[] strArray2 = { "shyam", "Sum", "Joy", "Akshit","Rai" };  
        String[] strArray3 = { "Anil", "Sky", "Jul", "Aks","Roy" };  
        String[] strArray4 = { "Anir", "Sammy", "Josh", "Ash","Rku" };  
        String[] strArray5 = { "Anit", "Safg", "Jooo", "Anj","Riu" };  
        boolean x = false; //initializing x to false  
        int in = 0; //declaration of index variable  
        String s = "Aksh";  // String to be searched  
        // Iteration of the String Array  
        for (int i = 0; i < strArray.length; i++) {  
            if(s.equals(strArray[i])) {  
                in = i; x = true; break;  
            }  
        }  
        if(x)  
            System.out.println(s +" String is found at index "+in);  
        else  
            System.out.println(s +" String is not found in the array");  
    }  
}  