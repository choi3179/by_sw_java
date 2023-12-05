package day12.extern.list;

import java.util.Vector;
import java.util.Date;
import java.util.Enumeration;
class  Vector2{
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);
		v.addElement("�ڹ�");
		v.addElement(new Double(10.2));
		v.addElement(date);
		System.out.println("----------3�� ��ü �߰�---------------------");
		System.out.println("size:"+v.size()+" capacity:"+v.capacity());
		for(i = 0; i < 10; i++)
			v.addElement(new Integer(i));
		System.out.println("-----------10�� ��ü �߰�---------------------");
		System.out.println("size:"+v.size()+" capacity:"+v.capacity());
		System.out.println("------------Vercotr ���� ��� ----------------");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
			System.out.print(enu.nextElement()+" ");
		System.out.println();
		System.out.println("---------------��ü ���� ���� Ȯ�� ---------------");
		if(v.contains("�ڹ�"))
			System.out.println("�ڹ� ���ڿ� ���Ե�!");
		else
			System.out.println("�ڹ� ���ڿ� ���� �ȵ�");
		System.out.println("10.2 ��ü ��ġ�� "+v.indexOf(new Double(10.2)));
		System.out.println("�Է½ð� : "+date);v.get(v.indexOf(date));
		//date ��ü ����
		v.removeElementAt(v.lastIndexOf(date));
		for(i = 0; i < v.size(); i+=3)
			v.removeElementAt(i);
		v.setElementAt("�ڹ�",2); //3��° ��ġ�� �ڹ� ���ڿ� �߰�
		enu = v.elements();
		while(enu.hasMoreElements())
			System.out.print(enu.nextElement()+" ");
		System.out.println("\nsize:" + v.size()+" capacity:"+v.capacity());
		v.trimToSize();//��������
		System.out.println("size:"+v.size()+" capacity : "+v.capacity());
		v.setSize(2);	//ũ�⸦ ������ 2�� ����
		enu = v.elements();
		while(enu.hasMoreElements())
			System.out.print(enu.nextElement()+" ");
		v.removeAllElements(); // ��� ���� ����
		System.out.println("size:"+v.size()+" capacity : "+v.capacity());
	}
}
