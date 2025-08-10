public class Factorial{
  public static long compute(int n){
    if(n<0) throw new IllegalArgumentException("Negative number not allowed");
    long result=1;
    for(int i=2;i<=n;i++){
      result*=i;
    }
    return result;
  }
  public static void main(String args[]){
  int n=5;
    System.out.println("Factorial of"+ n +"is"+compute(n));
  }
}
