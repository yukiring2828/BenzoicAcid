package kadai;

import static org.junit.Assert.*;
import static 
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void oneplace() {
		IntToEng com=new IntToEng();
		String expect="zero";
		String answer=com.oneplace(0);
		assrtThat(answer,is(expect));
	}

}
