package day0326;

<<<<<<< HEAD
=======

//安全系数而言 从大到小   类-->方法-->变量

>>>>>>> 17璁＄5鐝涓�澶╀唬鐮�
public class Person extends Monkey {
	/*继承的学习
	  1:extends(在程序代码当中称之为继承)
	  
	  //实体类(通常都是放一些变量)
	/*
	 *  java代码当中习惯性的将这些个体的属性放在一个类里面
	 *   注意点
	 *     1:所有的属性必须进行私有化封装(在属性前面加private)
	 *     2:使用getter和setter来进行属性的获取以及设置 
	 * */
	private String name;
	private String age;
	private char sex;
	
	//getter和setter方法（获取和设置）
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
	//继承
	//String myPower=power;//继承当中如果存在被private修饰的变量或者方法，那就会导致无法再当前类里面引用
	String myLove=love;
	
	
	
}
