import day0326.Demo1;



public class Test {
	public static void main(String[] args) {
		//���� ����=new ����();����ʵ����(ֻ�н���ʵʵ���ڵĴ����ڵ�ǰ�����вſ���ʹ�ø���ķ���)
		Demo1 www_CCTV_COM=new Demo1();
		//new�������Ǹ���ǰ�����ڴ���һ��ռ�����ʹ��
		System.out.println(www_CCTV_COM.way2());//ͨ��������������ȡ����
		System.out.println(www_CCTV_COM.zi_fu_chuang);
		System.out.println(Demo1.jin);//��̬�����ǿ���ֱ��ͨ������.�������ķ�ʽ���ã���������
		Demo1.info();
//		System.out.println(demo.way2());
//		//˽�л��ķ����ǲ��������õ�
//		//System.out.println(demo.number());
//	    //System.out.println(demo.falv());
//		
//		
//		demo.can(23, "��ط��");//�������ķ��������õ�ʱ����Ҫ��������ȫ�Ų������
//		demo.can(12, "�ư��");//�������ķ������㱻����
//		
//		System.out.println(demo.countNum(315, 41, 45));//���з������͵ķ���ͨ����������ֵ���߼���������ֱ�������
	}
}
