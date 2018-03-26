package day0326;

<<<<<<< HEAD
=======

>>>>>>> 17è®¡ç§‘5ç­ç¬¬ä¸€å¤©ä»£ç 
public class Demo2 {
	/*  ÃæÏò¶ÔÏóµÄÌØÕ÷
	 *    ·â×°£ºjavaµ±ÖĞÒªÇóÒª½«Ò»Ğ©¸öÌåÊôĞÔ·ÅÔÚÒ»¸öÀàÀïÃæ£¬´Ó¶ø´ïµ½°²È«µÄĞ§¹û£¨´úÂëÏ°¹ß£©
	 *    ¼Ì³Ğ£º¼Ì³ĞµÄÒâÒåÔÚÓÚ½«ÆäËûÀàÀïÃæµÄÊôĞÔºÍ·½·¨¼Ì³Ğµ½µ±Ç°ÀàÀïÃæ£¬·½±ãÊ¹ÓÃºÍµ÷È¡(´úÂëÏ°¹ß)
	 *    ¶àÌ¬£º
	 */
		
	//ÓĞmainÍ¨³£¶¼ÊÇÖ´ĞĞÀà
	public static void main(String[] args) {
		//Õı³£µÄ¶ÔÏóÊµÀı»¯
		Person per=new Person();
		Monkey mk=new Monkey();
		
		//¶àÌ¬µÄ¶ÔÏóÊµÀı»¯
		Monkey mk_per=new Person();
		
	    System.out.println(mk_per.love);//×æÏÈÀàÀïÃæµÄÊôĞÔ
	    System.out.println(mk_per.getName());//personÀàÀïÃæµÄÊôĞÔÊÇÓÃ²»ÁËµÄ£¬ËäÈ»·¢ÉúÁËÄÚ´æÖ¸ÏòµÄ×ªÒÆ
		
		per.setName("ÆÕ¾©");//Í¨¹ısetName()·½·¨À´ÉèÖÃnameÖµ
		
		System.out.println(per.getName());//Í¨¹ıgetName()À´»ñÈ¡Öµ
		
		
	}
	
 	

}
