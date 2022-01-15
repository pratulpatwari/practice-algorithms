package dev.pratul;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Throttling {

	public static int droppedRequests(List<Integer> requestTime) {
		// Write your code here
		int dropped = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < requestTime.size(); i++) {
			if (map.isEmpty()) {
				map.put(requestTime.get(i), 1);
			} else {
				if (map.containsKey(requestTime.get(i))) {
					map.replace(requestTime.get(i), map.get(requestTime.get(i)) + 1);
				} else {
					map.put(requestTime.get(i), 1);
				}
			}
		}
		
		int transactions = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			transactions += entry.getValue();
			if(entry.getValue() > 3) {
				dropped += entry.getValue() - 3; 
			}
			
			if(transactions > 20 && entry.getKey() <= 10) {
				dropped += transactions - 20;
			}
			
			if(transactions > 60 && entry.getKey() <= 60) {
				dropped += transactions - 60;
			}
		}
		
		
		return dropped;
	}

	// max 3 transaction / second
	// max 20 transaction per 10 sec
	// max 60 transaction / minute
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(11);
		list.add(11);
		list.add(11);
		list.add(11);

		System.out.println(droppedRequests(list));

	}

}
