package javaproject;

public class MethodOverridingChildExample  extends MethodOverridingParentExample{
	@Override
	public void earlyMorningHabit() {
		System.out.println("playing cricket");
	}	
	
	public void EarlyMorningHabit() {
		System.out.print("playing cricket kabbaddi");
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverridingChildExample m1=new MethodOverridingChildExample();
		MethodOverridingChildExample m2=new MethodOverridingChildExample();
		m1.earlyMorningHabit();		
		m2.EarlyMorningHabit();						

	}


}
