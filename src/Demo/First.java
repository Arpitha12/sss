package Demo;

import java.util.ArrayList;
import java.util.List;

public class First {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(1);
		l.add(3);
		l.add(2);
		List<Integer> reverse=new ArrayList();
		//System.out.println(l);
		/*int i=0;
		int j=l.size()-1;
		while(i<j){
			int temp=(int)l.get(i);
			l.set(i,l.get(j));
			l.set(j, temp);
			i++;
			j--;
			
		}*/
		for(int i=l.size()-1;i>=0;i--){
	reverse.add(l.get(i));	}
		System.out.println(reverse);
		
	}
	}
