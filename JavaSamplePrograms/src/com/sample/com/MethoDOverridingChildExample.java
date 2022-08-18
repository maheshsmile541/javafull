package com.sample.com;

public class MethoDOverridingChildExample extends MethodOverridingParentExample{
	
	void earlyMorningHabit() {
		System.out.print("playing cricket");
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethoDOverridingChildExample m1=new MethoDOverridingChildExample();
		//MethodOverridingParentExample m2=new MethoDOverridingChildExample();
		m1.earlyMorningHabit();		
		//m2.earlyMorningHabit();						

	}
	
}
