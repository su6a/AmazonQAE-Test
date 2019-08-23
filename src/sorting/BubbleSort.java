package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,3,5,2,1};
		Sort(a);
	}
	
	public static void Sort(int[] a) {
		
		int n,temp=0;
		n=a.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
	}
	public static void SortWithoutTemp(int[] a) {
		
		int n,temp=0;
		n=a.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                	a[i]= a[i]+a[j];
                	a[j]=a[i]-a[j];
                	a[i]=a[i]-a[j];
//                    x = x + y; 
//                    y = x - y; 
//                    x = x - y;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
	}

}
