package day6;

class simplecalci { // parent for the advcalci

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {

		return a - b;
	}

}

class advcalci extends simplecalci // inherited the properties of class :simplecalci -->child
{
	public int mul(int a, int b) {
		return a * b;
	}

	public int dic(int a, int b) {
		return a / b;
	}
}

class supercalsi extends advcalci // inherited the properties of class :advcalci -->grant child
{
	public double supercalci() {
		return Math.pow(34, 6);
	}
}

public class inheritance {
	public static void main(String[] args) {

		advcalci adv = new advcalci(); // object to access advcalci
		System.out.println("add :" + adv.add(3, 4));
		System.out.println("div :" + adv.dic(34, 34));
		System.out.println("mul :" + adv.mul(34, 45));
		System.out.println("sub :" + adv.sub(34, 7));

		supercalsi sup = new supercalsi(); // object to access supercalci
		System.out.println("pow : " + sup.supercalci());

	}
}
