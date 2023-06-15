import java.util.List;
import java.util.ArrayList;


public class Token implements UserToken, java.io.Serializable {


	private static final long serialVersionUID = 3102101517070539670L;
	private String issuer;
	private String subject;
	private ArrayList<String> groupList;
	
	public List<String> getGroups() {
		return groupList;
	}

	public String getIssuer() {
		return issuer;
	}

	public String getSubject() {
		return subject;
	}
	
	public Token(String _issuer, String _subject, ArrayList<String> _groupList)
	{
		issuer = _issuer;
		subject = _subject;
		groupList = new ArrayList<String>();	
		if (_groupList != null) {
		    groupList.addAll(_groupList);
		}
	}
	
	public boolean addGroup(String _group) {
		if (!groupList.contains(_group)) {
			groupList.add(_group);
			return true;
		}
		else return false;
	}

}
