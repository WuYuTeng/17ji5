package day0326;

public class Demo1 {
    public static String jin="ds65f465sd456f";	
	public static final int num=2;//静态常量
    
	
	int zheng=1;
	
	int zheng2 =jin;
	float dan=1.0f;
	double shuang=1.0;
	char zi='男';
	boolean buer=true;
	long chang=123;
	short duan=666;
	byte zi_jie='s';
	
	public String zi_fu_chuang="字符串";
	
	//学习开发流程：变量-->方法-->函数
	//alt+/
	
	
	//java提供的方法，用来执行结果的
	public static void main(String[] args) {
		System.out.println(123);
	}
	
	
	//C声明方法的方式
	int count(){
		return 1;
	}
	
	
	
	/*java声明方法的方式
	 *1：声明方法
	 * 权限访问符 
	    public:公有的 (声明的方法将可以被其他的.java文件调用) 
	    private:私人的 (声明的方法是不允许被其他.java文件调用的)
	    protected:受保护的(声明的方法在同一个包内可以任意访问，其他包内则不可以)
	    default:默认的 (就是什么都不加)  
	  2：方法的类型
	               普通方法
	               带参数的方法         
	               带返回值的方法
	                   
	 */
	
	//普通方法
	public void pu(){
		zheng=jin;
		
	}
	
	//带参数的方法
	public void can(int num,String name){//我们将括号里面的变量称之为参数，参数只允许被当前方法使用
	    //System.out.println("姓名叫:"+name+"学号是："+num);
	    //printf("姓名叫:",name);//C里面链接字符串，形成一句话
		
		String info="姓名叫:"+name+"学号是："+num;
	}
	//int c=num;参数是无法被方法之外的变量找到的
	
	//带返回类型的方法
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
		return "我已经过了被保护的年纪！！！！";
	}
	
	public static String info(){
		return "我是一只小小鸟";
	}
	

}
