package oops;

public class Question3Test {

public static void main(String[] args)
{
int n = 8; // Number of threads
for (int i = 0; i < n; i++) {
Question3 object
= new Question3();
object.start();
}
}

}