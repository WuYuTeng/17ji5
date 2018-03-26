import day0326.Demo1;



public class Test {
	public static void main(String[] args) {
		//类名 别名=new 类名();对象实例化(只有将类实实在在的存在于当前对象当中才可以使用该类的方法)
		Demo1 www_CCTV_COM=new Demo1();
		//new的作用是跟当前本机内存拿一块空间拿来使用
		System.out.println(www_CCTV_COM.way2());//通过对象的名字类调取方法
		System.out.println(www_CCTV_COM.zi_fu_chuang);
		System.out.println(Demo1.jin);//静态变量是可以直接通过类名.变量名的方式调用，其他不行
		Demo1.info();
//		System.out.println(demo.way2());
//		//私有化的方法是不允许被调用的
//		//System.out.println(demo.number());
//	    //System.out.println(demo.falv());
//		
//		
//		demo.can(23, "廖胤文");//带参数的方法被调用的时候，需要将参数补全才不会出错
//		demo.can(12, "黄邦峰");//带参数的方法方便被调用
//		
//		System.out.println(demo.countNum(315, 41, 45));//带有返回类型的方法通常是拿来赋值或者计算参数结果直接输出的
	}
}
