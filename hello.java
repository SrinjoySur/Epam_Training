import java.util.Scanner;
class hello{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a no.:");
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      System.out.println("Hello World!! "+i+" times printed OK");
    }
  }
}
