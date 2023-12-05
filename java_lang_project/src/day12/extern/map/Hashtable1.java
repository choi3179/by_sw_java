package day12.extern.map;

import java.util.Hashtable;
import java.util.Enumeration;
class Hashtable1  {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("1","����");
		ht.put("2","����");
		ht.put("3","��");
		if(ht.containsKey("1"))
			System.out.println("���� ���ԵǾ� ����");
		if(ht.containsValue("��"))
			System.out.println("���� 3������ ���ԵǾ� ����");
		System.out.println("�� ������"+ht.size()+" �Դϴ�.");
		ht.remove("1");
		Enumeration enu = ht.keys();
		while(enu.hasMoreElements()){
			Object key = enu.nextElement();
			Object value = ht.get(key);
			System.out.println("Ű = "+key+"�� "+value);
		}
	}
}
