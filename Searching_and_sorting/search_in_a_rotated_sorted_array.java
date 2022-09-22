package Searching_and_sorting;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class search_in_a_rotated_sorted_array {
    public static int findPivot(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if(arr[mid] < arr[high]){
                high =  mid;
            }else{
                low = mid + 1;
            }
        }
        return arr[high];
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int povit = findPivot(arr);
        System.out.println(findPivot(arr));
    }
}
