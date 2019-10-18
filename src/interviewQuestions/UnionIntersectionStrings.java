package interviewQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UnionIntersectionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a = "ABCDEF";
			String b = "ABIJKL";
			Union(a,b);
			Intersection(a,b);
	}
			public static void Union(String a, String b) {
				String c=a.concat(b);
				char x[]=c.toCharArray();
				Set s1=new TreeSet();
				for(char m:x){
					if(!s1.add(m)) {
						s1.add(m);
					}else {
						s1.add(m);
					}
				}
				System.out.println("Union   "+s1.toString());
			}		
			
			public static void Intersection(String a, String b) {;
				Set<Character> ss1 = toSet(a);
				ss1.retainAll(toSet(b));
				System.out.println("Intersection   "+ss1);
			}

			public static Set<Character> toSet(String s) {
				Set<Character> ss = new HashSet<Character>(s.length());
				for (char c : s.toCharArray())
					ss.add(Character.valueOf(c));
				System.out.println(ss);
				return ss;
			}
	}
