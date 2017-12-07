package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		
		Map<String, String> m = new HashMap<String, String>();
		m.put("�̸�","ȫ�浿");
		m.put("����", "33��");
		list.add(m);
		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("�̸�","��浿");
		m2.put("����", "22��");
		list.add(m2);
		
		System.out.println(list.size());
		for(Map<String,String> m1 : list) {
			System.out.println(m1);
		}
	}
}
