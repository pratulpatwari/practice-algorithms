package dev.pratul;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SmallestPair {
	
	 private static final Scanner scanner = new Scanner(System.in);
	
	 static int[] closestNumbers(int[] arr) {
	        Arrays.sort(arr);
	        List<Integer> list = new ArrayList<Integer>();
	        int[] pair = new int[2];
	        int smallest = arr[1] - arr[0];
	        for(int i=1; i < arr.length - 1; i++){
	            int difference = arr[i + 1] - arr[i];
	            if(difference < smallest){
	            	smallest = difference;
	                pair[0] = arr[i];
	                pair[1] = arr[i + 1];
	                System.out.println("(" + arr[i + 1] + ") - (" + arr[i] + ")    =    " + difference);
//	                if(list.size() > 0) {
//	                	list.clear();
//	                }
	                list.add(pair[0]);
	                list.add(pair[1]);
	            } else if(difference == smallest){
	            	list.add(pair[0]);
	                list.add(pair[1]);
	            }
	        }
	        return list.stream().mapToInt(Integer::intValue).toArray();
	    }

	public static void main(String[] args) throws IOException{
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        System.out.println("Result: ");
        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
        	System.out.print(String.valueOf(result[i]) + " ");

            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
            }
        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
	}

}
