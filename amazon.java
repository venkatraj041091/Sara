package com.hema;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.baseclass;

public class amazon extends baseclass {

	@BeforeClass
	private void urllaunch() throws IOException {
		getDriver();
		String getdatafromfile = getdatafromfile(0);
		getApplyTitle(getdatafromfile);
		maximizewindow();
		implicitywait();
	}

	@Test
	private void funtion() throws IOException, InterruptedException {
		String id1 = getdatafromfile(1);
		WebElement menu = findElementByclassName(id1);
		elementClick1(menu);

		String id2 = getdatafromfile(2);
		WebElement men = findElementByXpath(id2);
		elementClick1(men);

		String id3 = getdatafromfile(3);
		WebElement me = findElementByXpath(id3);
		elementClick1(me);

		String id4 = getdatafromfile(4);
		WebElement m = findElementByXpath(id4);
		elementClick1(m);

		Thread.sleep(5000);
		String id5 = getdatafromfile(5);
		WebElement m1 = findElementByXpath(id5);
		elementClick1(m1);

		windowshandle();
		
		String id6 = getdatafromfile(6);
		WebElement m2 = findElementByXpath(id6);
		elementClick1(m2);
 
		windowshandle(); 
		
		
		String id7 = getdatafromfile(7);
		WebElement m3 = findElementByXpath(id7);
		Thread.sleep(5000);
		jsclick(m3);

		String id8 = getdatafromfile(8);
		WebElement m4 = findElementById(id8);
		elementClick1(m4);

	}
	    @AfterClass
	    private void after() {
		//quitwindow();
	}


}
