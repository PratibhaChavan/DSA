

public class FindMaxSubInSubArray {
    static public int PrintSum(int arr[])
    {
        int max_sum=arr[0];
        int sum=arr[0];
        if(arr.length==1)
        {
            return arr[0];
        }
        for(int i=1;i< arr.length;i++)
        {
            if(sum<0)
            {
                sum=arr[i];
            }
            else
            {
                sum=sum+arr[i];
            }
            max_sum=Math.max(sum,max_sum);
        }
     return max_sum;
    }
    public static void main(String args[]){
        int arr[]={1,2,-5,4,3,8,5};
        int result=PrintSum(arr);
        System.out.println(result);
    }
}
