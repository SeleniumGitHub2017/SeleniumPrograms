package GitHubPkg;

import org.junit.Test;

public class display {
	int a=10; 
	int b=20; 
	@Test
	public void output(){
	Calculator cal=new Calculator();
	System.out.println("addition of a+b: "+ cal.add(a, b)); 
	System.out.println("sub otractionf a-b: "+ cal.sub(a, b));
	System.out.println("sub division a/b: "+ cal.div(a, b));
	
	}
}
  