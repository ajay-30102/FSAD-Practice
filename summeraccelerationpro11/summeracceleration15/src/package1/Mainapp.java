package client;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.Iterator;
public class Mainapp {

public static void main(String[] args) {
ArrayList<String> a1 = new ArrayList();
a1.add("mani");
a1.add("ajay");
a1.add("indra");
Iterator<String> i1 = a1.iterator();
while(i1.hasNext()) {
String s= i1.next();
System.out.println(s+" ");
}
LinkedList<String> l1 = new LinkedList();
l1.add("mani");
l1.add("ajay");
l1.add("mohi");
Iterator<String> i2 = l1.iterator();
while(i2.hasNext()) {
String s = i2.next();
System.out.println(s+" ");
}
Vector<Integer> v1 = new Vector();
v1.add(2);
v1.add(-5);
v1.add(-20);
v1.add(10);
Iterator<Integer> i3 = v1.iterator();
while(i3.hasNext()) {
int x = i3.next();
if(x%2 != 0) {
v1.remove(x);
}
Iterator<Integer> i4 = v1.iterator();
while(i4.hasNext()) {
System.out.println(i4.next());}
}
Stack<Double> s1 = new Stack();
s1.add(10.4);
s1.add(25.3);
s1.add(33.6);
Iterator<Double> i4 = s1.iterator();
while(i4.hasNext()) {
double s = i4.next();
System.out.println(s+" ");
}
}
}
