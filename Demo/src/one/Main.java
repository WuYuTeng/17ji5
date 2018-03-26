package one;
//执行类
public class Main {
	public static void main(String[] args) {
		//先把当事双方都实例化进来
		Wang wan=new Wang();
		Son son=new Son();
		System.out.println("请王哥发言如下");
		wan.kou="脚";
		wan.money="6666";
		wan.info();
		
		System.out.println("吖屎啊你！！你的名声我们早就听说了");
		System.out.println("大家闭嘴，请儿子发言！！！");
		son.setName("黄邦峰");
		son.setHobby("脚");
		son.info();
		
		System.out.println("别废话那么多，抠脚认亲,抠脚结果如下：");
		Di_Xue dx=new Di_Xue();
		System.out.println(dx.D_X("右脚","左脚"));
		System.out.println("王哥跟黄邦峰的关系是！！！！！！！！！！！！没有关系");
	}
}
