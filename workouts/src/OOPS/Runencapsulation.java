package OOPS;

public class Runencapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation a=new Encapsulation();
		a.setName("hari");
		a.setNum(41);
		a.setDigit(22.22);
		System.out.println(a.getName()+" "+" "+ a.getDigit()+" "+a.getNum());
		System.out.println(a.getName().length());
	}

}
