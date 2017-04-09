import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;



public class TestCases1 {
	
	@Test
	public void test3(){
		
		
		String foo = "2";
		String bar = foo;
		
		foo = "2"+1;
		
		System.out.println(foo);
		System.out.println(bar);
		
	}
	
	@Test
	public void test2(){
		
		
	 User u = new User();
	 u.setName("jack");
	 u.setName(u.getName()+"_double");
	 
	 System.out.println(u.getName());
	 
		
	} 
	
	@Test
	public void test1(){		
	  
	 System.out.println(fib(30));
		
	} 
	
	 public static int fib(int n) {
	        if (n == 1 || n == 2) {
	            return 1;
	        } else {
	            return fib(n - 1) + fib(n - 2);
	        }
	    }
		
	 @Test
	 public void test4(){
		 
		 for(int i=1 ; i<=9;i++){
			 
			 for(int j=1; j<=9; j++){
				 
				 System.out.print(i + "x" + j +"=" + i*j + "  ");
			 }
			 System.out.println();
			 
		 }
		 
	 }
	 
	 @Test
	 public void test5(){
		 
		/* User u = new User();
		 u.setName("jack");
		 Object o = (Object)u;
		 User u1 = (User)o;*/		 
		 
		 Object o = (Object)new User();
		 User u1 = (User)o;
		 
		 System.out.println(u1.getName());
		 
	 }
	 
	 @Test
	 public void test6(){ 		 
		 
		List<User> list = new ArrayList<User>();
		createTree(list,1,1); 
		
		showList(list,1, 0);
		
		for (int i = 0; i<list.size(); i++){
			
			for(int j = i+1; j<list.size();j++){
				
				User u1 = list.get(i);
				User u2 = list.get(j);
				if (u1.getId()>u2.getId()){
				 
					list.set(j, u1);
					list.set(i, u2);
				}
			}			
		}
		
		
		for (int i = 0; i<list.size();i++){			
			System.out.println(list.get(i).getId());
		}

	 }
	 
	 public  void createTree( List<User>list, int n, int pid){
		 if (n >=6){
			 return;
		 }
		 for(int i = 0; i<n; i++){
			 User u = new User();
			 u.setId(pid*10+i);
			 u.setPid(pid);
			 list.add(u);
			 
			 createTree(list,n+1,u.getId());
		 }		 		 
	 }
	 
	 public void showList(List<User> list, int pid, int level){
		 
		 String pre = "";
		 for(int j = 0; j < level; j++){			 
			 pre +="=";			 
		 }
		 
		 for(int i = 0; i < list.size(); i++){			 
			 User u = list.get(i);			 
			 if( u.getPid()==pid){	
				 System.out.println(pre + u.getId() + "   " +u.getPid());
				 
				 showList(list,u.getId(), level +1);
			 }
		 }		 
	 }
	 
	 
	 @Test
    public void test7(){
     
    	int i = 10;
    	System.out.println(i+=i-=i*=i);
    	
    }
	 
	 @Test
	 public void test8(){
		 
		 shuzhu(1,2,3,4);
	 }
	 
	 public void shuzhu(  int... x ){
		 
	 }
	 
	 
	 
	 
	 @Test
	 public void test10(){
		 
		 char c[] = {'h','i'};
		 String s = "hi";
		if(s.equals(c))
		{
			System.out.println("pass");
		}else{
			System.out.println("fail" + " " + c.toString());
		}
	 }
	 
	 
	 @Test
	 public void test11(){
		 
		 String l = "ok";
		 
		 switch  (l){
		 case "ok": 
		 System.out.println("ok");
		 break; 
		 
		 }
		 
	 }
	 
	 @Test
	 public void test12(){
		 
		 String a = "ok";
		 String b = new String("ok");
		 String c = "ok";
		 
		 if(a.equals(b)){
		 System.out.println("true");}
		 if(a==b){
		System.out.println("true1" + a.hashCode() +" " + b.hashCode());}
		 if("a"=="a"){
		System.out.println("true2");} 
		System.out.println( a.hashCode() +" " + b.hashCode()); 
		
		
		
		//测试String拼写
		String d  = "abcde";
		String e = "";
		
		for(int i = 0; i<d.length();i++){			
			e += d.charAt(i) + "-";
		}
		e=e.substring(0,e.length()-1 );
		System.out.println(e); 
	 }
	 
	 
	 @Test	 
	 public void test13() {
		 
		 SimpleDateFormat smf = new SimpleDateFormat("yyyy年MM月dd日--HH时mm分ss秒SSS");
		 System.out.println(smf.format(new Date()));
		 
		 Timestamp ts = new Timestamp(System.currentTimeMillis());
		 System.out.println(ts);
		 
		 Date d1 = new Date(1970);
		 System.out.println(new Date().getTime() - d1.getTime());
	 }
	 
	 @Test	 
	 public void test14() { 
		 
		 User u1 = new User();
		 User u2 = new User();
		 
		 
	 }
	 
	 
	 @Test	 
	 public void test15() { 
		 
		 Calendar c = Calendar.getInstance();
		 c.add(Calendar.DATE,	-1);
		 Date d= c.getTime();
		 System.out.println(d );
		 
	 }
}
