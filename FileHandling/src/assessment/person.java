package assessment;

public class person {
	private static final long serialVersionUID=1L;
	int id;
	String name;
	public person(int id, String name) {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}
	

}
