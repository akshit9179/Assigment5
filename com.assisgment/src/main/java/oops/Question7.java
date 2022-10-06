package oops;

public class Question7 {
void dupLastIndex(int arr[], int n)
{

if (arr == null || n <= 0)
return;


for (int i = n - 1; i > 0; i--)
{
if (arr[i] == arr[i - 1])
{
System.out.println("Last index:" + i);
System.out.println("Last duplicate item: "
+ arr[i]);
return;
}
}


System.out.print("no duplicate found");
}

}
