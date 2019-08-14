import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test5 {

	public static void main(String[] args) {
		// Collection Framework
		// List, Map, Set
		// ArrayList, HashMap, HashSet
		List list = new ArrayList();
		list.add("aaaa");
		list.add(1234);
		Object o1 = list.get(0); // 값 꺼내오기 => object
		String s1 = (String) o1;

		List<String> list2 = new ArrayList<String>();
		list2.add("aaaa");
		// list2.add(1234);
		String s2 = list2.get(0);

		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "값1");
		String result1 = map.get("a");

		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("a", 123123);
		int result2 = map2.get("a");

		List<Map<String, String>> persons = new ArrayList<Map<String, String>>();
		// 첫번째 사람 정보 => map
		Map<String, String> p1 = new HashMap<String, String>();
		p1.put("height", "171");
		p1.put("weight", "70");
		p1.put("name", "Hong");
		persons.add(p1);

		// persons.get(0).get("name");
		Map<String, String> pp1 = persons.get(0);
		String name = pp1.get("name");

	}

}
