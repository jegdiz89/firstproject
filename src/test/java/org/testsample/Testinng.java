package org.testsample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testinng {
	
@BeforeClass
private void beforeclass() {
System.out.println("Before Class");
}

@BeforeMethod
private void beforemethod() {
System.out.println("Before method");
}

@Test(enabled=false)
private void tc01() {
System.out.println("Testcase 01");
}
@Test
public void tc02() {
	System.out.println("Testcase 02");
}
@Test(priority=-5)
private void tc03() {
	System.out.println("Testcase 03");
}
@Test(priority=-4)
private void tc04() {
	System.out.println("Testcase 04");
}
@Test(priority=3)
private void tc05() {
	System.out.println("Testcase 05");
}
@AfterMethod
private void aftermethod() {
	System.out.println("After Method");
}
@AfterClass
private void afterclass() {
	System.out.println("After class");
}
}
