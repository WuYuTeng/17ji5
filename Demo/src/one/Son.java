package one;
//存放儿子的信息类
public class Son extends Wang{
	//姓名和爱好
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
		System.out.println("我虽然爱好是抠"+kou+"但是我的名字叫："+name+"我不姓王");
	}
	
	
	
	

}
