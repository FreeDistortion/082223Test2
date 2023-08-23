package additionalHW.six.three;


public class BorderMain {
    public static void main(String[] args) {
    	
        Display display1 = new StringDisplay("Hello, world.");
        Display display2 = new SideBorder(display1, '#');
        Display display3 = new SideBorder(new SideBorder( new StringDisplay("Hello Gurum"), '#'), '&');
        Display display4 = new FullBorder( display3 );
        Display display5 = new FullBorder( display4 );
        Display display6 = new FullBorder( display5 );
        Display display7 = new FullBorder( display6 );
        
        
        System.out.println("1. 문자열을 출력합니다.");
        display1.show();
        System.out.println();

        System.out.println("2. '#'으로 Side를 장식합니다.");
        display2.show();
        System.out.println(); 
        
        System.out.println("3. '&'으로 Side를 장식합니다.");
        display3.show();
        System.out.println(); 
        
        System.out.println("4. 모든 테두리를 장식합니다."); 
        display4.show();
        
        System.out.println("5. 모든 테두리를 장식합니다.\n"); 
        display5.show();
        
        System.out.println("6. 모든 테두리를 장식합니다.\n"); 
        display6.show();
    }
}
