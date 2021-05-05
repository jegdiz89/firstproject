package org.test;

import org.junit.Ignore;
import org.junit.Test;

public class Sample1 {
@Test
public void tc0() {
System.out.println("Testcase 1");
}
@Test
public void tc1() {
	System.out.println("Testcase 2");
}
@Test
public void tc2() {
	System.out.println("Testcase 3");
}
@Ignore
@Test
public void tc7() {
	System.out.println("Testcase 7");
}
}
