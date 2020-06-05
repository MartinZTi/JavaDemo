package com.mzt.demoTest;

public class TgetResource {

	  public void testgetResource() {
		  System.out.println(this.getClass());//class com.mzt.demoTest.TgetResource
		  System.out.println(this.getClass().getResource("").getPath());///D:/Workspaces/eclipse-workspace(UTF-8)/DemoStudy/target/classes/com/mzt/demoTest/
		  System.out.println(this.getClass().getResource("/").getPath());///D:/Workspaces/eclipse-workspace(UTF-8)/DemoStudy/target/classes/
		  System.out.println(this.getClass().getResource("/com").getPath());///D:/Workspaces/eclipse-workspace(UTF-8)/DemoStudy/target/classes/com
		  System.out.println(this.getClass().getResource("/com/mzt").getPath());///D:/Workspaces/eclipse-workspace(UTF-8)/DemoStudy/target/classes/com/mzt
	  }

	  public static void main(String[] args) {
		TgetResource t = new TgetResource();
		t.testgetResource();
	}
}
