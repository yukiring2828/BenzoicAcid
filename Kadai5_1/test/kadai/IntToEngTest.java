package kadai;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void oneplace() {
		IntToEng com=new IntToEng();
		String expect="eighteen ";
		String answer=com.oneplace(18);
		assertThat(answer,is(expect));
	}
	
	@Test
	public void tenplace() {
		IntToEng com=new IntToEng();
		String expect="twenty ";
		String answer=com.tenplace(2);
		assertThat(answer,is(expect));
	}
	
	@Test
	public void marugoto() {
		IntToEng com=new IntToEng();
		String expect="five hundred eighteen ";
		String answer=com.marugoto(5,1,8);
		assertThat(answer,is(expect));
	}
	
	@Test
	public void translateEng() {
		IntToEng com=new IntToEng();
		String expect="zero ";
		String expect2="thirty two ";
		String expect3="one hundred ";
		String expect4="one hundred eleven ";
		String expect5="one thousand ";
		String expect6="one thousand nineteen ";
		String expect7="one thousand twenty ";
		String expect8="two thousand thirty two ";
		String expect9="two thousand one hundred ";
		String expect10="ten thousand ";
		String expect11="eleven thousand one hundred eleven ";
		String expect12="eleven thousand one hundred twenty ";
		String expect13="eight hundred eighty eight thousand eight hundred eighty eight ";

		String answer=com.translateEng(0);
		String answer2=com.translateEng(32);
		String answer3=com.translateEng(100);
		String answer4=com.translateEng(111);
		String answer5=com.translateEng(1000);
		String answer6=com.translateEng(1019);
		String answer7=com.translateEng(1020);
		String answer8=com.translateEng(2032);
		String answer9=com.translateEng(2100);
		String answer10=com.translateEng(10000);
		String answer11=com.translateEng(11111);
		String answer12=com.translateEng(11120);
		String answer13=com.translateEng(888888);
		
		assertThat(answer,is(expect));
		assertThat(answer2,is(expect2));
		assertThat(answer3,is(expect3));
		assertThat(answer4,is(expect4));
		
		assertThat(answer5,is(expect5));
		assertThat(answer6,is(expect6));
		assertThat(answer7,is(expect7));
		assertThat(answer8,is(expect8));
		assertThat(answer9,is(expect9));
		assertThat(answer10,is(expect10));
		assertThat(answer11,is(expect11));
		assertThat(answer12,is(expect12));
		assertThat(answer13,is(expect13));
		
	}


}
