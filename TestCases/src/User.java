import java.util.List;


public class User implements People{
	
	static  {
		
		System.out.println("Static hello");
		
	}
	
	private String name;
	private String age;
	private int id;
	private int pid;
	private List<User> users;
	
	User(){
		
		this.name="jack";
		
	}
	
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public void say(String s) {
		// TODO Auto-generated method stub
		
	}
 
	

}
