package Misc;
import java.util.ArrayList;
import java.util.List;
class UserCollection{
	private List<String>users;

	public List<String> getUsers() {
		return users;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}
	
}

public class ObjectgetterSetter {
	public static void main(String[] args) {
		List<String>names=new ArrayList<String>();
		names.add("nani");
		names.add("lucky");
		names.add("dhoni");
		UserCollection obj =new UserCollection();
		obj.setUsers(names);
		for (String name:obj.getUsers()) {
			System.out.println(name);
		}
		
	}

}
