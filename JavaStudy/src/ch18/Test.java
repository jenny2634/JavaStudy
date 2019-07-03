package ch18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		List<Map<String, Integer>> list= new ArrayList<>();
		
		Map<String, Integer> map = new HashMap<>();
		map.put("age", 40);
		map.put("score", 83);
		list.add(map);
		
		map.get("scoreEng");
		
		map = new HashMap<>();
		map.put("age", 20);
		map.put("score", 93);
		
		list.add(map);
		
		
	}
}
