package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MountainPeaks {
    static Scanner sr = new Scanner(System.in);
    public static List<Integer> countPeaks(int[] arr) {
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < arr.length - 1; i++) {
            if (i > 0 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peaks.add(i);
            }
        }
        return peaks;
    }

    public static int returnMaxDays(List<Integer> peaks, int[] arr, int maxDays) {  
        for (int d = 1; d <= arr.length; d++) {
            if(arr.length % d == 0) {
                int segmenSize = arr.length / d;
                int count = 0;
                for (int peak: peaks) {
                    if (peak / segmenSize == count) {
                        count++;
                        System.out.println("d: " + d + "count" + count + " peak: " + peak + " segmenSize: " + segmenSize);
                    }
                }
                if(count == d) {
                   maxDays = d;
                }
            } 
        }
        return maxDays;
    }

    public static void main(String[] args) {
        int n = sr.nextInt();
        int[] arr = new int[n];


    
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }

        if (n < 3) {
            System.out.println(0);
            return;
        }
        List<Integer> peaks = countPeaks(arr);
        if (peaks.isEmpty()) {
            System.out.println(0);
            return;
        }
        System.out.println("countPeaks: " + peaks.size() + peaks);
        int maxDays = 1;
        System.out.println(returnMaxDays(peaks, arr, maxDays));

        
        sr.close();
    }
}