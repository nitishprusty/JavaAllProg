package demo.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int ans = calcSquare(5);
        System.out.println(ans);
    }
    static int calcSquare(int a) {
    	if(a == 0) {
    		return 0;
    	}
    	int sq = a*a;
    	return sq;
    }
}
