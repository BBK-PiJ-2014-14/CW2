import java.util.Scanner;
  
public class FractionCalculator 
{
  Fraction value=new Fraction(0,1);
  String operator=null;
  String input;
  Scanner in=new Scanner(System.in);
  
  public static void main(String[]args)
  {
    FractionCalculator one=new FractionCalculator();
    one.run();
  }
    public void run() {
       
    System.out.println ("Hello, welcome to the fraction calculator made by Noam Shoef-Katsir.");
    System.out.println ("To use it, type in a fraction in format a/a, an operator(+,-,*,/), n for negate, c to clear, or abs for absolut value.");
    System.out.println ("Use spaces between fractions and operators.");
    System.out.println ("press q to quit.");
    System.out.println(value.toString());
    input=in.nextLine();
    while (!input.equals("q")) {
      value=evaluate(value,input);
      System.out.println(value.toString());
      input=in.nextLine();
    }
    System.out.println("Goodbye");
  }
   
  public Fraction evaluate(Fraction fraction, String input) {
    String[] inp=input.split(" ");
    for(int n=0; n<inp.length; n++) {
      String segment = inp[n];
         switch (segment) {
      case "+":
        operator="+";
        break;
      case "-":
        operator="-";
        break;
      case "*":
        operator="*";
        break;
      case "/":
        operator="/";
        break;
      case "c":
      case "C":
         operator=null;
         fraction=new Fraction(0,1);
         break;
      case "abs":
        fraction=fraction.absValue();
        break;
      case "n":
      case "N":
        fraction=fraction.negate(); 
        break;
       case "":
         break; //case of extra space
      default: 
        Fraction f=new Fraction(segment);
        if (operator==null) {
          fraction=f;
        }else {
          fraction=cal(fraction, f);
          operator=null;
        }
      }
    }
    return fraction;
  }
 
    
  private Fraction cal(Fraction one, Fraction two) {
    Fraction result = new Fraction(0,1);
     switch (operator) {
          case "+":
            result=one.add(two);
            break;
          case "-":
            result=one.subtract(two);
            break;
          case "*":
            result=one.multiply(two);
            break;
          case "/":
            result=one.divideBy(two); 
            break;           
          }
     return result;
  }
}    
