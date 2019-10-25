package snippet;

public class Snippet {
	public static void main(String[] args) {
		//palindromic sayý 9009 gibi sayýlar
		//üç basamaklý sayýyla çarpýlan bulmam lazým
	
	    long product;
	    for (int i = 999; i >= 100; i--) {
	        for (int j = 999; j >= 100; j--) {
	            long product1 = j * i;
	            if (reverse(product1)) {
	                System.out.printf("%d * %d = %d%n", i, j, product1);
	                break ;
	            }
	        }
	    } 
	}
	
	
	private static final boolean reverse(long value) {
	    String str = String.valueOf(value);
	    return str.equals(new StringBuilder(str).reverse().toString());
	}
	 
	}


