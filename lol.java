
/*
template<class T, class Comparable>
class BSTtree{
T val;
Node *node;
const T& comparable(T val){
return T->val > T->root;
}
bool operator > (const &Comparable c , const &Comparable d){
return c > d;
}
}
Node *node(){
Node *root;
Comparable comp;
}

*/
import java.util.*;

// one class needs to have a main() method
public class HelloWorld
{
// arguments are passed using the text field below this editor
public static void main(String[] args)
{
System.out.println("hello"); 
privateschool priv = new privateschool("gal", 10000); 
privateschool priv1 = new privateschool("lowell", 20000); 
privateschool priv2 = new privateschool("bal", 30000); 
privateschool priv3 = new privateschool("wash", 40000); 
ArrayList<Object> arr = new ArrayList<Object>();
List<privateschool> arr1= new ArrayList<privateschool>();


arr1.add(priv);
arr1.add(priv1);
arr1.add(priv2);
arr1.add(priv3);

Collections.sort(arr1);

Iterator iter = arr1.iterator();
for (Object obj : arr1){
privateschool p = (privateschool) obj;
System.out.println("the name of the school sorted in order is " + p.name
+ " and the tuition is " + p.tuition);

}


}
}


// you can add other public classes to this editor in any order

public class School{
String name;
int tuition;

School () {
this.name = "";
this.tuition = 0;
}
School (String name, int tuition){
this.name = name;
this.tuition = tuition;
}
String get_name(){
return name;
}
void set_name(String name){
this.name = name;
}
String to_name(){
return "the name of the school is " + name;
}
}


public class privateschool implements Comparable<privateschool>{
String name;
int tuition;
privateschool(){
name = "";
tuition = 0;
}
privateschool(String name, int tuition){
this.name = name;
this.tuition = tuition;
}
String get_name(){
return name;
}
void set_name(String name){
this.name = name;
}
int get_tuition(){
return tuition;
}
void set_name(int tuition){
this.tuition = tuition;
}
String to_string(){
return "the name of the private school is " + name + " and the tuition is " + tuition;
}
@Override
public int compareTo(privateschool pp) {
return pp.get_name().compareTo(this.name);
}
}


