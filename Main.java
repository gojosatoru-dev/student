class Calculator{
    int a ;
    int b ;

    Calculator(int a ,int b)
    {
        this.a=a;
        this.a=a;        
    }
    int add(int a ,int b)
    {
    return a+b;
    }
    int sub(int a ,int b)
    {
    return a-b;
    }
    int mult(int a ,int b)
    {
    return a*b;
    }
    int div(int a ,int b)
    {
    return a/b;
    }
}
public class Main{
    public static void main(String[] args){
     Calculator calc= new Calculator(4, 5);

     System.out.println("The addition of number is"+calc.add(4, 5));
     System.out.println("The substraction of number is"+calc.sub(4, 5));
     System.out.println("The division of number is"+calc.div(4, 5));
     System.out.println("The multiplication of number is"+calc.mult(4, 5));
    }
}
