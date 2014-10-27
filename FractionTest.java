public class FractionTest {
    public static void main(String[] args) {

        // test divide by zero - should print an error and exit
        new Fraction(1, 0);
        // test multiply
 Fraction f = new Fraction(1,5);
 Fraction g = new Fraction(1,3);
 Fraction h = new Fraction(3,5);
 if (!f.equals(g.multiply(h))) System.out.println("Multiply failed");
         //test add
 Fraction a=new Fraction(1,2);
 Fraction b=new Fraction(1,4);
 Fraction c=new Fraction(2,8);
 if (!a.equals(b.add(c))) System.out.println("Add failed");
        //test subtract
 Fraction x=new Fraction(1,8);
 Fraction y=new Fraction(3,4);
 Fraction z=new Fraction(5,8);
 if (!x.equals(y.subtract(z))) System.out.println("Subtract failed");
        //test divide
 Fraction l=new Fraction(2,5);
 Fraction m=new Fraction(1,5);
 Fraction n=new Fraction(2,4);
 if (!l.equals(m.divideBy(n))) System.out.println("Divide failed");
        // test equals
 
 test(new Fraction(1, 2),new Fraction(1, 2),"error test 1");
 test(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
 test(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
 test(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
 test(new Fraction(4, -8),new Fraction(1, 2),"error test 5(not equals)");
   // test abs
 testAbs(new Fraction(1,2),new Fraction(1,2),"error testAbs 1");
 testAbs(new Fraction(-3,6),new Fraction(3,6),"error testAbs 2");
 testAbs(new Fraction(2,-4),new Fraction(1,2),"error testAbs 3");
 testAbs(new Fraction(-1,-2),new Fraction(1,2),"error testAbs 4");
  testAbs(new Fraction(-1,-2),new Fraction(-1,2),"error testAbs 5 (not abs)");
    // test negate
 testN(new Fraction(-1,2), new Fraction(1,2), "error testN 1");
 testN(new Fraction(3,4), new Fraction(3,-4), "error testN 2");
 testN(new Fraction(-1,-2), new Fraction(1,-2), "error testN 3");
 testN(new Fraction(2,-4), new Fraction(2,4), "error testN 4");
 testN(new Fraction(2,-4), new Fraction(2,-4), "error testN 5 (not negate)");
 
 

        // extend with extra tests
    }
    static void testN(Fraction f1, Fraction f2, String msg) {
      if(!f1.negate().equals(f2)) System.out.println (msg);
    }
    static void testAbs(Fraction f1, Fraction f2, String msg) {
      if(!f1.absValue().equals(f2)) System.out.println (msg);
    }

    static void test(Fraction f1, Fraction f2, String msg){
     if (! f1.equals(f2))
  System.out.println(msg);
    }
    
      
}