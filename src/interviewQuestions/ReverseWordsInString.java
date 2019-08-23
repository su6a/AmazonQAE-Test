package interviewQuestions;

public class ReverseWordsInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello Good Morning";
		int len = s.length();
  
		
		System.out.println(ReverseWordsinString(s,len));
	}
	
	 private static String ReverseWordsinString(String s, int len) { 
		 // TODO Auto-generated	 method stub 
	 StringBuilder x = new StringBuilder();
	 char[] b = s.toCharArray(); 
	 char[] c= new char[len]; 
	 int j=0,k=0;
	 for (int i=0;i<len;i++) { 
		 if(b[i]==' ') { 
			 char[] e= new char[j];
			 e =  Reverse(c,j);
			 x.append(e);
			 x.append(' ');
			 //x = Append(x,e);
			 j=0; 
			 c = new char[len];
			
		 }	 
	 	 else { 
			 c[j]=b[i]; 
			 k++;
			 j++;
		 }
	 }
	 char[] e= new char[k];
	 e =  Reverse(c,j);
	 x.append(e);
	 return x.toString();
	 }
	 
//	 private static char[] Append(char[] x, char[] c) {
//		// TODO Auto-generated method stub
//		 int len=x.length;
//		 int len2=c.length;
//		 char[] s = new char[len+len2];
//		 for(int ii=0;ii<len2-1;ii++ ) {
//			 s[ii]=c[ii];
//		 }
//		 for (int i=len,j=0; i<len+(len2-1);i++) {
//			 s[i]=c[j];
//		 }
//		 //String w= new String(s);
//		return s;
//	}

	private static char[] Reverse(char[] c,int k) { // TODO Auto-generated method stub 
		 char[] x = new char[k];
		 int j=0;
		 for (int i = k-1;i>=0;i--, j++) {
			 x[j]=c[i];
		 }
		 return x;
	 }
	 
}
