package one;

//�����ô��Ѫ���׵ķ���
public class Di_Xue {
	Wang wan=new Wang();
	Son son=new Son();
	
	//��������������ͬ�������ǲ�����Զ�������Ǳ���
	public String D_X(String kou,String hobby){
		son.setHobby("�ҽ�");
		wan.kou="���";//wang���������ı���,�����ͱ���Ҫ�ֵ����
		return "����ϲ���ٵ���"+kou+"������ϲ���ٵ���"+hobby;//���з������͵ķ�����Ҫreturn һ��ֵ����
	}

}
