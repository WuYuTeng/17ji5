package one;
//��Ŷ��ӵ���Ϣ��
public class Son extends Wang{
	//�����Ͱ���
	private String name;
	private String hobby;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.kou=hobby;
	}
	
	
	public void info() {
		this.hobby=kou;
		System.out.println("����Ȼ�����ǿ�"+kou+"�����ҵ����ֽУ�"+name+"�Ҳ�����");
	}
	
	
	
	

}
