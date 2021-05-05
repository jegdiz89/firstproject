package org.tcs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit {
//Whatever the oreder we give it will execute in the order
	//All the method should be Public & @Before Class&After Class must Public static
	//since we are not using Main method Run by java application will not come here. Run as Junit
@BeforeClass
public static void BeforeClass() {
System.out.println("Before Class");
}

@AfterClass
public static void AfterClass() {
System.out.println("after Class");
}

@Before
public void Before() {
System.out.println("Before");
}

@After
public void After() {
System.out.println("After");
}
//To Skip the Test method we use @Ignore
@Ignore
@Test
public void Test02() {
System.out.println("Test 02");
}

@Test
public void Test01() {
System.out.println("Test01");
}

@Test
public void Test03() {
System.out.println("Test03");
}

@Test
public void Test05() {
System.out.println("Test05");
}

@Test
public void Test04() {
System.out.println("Test04");
}

}

