public class FractionCalculatorTest
{
  FractionCalculator testCal=new FractionCalculator();
  public static void main(String[]args)
  {
   FractionCalculatorTest test =new FractionCalculatorTest();
   
  test.launch();
   
   
  }
  public void launch() {
    testEvaluate(new Fraction(1,5), "+ 3/10", new Fraction(5,10), "Error test 1");
    testEvaluate(new Fraction(1,5), "3/10", new Fraction(3,10), "Error test 2");
    testEvaluate(new Fraction(1,5), "2/5 + 3/10", new Fraction(7,10), "Error test 3");
    testEvaluate(new Fraction(0,1), "", new Fraction(0,1), "Error test 4");
    testEvaluate(new Fraction(2,3), "c", new Fraction(0,1), "Error test 5");
    testEvaluate(new Fraction(1,5), "n", new Fraction(1,-5), "Error test 6");
    testEvaluate(new Fraction(-1,5), "abs", new Fraction(1,5), "Error test 7");
    testEvaluate(new Fraction(1,5), "+ 3/10", new Fraction(1,5), "Error test 8 (not correct)");

  }
  void testEvaluate(Fraction f, String add, Fraction r,String msg) {
    if (!testCal.evaluate(f, add).equals(r))   System.out.println (msg);
      
  }
}


  
  
  