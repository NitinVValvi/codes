package comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	
	public static void main(String[] args) {
		
		List<Laptop> l = new ArrayList<>();
		
		l.add(new Laptop("dell",12,800));
		l.add(new Laptop("hp",8,600));
		l.add(new Laptop("lenovo",16,1600));
		
		Comparator<Laptop> com = new Comparator<Laptop>() {
			
			public int compare(Laptop l1,Laptop l2)
			{
				if(l1.getPrice()>l2.getPrice() )
				{
					return 1;
				}
				else
					return -1;
			}
		};
		//Collections.sort(l);// for comparable
		
		Collections.sort(l,com);
		
		for (Laptop laptop : l) {
			System.out.println(laptop);
		}
	}
}
