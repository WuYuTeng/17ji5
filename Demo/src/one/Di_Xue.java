package one;

//存放怎么滴血认亲的方法
public class Di_Xue {
	Wang wan=new Wang();
	Son son=new Son();
	
	//参数跟变量可以同名，但是参数永远都不会是变量
	public String D_X(String kou,String hobby){
		son.setHobby("右脚");
		wan.kou="左脚";//wang这个类里面的变量,参数和变量要分的清楚
		return "王哥喜欢抠的是"+kou+"而儿子喜欢抠的是"+hobby;//带有返回类型的方法需要return 一个值出来
	}

}
