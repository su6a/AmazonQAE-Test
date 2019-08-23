package interviewQuestions;

public class ReverseAlternativeWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello Good Morning Surendar";
		int len = s.length();
  
		
		System.out.println(ReverseWordsinString(s,len));
	}
	
	 private static String ReverseWordsinString(String s, int len) { 
		 // TODO Auto-generated	 method stub 
	 StringBuilder x = new StringBuilder();
	 char[] b = s.toCharArray(); 
	 char[] c= new char[len]; 
	 int j=0,k=1;
	 for (int i=0;i<len;i++) { 
		 if(b[i]==' ') {
			 char[] e= new char[j];
			 if(k%2==0) {
				 e =  Reverse(c,j);
				 x.append(e);
			 }else {
				 for(int q=0;q<j;q++) {
					 e[q]=c[q];
				 }
			 x.append(e);
			 }
			 x.append(' ');
			 //x = Append(x,e);
			 j=0; 
			 c = new char[len];
			k++;
		 }	 
	 	 else { 
			 c[j]=b[i]; 
			 j++;
		 }
	 }
	 char[] e= new char[j];
	 if(k%2==0) {
	 e =  Reverse(c,j);}else {
		 for(int q=0;q<j;q++) {
			 e[q]=c[q];}
	 }
	 x.append(e);
	 return x.toString();
	 }

	private static char[] Reverse(char[] c,int k) { // TODO Auto-generated method stub 
		 char[] x = new char[k];
		 int j=0;
		 for (int i = k-1;i>=0;i--, j++) {
			 x[j]=c[i];
		 }
		 return x;
	 }
	 
}
