package com.cg.multipleinheritence;

class Dad{
	void snoring() {
		System.out.println("I have the habit of snoring");
	}
}
class Mom{
	void snoring()

	{
		System.out.println("I have the habit of snoring ");
	}
}
class You extends Dad,Mom{
	
}

public class MulitpleInheritence {
You y=new You();
//multiple inheritence is not supported in java due to ambuigity
}
