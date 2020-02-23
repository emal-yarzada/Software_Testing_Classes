package myframework;

import java.io.IOException;

import org.testng.annotations.Test;
import myframework.Home;

public class Runner extends PageSetup {
	
  @Test
  public void f() throws IOException {
	  Home h = new Home(driver);
	  h.sendKeyToEmail();
	  h.sendKeyToPassword();
	

  }

}
