package testPackage;

public class Test {

	public static void main(String[] args){
		int x = 10;
		changeVar(x);
		System.out.println("x is " + x);
	}

	public static void changeVar(int x){ 
		x = change(x);
		x+=1;
	}
	public static int change(int x){
		if(x<1)
			return -1;
		else
			return change(x/2)+1;
	}

}
