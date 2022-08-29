package OOPS;

abstract class Abstraction{
int e=10,r=10;
int f=e+r;

abstract void multiplication();
int a=200;
String q="Hari";
void declared()
{
String s="value";
int w=11,b=22,c=33;
int d=w+b;
int e=b-c;
System.out.println("value of "+d);
System.out.println("value of "+s);
System.out.println(w+" "+b+" "+e);
}}
class name extends Abstraction
{
void multiplication()
{
System.out.println(q+" "+a);
System.out.println(q+" "+a+" "+f);
}
public void add()
{
int aa=12,bb=13;
int cc=aa*bb;
System.out.println("value of cc "+cc);
}
public void sub()
{
System.out.println(a+" "+q);
System.out.println(q);
}}
public class b_abstract
{
	public static void main(String[] args) {
name v=new name();
v.multiplication();
v.add();
v.sub();
v.declared();
}} 
