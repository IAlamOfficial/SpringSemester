package testPackage;

public class Test {

	public static void main(String[] args){
		int x = 10;
		changeVar(x);
		System.out.println("X is " + x);
	}

	public static void changeVar(int x){ 
		change(x);
		x+=1;
	}
	public static int change(int x){
		if(x<0)
			return 5;
		else
			return change(change(x/2));
	}

}
