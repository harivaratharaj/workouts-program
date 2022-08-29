package OOPS;
public class Singleinheritance
 {
int a=25;
String name="harivaratharaj";
 
public void addd()
{
	int q=12;
	int x=q+12;
	System.out.println(x);
}
public void namess()
{
	String name1="hari";
	String name2="suganth";
	System.out.println(name1+" "+name2);
}}
class single extends Singleinheritance
{
	public void functions()
	{
		System.out.println("java");
		System.out.println("selenium");
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
single d=new single();
	d.addd();
    d.namess();
    d.functions();
	}
}