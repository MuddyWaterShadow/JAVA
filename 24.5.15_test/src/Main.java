import java.util.Arrays;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //test1
        int[] arr1 = new int[]{3, 5, 7, 2, 9, 0, 6, 1, 8, 4};
        arr1 = test1(arr1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr1));

        //test2
        int[] arr2 = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        int target = 3;
        System.out.println(test2(arr2,target));

        //test3
        System.out.println(test3(5));

        //递归程序设计
        System.out.println(test3_2(5));

        //test4
        System.out.println(test4());

        //test5
        test5('A','B','C',5);
    }
    public static int[] test1(int[] a){
        int l = a.length;
        for (int t = 0; t < l - 1; t++) {
            boolean flag = false;
            for (int i = 0, j; i < l -t - 1; i++) {
                if (a[i] > a[i + 1]) {
                    j = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = j;
                    flag = true;
                }
            }
            if(!flag) break;
        }
        return a;
    }

    public static int test2(int[] arr2, int target){
        int left = 0,right = arr2.length - 1;
        while (left <= right) {
            int mid = (left + right)/2;
            int i = arr2[mid];
            if(i < target)
                left = mid + 1;
            else if(i > target)
                right  = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public static int test3(int n){
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static int test3_2(int n){
        if(n == 0 || n == 1) return 1;
        return test3_2(n - 1) + test3_2( n - 2);
    }

    public static boolean test4(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int i = 0, j = chars.length - 1;
        while(i < (j + 1) / 2){
            if(chars[i] != chars[j])
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void test5(char a,char b,char c,int n){
        if (n == 1){
            System.out.println(a + "-->" + c);
        } else{
            test5(a , c , b , n - 1);
            System.out.println(a + "-->" + c);
            test5(b , a , c , n - 1);
        }

    }
}

