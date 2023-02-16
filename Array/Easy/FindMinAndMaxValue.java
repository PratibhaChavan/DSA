Maximum and minimum of an array using minimum number of comparisons
Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

Examples:

Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
              Maximum element is: 9
           
Asked in:ABCO Accolite Amazon Cisco Hike Microsoft Snapdeal VMWare Google Adobe

public class FindMinAndMaxValue 
{
    public static void main(String args[])
    {
        int arr[]={1,2,5,4,3,8,5};
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }

        }
        System.out.print("Min= "+ min+" Max= "+max);
    }
}
