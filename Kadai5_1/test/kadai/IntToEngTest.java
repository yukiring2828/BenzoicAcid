package kadai;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void oneplace() {
		IntToEng com=new IntToEng();
		String expect="eighteen";
		String answer=com.oneplace(18);
		assertThat(answer,is(expect));
	}
	
	@Test
	public void translateEng() {
		IntToEng com=new IntToEng();
		String expect="twenty";
		String expect2="thirtyfour";
		String answer=com.translateEng(20);
		String answer2=com.translateEng(34);
		assertThat(answer,is(expect));
		assertThat(answer2,is(expect2));
	}


}
