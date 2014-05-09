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
		String expect2="thirtytwo";
		String expect3="onehundred";
		String expect4="onehundredeleven";
		String answer=com.translateEng(20);
		String answer2=com.translateEng(32);
		String answer3=com.translateEng(100);
		String answer4=com.translateEng(111);
		assertThat(answer,is(expect));
		assertThat(answer2,is(expect2));
		assertThat(answer3,is(expect3));
		assertThat(answer4,is(expect4));
	}


}
