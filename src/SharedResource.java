public class SharedResource implements java.io.Serializable, Comparable<SharedResource> {

	private static final long serialVersionUID = -6699986336399821598L;
	private String id;
	private String group;
	private String owner;
	
	public SharedResource(String _owner, String _group, String _id) {
		group = _group;
		owner = _owner;
		id = _id;
	}
	
	public String getID()
	{
		return id;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public String getGroup() {
		return group;
	}
	
	public int compareTo(SharedResource rhs) {
		if (id.compareTo(rhs.getID())==0)return 0;
		else if (id.compareTo(rhs.getID())<0) return -1;
		else return 1;
	}
	
	
}	
