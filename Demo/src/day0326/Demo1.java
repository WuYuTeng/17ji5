package day0326;

public class Demo1 {
    public static String jin="ds65f465sd456f";	
	public static final int num=2;//��̬����
    
	
	int zheng=1;
	
	int zheng2 =jin;
	float dan=1.0f;
	double shuang=1.0;
	char zi='��';
	boolean buer=true;
	long chang=123;
	short duan=666;
	byte zi_jie='s';
	
	public String zi_fu_chuang="�ַ���";
	
	//ѧϰ�������̣�����-->����-->����
	//alt+/
	
	
	//java�ṩ�ķ���������ִ�н����
	public static void main(String[] args) {
		System.out.println(123);
	}
	
	
	//C���������ķ�ʽ
	int count(){
		return 1;
	}
	
	
	
	/*java���������ķ�ʽ
	 *1����������
	 * Ȩ�޷��ʷ� 
	    public:���е� (�����ķ��������Ա�������.java�ļ�����) 
	    private:˽�˵� (�����ķ����ǲ���������.java�ļ����õ�)
	    protected:�ܱ�����(�����ķ�����ͬһ�����ڿ���������ʣ����������򲻿���)
	    default:Ĭ�ϵ� (����ʲô������)  
	  2������������
	               ��ͨ����
	               �������ķ���         
	               ������ֵ�ķ���
	                   
	 */
	
	//��ͨ����
	public void pu(){
		zheng=jin;
		
	}
	
	//�������ķ���
	public void can(int num,String name){//���ǽ���������ı�����֮Ϊ����������ֻ������ǰ����ʹ��
	    //System.out.println("������:"+name+"ѧ���ǣ�"+num);
	    //printf("������:",name);//C���������ַ������γ�һ�仰
		
		String info="������:"+name+"ѧ���ǣ�"+num;
	}
	//int c=num;�������޷�������֮��ı����ҵ���
	
	//���������͵ķ���
	public int countNum(int a,int b,int c){
		int f=a+b*c; 
		
		return f;
	}
	
	
	
	
	
	
	public int way2(){
		
		return 16812580;
	}
	
	private int number(){
		
		return 950520;
	}
	
	protected String falv(){
		return "���Ѿ����˱���������ͣ�������";
	}
	
	public static String info(){
		return "����һֻСС��";
	}
	

}
