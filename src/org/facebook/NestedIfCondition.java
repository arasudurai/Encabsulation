package org.facebook;

public class NestedIfCondition {
	
	public static void main(String[] args) {
		
		int weight = 65; int height =167; int Education = 12;
		
		
		
		if (weight >= 67 && height >= 170 && Education >=12) {
			
			System.out.println("Eligible for SSB");
		}
		
		
		
		else if (weight >=67 || height >= 170 || Education >= 12 ) {
			
			System.out.println("Eligible for Police");
		}
		
		
		
		else {
			System.out.println("Not Eligible for anything");
		}
	
		
	}

}
