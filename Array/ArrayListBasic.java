package AL;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayListBasic {

	public static void main(String[] args) {
	List<Integer> l = new ArrayList<Integer>();
	List<String> a = new LinkedList<String>();
	l.add(5);
	l.add(10);
	a.add("Hello");
	a.add("hi");
	
	for(Integer i:l)
		System.out.println(i);
	
	for(String s:a)
		System.out.println(s);
	
	

	}

}
