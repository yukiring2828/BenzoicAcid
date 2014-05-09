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
		String expect5="onethousand";
		String expect6="onethousandnineteen";
		String expect7="onethousandtwenty";
		String expect8="twothousandthirtytwo";
		String expect9="twothousandonehundred";
		String expect10="tenthousand";
		String expect11="tenthousandelvenonehandredeleven";
		String expect12="tenthousandelvenonehandredtwenty";
		String answer=com.translateEng(20);
		String answer2=com.translateEng(32);
		String answer3=com.translateEng(100);
		String answer4=com.translateEng(111);
		/*
		String answer5=com.translateEng(1000);
		String answer6=com.translateEng(1019);
		String answer7=com.translateEng(1020);
		String answer8=com.translateEng(2032);
		String answer9=com.translateEng(2100);
		String answer10=com.translateEng(10000);
		String answer11=com.translateEng(11111);
		String answer12=com.translateEng(11120);
		*/
		assertThat(answer,is(expect));
		assertThat(answer2,is(expect2));
		assertThat(answer3,is(expect3));
		assertThat(answer4,is(expect4));
		/*
		assertThat(answer5,is(expect5));
		assertThat(answer6,is(expect6));
		assertThat(answer7,is(expect7));
		assertThat(answer8,is(expect8));
		assertThat(answer9,is(expect9));
		assertThat(answer10,is(expect10));
		assertThat(answer11,is(expect11));
		assertThat(answer12,is(expect12));
		*/
	}


}
