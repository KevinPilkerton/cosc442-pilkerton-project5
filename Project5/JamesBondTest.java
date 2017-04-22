import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JamesBondTest {
JamesBond jamesBond;
	@Before
	public void setUp() throws Exception {
		jamesBond = new JamesBond();
	}
	
	@Test 
	public void testCase1()
	{
		assertFalse(jamesBond.bondRegex(" ( "));
	}

	@Test 
	public void testCase2()
	{
		assertFalse(jamesBond.bondRegex(" ( ( "));
	}

	@Test 
	public void testCase3()
	{
		assertFalse(jamesBond.bondRegex(" ( ( ( "));
	}

	@Test 
	public void testCase4()
	{
		assertFalse(jamesBond.bondRegex(" ( ( ) "));
	}

	@Test 
	public void testCase5()
	{
		assertTrue(jamesBond.bondRegex(" ( ( 0 0 7 ) "));
	}

	@Test 
	public void testCase6()
	{
		assertFalse(jamesBond.bondRegex(" ( ( 0 7 ) "));
	}

	@Test 
	public void testCase7()
	{
		assertFalse(jamesBond.bondRegex(" ( ( 7 ) "));
	}

	@Test 
	public void testCase8()
	{
		assertFalse(jamesBond.bondRegex(" ( ) "));
	}

	@Test 
	public void testCase9()
	{
		assertFalse(jamesBond.bondRegex(" ( ) ( "));
	}

	@Test 
	public void testCase10()
	{
		assertFalse(jamesBond.bondRegex(" ( ) ) "));
	}

	@Test 
	public void testCase11()
	{
		assertTrue(jamesBond.bondRegex(" ( ) 0 0 7 ) "));
	}

	@Test 
	public void testCase12()
	{
		assertFalse(jamesBond.bondRegex(" ( ) 0 7 ) "));
	}

	@Test 
	public void testCase13()
	{
		assertFalse(jamesBond.bondRegex(" ( ) 7 ) "));
	}

	@Test 
	public void testCase14()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ( "));
	}

	@Test 
	public void testCase15()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ( ( "));
	}

	@Test 
	public void testCase16()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ( ) "));
	}

	@Test 
	public void testCase17()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ( 0 0 7 ) "));
	}

	@Test 
	public void testCase18()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ( 0 7 ) "));
	}

	@Test 
	public void testCase19()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ( 7 ) "));
	}

	@Test 
	public void testCase20()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ) "));
	}

	@Test 
	public void testCase21()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ) ( "));
	}

	@Test 
	public void testCase22()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ) ) "));
	}

	@Test 
	public void testCase23()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ) 0 0 7 ) "));
	}

	@Test 
	public void testCase24()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ) 0 7 ) "));
	}

	@Test 
	public void testCase25()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 ) 7 ) "));
	}

	@Test 
	public void testCase26()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ( "));
	}

	@Test 
	public void testCase27()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ( ( "));
	}

	@Test 
	public void testCase28()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ( ) "));
	}

	@Test 
	public void testCase29()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ( 0 0 7 ) "));
	}

	@Test 
	public void testCase30()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ( 0 7 ) "));
	}

	@Test 
	public void testCase31()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ( 7 ) "));
	}

	@Test 
	public void testCase32()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ) "));
	}

	@Test 
	public void testCase33()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ) ( "));
	}

	@Test 
	public void testCase34()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ) ) "));
	}

	@Test 
	public void testCase35()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ) 0 0 7 ) "));
	}

	@Test 
	public void testCase36()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ) 0 7 ) "));
	}

	@Test 
	public void testCase37()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 ) 7 ) "));
	}

	@Test 
	public void testCase38()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 0 ( "));
	}

	@Test 
	public void testCase39()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 0 ) "));
	}

	@Test 
	public void testCase40()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 0 0 0 7 ) "));
	}

	@Test 
	public void testCase41()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 0 0 7 ) "));
	}

	@Test 
	public void testCase42()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 0 7 ) "));
	}

	@Test 
	public void testCase43()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 1 ( "));
	}

	@Test 
	public void testCase44()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 1 ) "));
	}

	@Test 
	public void testCase45()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 1 0 0 7 ) "));
	}

	@Test 
	public void testCase46()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 1 0 7 ) "));
	}

	@Test 
	public void testCase47()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 1 7 ) "));
	}

	@Test 
	public void testCase48()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 2 ( "));
	}

	@Test 
	public void testCase49()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 2 ) "));
	}

	@Test 
	public void testCase50()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 2 0 0 7 ) "));
	}

	@Test 
	public void testCase51()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 2 0 7 ) "));
	}

	@Test 
	public void testCase52()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 2 7 ) "));
	}

	@Test 
	public void testCase53()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 3 ( "));
	}

	@Test 
	public void testCase54()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 3 ) "));
	}

	@Test 
	public void testCase55()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 3 0 0 7 ) "));
	}

	@Test 
	public void testCase56()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 3 0 7 ) "));
	}

	@Test 
	public void testCase57()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 3 7 ) "));
	}

	@Test 
	public void testCase58()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 4 ( "));
	}

	@Test 
	public void testCase59()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 4 ) "));
	}

	@Test 
	public void testCase60()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 4 0 0 7 ) "));
	}

	@Test 
	public void testCase61()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 4 0 7 ) "));
	}

	@Test 
	public void testCase62()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 4 7 ) "));
	}

	@Test 
	public void testCase63()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 5 ( "));
	}

	@Test 
	public void testCase64()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 5 ) "));
	}

	@Test 
	public void testCase65()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 5 0 0 7 ) "));
	}

	@Test 
	public void testCase66()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 5 0 7 ) "));
	}

	@Test 
	public void testCase67()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 5 7 ) "));
	}

	@Test 
	public void testCase68()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 6 ( "));
	}

	@Test 
	public void testCase69()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 6 ) "));
	}

	@Test 
	public void testCase70()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 6 0 0 7 ) "));
	}

	@Test 
	public void testCase71()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 6 0 7 ) "));
	}

	@Test 
	public void testCase72()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 6 7 ) "));
	}

	@Test 
	public void testCase73()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 ( "));
	}

	@Test 
	public void testCase74()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 ( ( "));
	}

	@Test 
	public void testCase75()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ( ) "));
	}

	@Test 
	public void testCase76()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ( 0 0 7 ) "));
	}

	@Test 
	public void testCase77()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ( 0 7 ) "));
	}

	@Test 
	public void testCase78()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ( 7 ) "));
	}

	@Test 
	public void testCase79()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) "));
	}

	@Test 
	public void testCase80()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ( "));
	}

	@Test 
	public void testCase81()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ( ( "));
	}

	@Test 
	public void testCase82()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ( ) "));
	}

	@Test 
	public void testCase83()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ( 0 0 7 ) "));
	}

	@Test 
	public void testCase84()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ( 0 7 ) "));
	}

	@Test 
	public void testCase85()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ( 7 ) "));
	}

	@Test 
	public void testCase86()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ) "));
	}

	@Test 
	public void testCase87()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ) ( "));
	}

	@Test 
	public void testCase88()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ) ) "));
	}

	@Test 
	public void testCase89()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ) 0 0 7 ) "));
	}

	@Test 
	public void testCase90()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ) 0 7 ) "));
	}

	@Test 
	public void testCase91()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) ) 7 ) "));
	}

	@Test 
	public void testCase92()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 0 ( "));
	}

	@Test 
	public void testCase93()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 0 ) "));
	}

	@Test 
	public void testCase94()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 0 0 0 7 ) "));
	}

	@Test 
	public void testCase95()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 0 0 7 ) "));
	}

	@Test 
	public void testCase96()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 0 7 ) "));
	}

	@Test 
	public void testCase97()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 1 ( "));
	}

	@Test 
	public void testCase98()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 1 ) "));
	}

	@Test 
	public void testCase99()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 1 0 0 7 ) "));
	}

	@Test 
	public void testCase100()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 1 0 7 ) "));
	}

	@Test 
	public void testCase101()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 1 7 ) "));
	}

	@Test 
	public void testCase102()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 2 ( "));
	}

	@Test 
	public void testCase103()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 2 ) "));
	}

	@Test 
	public void testCase104()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 2 0 0 7 ) "));
	}

	@Test 
	public void testCase105()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 2 0 7 ) "));
	}

	@Test 
	public void testCase106()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 2 7 ) "));
	}

	@Test 
	public void testCase107()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 3 ( "));
	}

	@Test 
	public void testCase108()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 3 ) "));
	}

	@Test 
	public void testCase109()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 3 0 0 7 ) "));
	}

	@Test 
	public void testCase110()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 3 0 7 ) "));
	}

	@Test 
	public void testCase111()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 3 7 ) "));
	}

	@Test 
	public void testCase112()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 4 ( "));
	}

	@Test 
	public void testCase113()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 4 ) "));
	}

	@Test 
	public void testCase114()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 4 0 0 7 ) "));
	}

	@Test 
	public void testCase115()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 4 0 7 ) "));
	}

	@Test 
	public void testCase116()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 4 7 ) "));
	}

	@Test 
	public void testCase117()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 5 ( "));
	}

	@Test 
	public void testCase118()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 5 ) "));
	}

	@Test 
	public void testCase119()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 5 0 0 7 ) "));
	}

	@Test 
	public void testCase120()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 5 0 7 ) "));
	}

	@Test 
	public void testCase121()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 5 7 ) "));
	}

	@Test 
	public void testCase122()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 6 ( "));
	}

	@Test 
	public void testCase123()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 6 ) "));
	}

	@Test 
	public void testCase124()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 6 0 0 7 ) "));
	}

	@Test 
	public void testCase125()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 6 0 7 ) "));
	}

	@Test 
	public void testCase126()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 6 7 ) "));
	}

	@Test 
	public void testCase127()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 7 ( "));
	}

	@Test 
	public void testCase128()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 7 ) "));
	}

	@Test 
	public void testCase129()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 7 0 0 7 ) "));
	}

	@Test 
	public void testCase130()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 7 0 7 ) "));
	}

	@Test 
	public void testCase131()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 7 7 ) "));
	}

	@Test 
	public void testCase132()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 8 ( "));
	}

	@Test 
	public void testCase133()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 8 ) "));
	}

	@Test 
	public void testCase134()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 8 0 0 7 ) "));
	}

	@Test 
	public void testCase135()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 8 0 7 ) "));
	}

	@Test 
	public void testCase136()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 8 7 ) "));
	}

	@Test 
	public void testCase137()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 9 ( "));
	}

	@Test 
	public void testCase138()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 9 ) "));
	}

	@Test 
	public void testCase139()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 9 0 0 7 ) "));
	}

	@Test 
	public void testCase140()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 9 0 7 ) "));
	}

	@Test 
	public void testCase141()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 ) 9 7 ) "));
	}

	@Test 
	public void testCase142()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 0 ( "));
	}

	@Test 
	public void testCase143()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 0 ) "));
	}

	@Test 
	public void testCase144()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 0 0 0 7 ) "));
	}

	@Test 
	public void testCase145()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 0 0 7 ) "));
	}

	@Test 
	public void testCase146()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 0 7 ) "));
	}

	@Test 
	public void testCase147()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 1 ( "));
	}

	@Test 
	public void testCase148()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 1 ) "));
	}

	@Test 
	public void testCase149()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 1 0 0 7 ) "));
	}

	@Test 
	public void testCase150()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 1 0 7 ) "));
	}

	@Test 
	public void testCase151()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 1 7 ) "));
	}

	@Test 
	public void testCase152()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 2 ( "));
	}

	@Test 
	public void testCase153()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 2 ) "));
	}

	@Test 
	public void testCase154()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 2 0 0 7 ) "));
	}

	@Test 
	public void testCase155()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 2 0 7 ) "));
	}

	@Test 
	public void testCase156()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 2 7 ) "));
	}

	@Test 
	public void testCase157()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 3 ( "));
	}

	@Test 
	public void testCase158()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 3 ) "));
	}

	@Test 
	public void testCase159()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 3 0 0 7 ) "));
	}

	@Test 
	public void testCase160()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 3 0 7 ) "));
	}

	@Test 
	public void testCase161()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 3 7 ) "));
	}

	@Test 
	public void testCase162()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 4 ( "));
	}

	@Test 
	public void testCase163()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 4 ) "));
	}

	@Test 
	public void testCase164()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 4 0 0 7 ) "));
	}

	@Test 
	public void testCase165()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 4 0 7 ) "));
	}

	@Test 
	public void testCase166()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 4 7 ) "));
	}

	@Test 
	public void testCase167()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 5 ( "));
	}

	@Test 
	public void testCase168()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 5 ) "));
	}

	@Test 
	public void testCase169()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 5 0 0 7 ) "));
	}

	@Test 
	public void testCase170()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 5 0 7 ) "));
	}

	@Test 
	public void testCase171()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 5 7 ) "));
	}

	@Test 
	public void testCase172()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 6 ( "));
	}

	@Test 
	public void testCase173()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 6 ) "));
	}

	@Test 
	public void testCase174()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 6 0 0 7 ) "));
	}

	@Test 
	public void testCase175()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 6 0 7 ) "));
	}

	@Test 
	public void testCase176()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 6 7 ) "));
	}

	@Test 
	public void testCase177()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 7 ( "));
	}

	@Test 
	public void testCase178()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 7 ) "));
	}

	@Test 
	public void testCase179()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 7 0 0 7 ) "));
	}

	@Test 
	public void testCase180()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 7 0 7 ) "));
	}

	@Test 
	public void testCase181()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 7 7 ) "));
	}

	@Test 
	public void testCase182()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 8 ( "));
	}

	@Test 
	public void testCase183()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 8 ) "));
	}

	@Test 
	public void testCase184()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 8 0 0 7 ) "));
	}

	@Test 
	public void testCase185()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 8 0 7 ) "));
	}

	@Test 
	public void testCase186()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 8 7 ) "));
	}

	@Test 
	public void testCase187()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 7 9 ( "));
	}

	@Test 
	public void testCase188()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 9 ) "));
	}

	@Test 
	public void testCase189()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 9 0 0 7 ) "));
	}

	@Test 
	public void testCase190()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 9 0 7 ) "));
	}

	@Test 
	public void testCase191()
	{
		assertTrue(jamesBond.bondRegex(" ( 0 0 7 9 7 ) "));
	}

	@Test 
	public void testCase192()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 8 ( "));
	}

	@Test 
	public void testCase193()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 8 ) "));
	}

	@Test 
	public void testCase194()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 8 0 0 7 ) "));
	}

	@Test 
	public void testCase195()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 8 0 7 ) "));
	}

	@Test 
	public void testCase196()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 8 7 ) "));
	}

	@Test 
	public void testCase197()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 9 ( "));
	}

	@Test 
	public void testCase198()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 9 ) "));
	}

	@Test 
	public void testCase199()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 9 0 0 7 ) "));
	}

	@Test 
	public void testCase200()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 9 0 7 ) "));
	}

	@Test 
	public void testCase201()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 0 9 7 ) "));
	}

	@Test 
	public void testCase202()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 1 ( "));
	}

	@Test 
	public void testCase203()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 1 ) "));
	}

	@Test 
	public void testCase204()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 1 0 0 7 ) "));
	}

	@Test 
	public void testCase205()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 1 0 7 ) "));
	}

	@Test 
	public void testCase206()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 1 7 ) "));
	}

	@Test 
	public void testCase207()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 2 ( "));
	}

	@Test 
	public void testCase208()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 2 ) "));
	}

	@Test 
	public void testCase209()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 2 0 0 7 ) "));
	}

	@Test 
	public void testCase210()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 2 0 7 ) "));
	}

	@Test 
	public void testCase211()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 2 7 ) "));
	}

	@Test 
	public void testCase212()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 3 ( "));
	}

	@Test 
	public void testCase213()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 3 ) "));
	}

	@Test 
	public void testCase214()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 3 0 0 7 ) "));
	}

	@Test 
	public void testCase215()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 3 0 7 ) "));
	}

	@Test 
	public void testCase216()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 3 7 ) "));
	}

	@Test 
	public void testCase217()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 4 ( "));
	}

	@Test 
	public void testCase218()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 4 ) "));
	}

	@Test 
	public void testCase219()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 4 0 0 7 ) "));
	}

	@Test 
	public void testCase220()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 4 0 7 ) "));
	}

	@Test 
	public void testCase221()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 4 7 ) "));
	}

	@Test 
	public void testCase222()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 5 ( "));
	}

	@Test 
	public void testCase223()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 5 ) "));
	}

	@Test 
	public void testCase224()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 5 0 0 7 ) "));
	}

	@Test 
	public void testCase225()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 5 0 7 ) "));
	}

	@Test 
	public void testCase226()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 5 7 ) "));
	}

	@Test 
	public void testCase227()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 6 ( "));
	}

	@Test 
	public void testCase228()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 6 ) "));
	}

	@Test 
	public void testCase229()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 6 0 0 7 ) "));
	}

	@Test 
	public void testCase230()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 6 0 7 ) "));
	}

	@Test 
	public void testCase231()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 6 7 ) "));
	}

	@Test 
	public void testCase232()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 7 ( "));
	}

	@Test 
	public void testCase233()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 7 ) "));
	}

	@Test 
	public void testCase234()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 7 0 0 7 ) "));
	}

	@Test 
	public void testCase235()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 7 0 7 ) "));
	}

	@Test 
	public void testCase236()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 7 7 ) "));
	}

	@Test 
	public void testCase237()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 8 ( "));
	}

	@Test 
	public void testCase238()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 8 ) "));
	}

	@Test 
	public void testCase239()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 8 0 0 7 ) "));
	}

	@Test 
	public void testCase240()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 8 0 7 ) "));
	}

	@Test 
	public void testCase241()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 8 7 ) "));
	}

	@Test 
	public void testCase242()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 9 ( "));
	}

	@Test 
	public void testCase243()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 9 ) "));
	}

	@Test 
	public void testCase244()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 9 0 0 7 ) "));
	}

	@Test 
	public void testCase245()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 9 0 7 ) "));
	}

	@Test 
	public void testCase246()
	{
		assertFalse(jamesBond.bondRegex(" ( 0 9 7 ) "));
	}

	@Test 
	public void testCase247()
	{
		assertFalse(jamesBond.bondRegex(" ( 1 ( "));
	}

	@Test 
	public void testCase248()
	{
		assertFalse(jamesBond.bondRegex(" ( 1 ) "));
	}

	@Test 
	public void testCase249()
	{
		assertTrue(jamesBond.bondRegex(" ( 1 0 0 7 ) "));
	}

	@Test 
	public void testCase250()
	{
		assertFalse(jamesBond.bondRegex(" ( 1 0 7 ) "));
	}

	@Test 
	public void testCase251()
	{
		assertFalse(jamesBond.bondRegex(" ( 1 7 ) "));
	}

	@Test 
	public void testCase252()
	{
		assertFalse(jamesBond.bondRegex(" ( 2 ( "));
	}

	@Test 
	public void testCase253()
	{
		assertFalse(jamesBond.bondRegex(" ( 2 ) "));
	}

	@Test 
	public void testCase254()
	{
		assertTrue(jamesBond.bondRegex(" ( 2 0 0 7 ) "));
	}

	@Test 
	public void testCase255()
	{
		assertFalse(jamesBond.bondRegex(" ( 2 0 7 ) "));
	}

	@Test 
	public void testCase256()
	{
		assertFalse(jamesBond.bondRegex(" ( 2 7 ) "));
	}

	@Test 
	public void testCase257()
	{
		assertFalse(jamesBond.bondRegex(" ( 3 ( "));
	}

	@Test 
	public void testCase258()
	{
		assertFalse(jamesBond.bondRegex(" ( 3 ) "));
	}

	@Test 
	public void testCase259()
	{
		assertTrue(jamesBond.bondRegex(" ( 3 0 0 7 ) "));
	}

	@Test 
	public void testCase260()
	{
		assertFalse(jamesBond.bondRegex(" ( 3 0 7 ) "));
	}

	@Test 
	public void testCase261()
	{
		assertFalse(jamesBond.bondRegex(" ( 3 7 ) "));
	}

	@Test 
	public void testCase262()
	{
		assertFalse(jamesBond.bondRegex(" ( 4 ( "));
	}

	@Test 
	public void testCase263()
	{
		assertFalse(jamesBond.bondRegex(" ( 4 ) "));
	}

	@Test 
	public void testCase264()
	{
		assertTrue(jamesBond.bondRegex(" ( 4 0 0 7 ) "));
	}

	@Test 
	public void testCase265()
	{
		assertFalse(jamesBond.bondRegex(" ( 4 0 7 ) "));
	}

	@Test 
	public void testCase266()
	{
		assertFalse(jamesBond.bondRegex(" ( 4 7 ) "));
	}

	@Test 
	public void testCase267()
	{
		assertFalse(jamesBond.bondRegex(" ( 5 ( "));
	}

	@Test 
	public void testCase268()
	{
		assertFalse(jamesBond.bondRegex(" ( 5 ) "));
	}

	@Test 
	public void testCase269()
	{
		assertTrue(jamesBond.bondRegex(" ( 5 0 0 7 ) "));
	}

	@Test 
	public void testCase270()
	{
		assertFalse(jamesBond.bondRegex(" ( 5 0 7 ) "));
	}

	@Test 
	public void testCase271()
	{
		assertFalse(jamesBond.bondRegex(" ( 5 7 ) "));
	}

	@Test 
	public void testCase272()
	{
		assertFalse(jamesBond.bondRegex(" ( 6 ( "));
	}

	@Test 
	public void testCase273()
	{
		assertFalse(jamesBond.bondRegex(" ( 6 ) "));
	}

	@Test 
	public void testCase274()
	{
		assertTrue(jamesBond.bondRegex(" ( 6 0 0 7 ) "));
	}

	@Test 
	public void testCase275()
	{
		assertFalse(jamesBond.bondRegex(" ( 6 0 7 ) "));
	}

	@Test 
	public void testCase276()
	{
		assertFalse(jamesBond.bondRegex(" ( 6 7 ) "));
	}

	@Test 
	public void testCase277()
	{
		assertFalse(jamesBond.bondRegex(" ( 7 ( "));
	}

	@Test 
	public void testCase278()
	{
		assertFalse(jamesBond.bondRegex(" ( 7 ) "));
	}

	@Test 
	public void testCase279()
	{
		assertTrue(jamesBond.bondRegex(" ( 7 0 0 7 ) "));
	}

	@Test 
	public void testCase280()
	{
		assertFalse(jamesBond.bondRegex(" ( 7 0 7 ) "));
	}

	@Test 
	public void testCase281()
	{
		assertFalse(jamesBond.bondRegex(" ( 7 7 ) "));
	}

	@Test 
	public void testCase282()
	{
		assertFalse(jamesBond.bondRegex(" ( 8 ( "));
	}

	@Test 
	public void testCase283()
	{
		assertFalse(jamesBond.bondRegex(" ( 8 ) "));
	}

	@Test 
	public void testCase284()
	{
		assertTrue(jamesBond.bondRegex(" ( 8 0 0 7 ) "));
	}

	@Test 
	public void testCase285()
	{
		assertFalse(jamesBond.bondRegex(" ( 8 0 7 ) "));
	}

	@Test 
	public void testCase286()
	{
		assertFalse(jamesBond.bondRegex(" ( 8 7 ) "));
	}

	@Test 
	public void testCase287()
	{
		assertFalse(jamesBond.bondRegex(" ( 9 ( "));
	}

	@Test 
	public void testCase288()
	{
		assertFalse(jamesBond.bondRegex(" ( 9 ) "));
	}

	@Test 
	public void testCase289()
	{
		assertTrue(jamesBond.bondRegex(" ( 9 0 0 7 ) "));
	}

	@Test 
	public void testCase290()
	{
		assertFalse(jamesBond.bondRegex(" ( 9 0 7 ) "));
	}

	@Test 
	public void testCase291()
	{
		assertFalse(jamesBond.bondRegex(" ( 9 7 ) "));
	}

	@Test 
	public void testCase292()
	{
		assertFalse(jamesBond.bondRegex(" ) "));
	}

	@Test 
	public void testCase293()
	{
		assertFalse(jamesBond.bondRegex(" ) ( "));
	}

	@Test 
	public void testCase294()
	{
		assertFalse(jamesBond.bondRegex(" ) ) "));
	}

	@Test 
	public void testCase295()
	{
		assertFalse(jamesBond.bondRegex(" ) 0 0 7 ) "));
	}

	@Test 
	public void testCase296()
	{
		assertFalse(jamesBond.bondRegex(" ) 0 7 ) "));
	}

	@Test 
	public void testCase297()
	{
		assertFalse(jamesBond.bondRegex(" ) 7 ) "));
	}

	@Test 
	public void testCase298()
	{
		assertFalse(jamesBond.bondRegex(" 0 ( "));
	}

	@Test 
	public void testCase299()
	{
		assertFalse(jamesBond.bondRegex(" 0 ) "));
	}

	@Test 
	public void testCase300()
	{
		assertFalse(jamesBond.bondRegex(" 0 0 0 7 ) "));
	}

	@Test 
	public void testCase301()
	{
		assertFalse(jamesBond.bondRegex(" 0 0 7 ) "));
	}

	@Test 
	public void testCase302()
	{
		assertFalse(jamesBond.bondRegex(" 0 7 ) "));
	}

	@Test 
	public void testCase303()
	{
		assertFalse(jamesBond.bondRegex(" 1 ( "));
	}

	@Test 
	public void testCase304()
	{
		assertFalse(jamesBond.bondRegex(" 1 ) "));
	}

	@Test 
	public void testCase305()
	{
		assertFalse(jamesBond.bondRegex(" 1 0 0 7 ) "));
	}

	@Test 
	public void testCase306()
	{
		assertFalse(jamesBond.bondRegex(" 1 0 7 ) "));
	}

	@Test 
	public void testCase307()
	{
		assertFalse(jamesBond.bondRegex(" 1 7 ) "));
	}

	@Test 
	public void testCase308()
	{
		assertFalse(jamesBond.bondRegex(" 2 ( "));
	}

	@Test 
	public void testCase309()
	{
		assertFalse(jamesBond.bondRegex(" 2 ) "));
	}

	@Test 
	public void testCase310()
	{
		assertFalse(jamesBond.bondRegex(" 2 0 0 7 ) "));
	}

	@Test 
	public void testCase311()
	{
		assertFalse(jamesBond.bondRegex(" 2 0 7 ) "));
	}

	@Test 
	public void testCase312()
	{
		assertFalse(jamesBond.bondRegex(" 2 7 ) "));
	}

	@Test 
	public void testCase313()
	{
		assertFalse(jamesBond.bondRegex(" 3 ( "));
	}

	@Test 
	public void testCase314()
	{
		assertFalse(jamesBond.bondRegex(" 3 ) "));
	}

	@Test 
	public void testCase315()
	{
		assertFalse(jamesBond.bondRegex(" 3 0 0 7 ) "));
	}

	@Test 
	public void testCase316()
	{
		assertFalse(jamesBond.bondRegex(" 3 0 7 ) "));
	}

	@Test 
	public void testCase317()
	{
		assertFalse(jamesBond.bondRegex(" 3 7 ) "));
	}

	@Test 
	public void testCase318()
	{
		assertFalse(jamesBond.bondRegex(" 4 ( "));
	}

	@Test 
	public void testCase319()
	{
		assertFalse(jamesBond.bondRegex(" 4 ) "));
	}

	@Test 
	public void testCase320()
	{
		assertFalse(jamesBond.bondRegex(" 4 0 0 7 ) "));
	}

	@Test 
	public void testCase321()
	{
		assertFalse(jamesBond.bondRegex(" 4 0 7 ) "));
	}

	@Test 
	public void testCase322()
	{
		assertFalse(jamesBond.bondRegex(" 4 7 ) "));
	}

	@Test 
	public void testCase323()
	{
		assertFalse(jamesBond.bondRegex(" 5 ( "));
	}

	@Test 
	public void testCase324()
	{
		assertFalse(jamesBond.bondRegex(" 5 ) "));
	}

	@Test 
	public void testCase325()
	{
		assertFalse(jamesBond.bondRegex(" 5 0 0 7 ) "));
	}

	@Test 
	public void testCase326()
	{
		assertFalse(jamesBond.bondRegex(" 5 0 7 ) "));
	}

	@Test 
	public void testCase327()
	{
		assertFalse(jamesBond.bondRegex(" 5 7 ) "));
	}

	@Test 
	public void testCase328()
	{
		assertFalse(jamesBond.bondRegex(" 6 ( "));
	}

	@Test 
	public void testCase329()
	{
		assertFalse(jamesBond.bondRegex(" 6 ) "));
	}

	@Test 
	public void testCase330()
	{
		assertFalse(jamesBond.bondRegex(" 6 0 0 7 ) "));
	}

	@Test 
	public void testCase331()
	{
		assertFalse(jamesBond.bondRegex(" 6 0 7 ) "));
	}

	@Test 
	public void testCase332()
	{
		assertFalse(jamesBond.bondRegex(" 6 7 ) "));
	}

	@Test 
	public void testCase333()
	{
		assertFalse(jamesBond.bondRegex(" 7 ( "));
	}

	@Test 
	public void testCase334()
	{
		assertFalse(jamesBond.bondRegex(" 7 ) "));
	}

	@Test 
	public void testCase335()
	{
		assertFalse(jamesBond.bondRegex(" 7 0 0 7 ) "));
	}

	@Test 
	public void testCase336()
	{
		assertFalse(jamesBond.bondRegex(" 7 0 7 ) "));
	}

	@Test 
	public void testCase337()
	{
		assertFalse(jamesBond.bondRegex(" 7 7 ) "));
	}

	@Test 
	public void testCase338()
	{
		assertFalse(jamesBond.bondRegex(" 8 ( "));
	}

	@Test 
	public void testCase339()
	{
		assertFalse(jamesBond.bondRegex(" 8 ) "));
	}

	@Test 
	public void testCase340()
	{
		assertFalse(jamesBond.bondRegex(" 8 0 0 7 ) "));
	}

	@Test 
	public void testCase341()
	{
		assertFalse(jamesBond.bondRegex(" 8 0 7 ) "));
	}

	@Test 
	public void testCase342()
	{
		assertFalse(jamesBond.bondRegex(" 8 7 ) "));
	}

	@Test 
	public void testCase343()
	{
		assertFalse(jamesBond.bondRegex(" 9 ( "));
	}

	@Test 
	public void testCase344()
	{
		assertFalse(jamesBond.bondRegex(" 9 ) "));
	}

	@Test 
	public void testCase345()
	{
		assertFalse(jamesBond.bondRegex(" 9 0 0 7 ) "));
	}

	@Test 
	public void testCase346()
	{
		assertFalse(jamesBond.bondRegex(" 9 0 7 ) "));
	}

	@Test 
	public void testCase347()
	{
		assertFalse(jamesBond.bondRegex(" 9 7 ) "));
	}
	
	@After
	public void tearDown() throws Exception {
		jamesBond=null;
	}
	
}