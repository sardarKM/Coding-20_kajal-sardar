import java.util.*;
import java.lang.*;
import java.io.*;

public class Duplicate{
  
    public static void removeDuplicates(int a[], int n)
    {
        int[] res = new int[n];
        int j = 0;
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                res[j++] = a[i];
            }
        }  
        res[j++] = a[n - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int a[] = {1,2,1,2,3,4,5,6,4,4,5,5};
        int n = a.length;
        removeDuplicates(a, n);
    }
}