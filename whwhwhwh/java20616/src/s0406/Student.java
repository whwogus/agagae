package s0406;

public class Student {
	//��� ����/�Ӽ�
	String name; //�̸�
	int number; //�й�
	String phone; //��ȭ��ȣ
	final static String School = "����κ�";
	static int count = 0;
	//������
	Student(){
		System.out.println("������!" + count);
		count++;
	}
	//�޼ҵ�
	
}
