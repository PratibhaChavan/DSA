// Write a program to reverse an array or string
// Given an array (or string), the task is to reverse the array/string.
// Examples : 
 

// Input  : arr[] = {1, 2, 3}
// Output : arr[] = {3, 2, 1}

// Input :  arr[] = {4, 5, 1, 2}
// Output : arr[] = {2, 1, 5, 4}
// Asked in : Infosys Moonfrog Labs

public class ReverseArray
{
    public static void main(String args[])
    {
        int arr[]={1, 2, 3};
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

}
}
