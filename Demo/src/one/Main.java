package one;
//ִ����
public class Main {
	public static void main(String[] args) {
		//�Ȱѵ���˫����ʵ��������
		Wang wan=new Wang();
		Son son=new Son();
		System.out.println("�����緢������");
		wan.kou="��";
		wan.money="6666";
		wan.info();
		
		System.out.println("߹ʺ���㣡������������������˵��");
		System.out.println("��ұ��죬����ӷ��ԣ�����");
		son.setName("�ư��");
		son.setHobby("��");
		son.info();
		
		System.out.println("��ϻ���ô�࣬�ٽ�����,�ٽŽ�����£�");
		Di_Xue dx=new Di_Xue();
		System.out.println(dx.D_X("�ҽ�","���"));
		System.out.println("������ư��Ĺ�ϵ�ǣ�����������������������û�й�ϵ");
	}
}
