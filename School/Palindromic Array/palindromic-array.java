//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  int flag=0;
        for(int i=0;i<a.length;i++)
        {
            char a1[]=String.valueOf(a[i]).toCharArray();
            int start=0;
            int end=a1.length-1;
            while(start<=end)
            {
                if(a1[start]!=a1[end])
                {
                    flag=1;
                }
                start++;
                end--;
            }
            if (flag==1)
            {
                return 0;
            }
        }
        return 1;
           }
}