import java.util.*;


public class DuplicateFilter {

	
	public static void main(String args[])
	{
		List<Integer>listA=new ArrayList<Integer>();
		
		listA.add(1);
		listA.add(2);
		listA.add(3);
		
		listA.add(1);
		System.out.println("with duplicate"+listA.size());
		Set<Integer> temp=new HashSet<Integer>(listA);
		List<Integer>listB=new ArrayList<Integer>(temp);
		//System.out.println(listB.size());
		System.out.println("without duplicate"+listB.size());
		
		
	}
}
