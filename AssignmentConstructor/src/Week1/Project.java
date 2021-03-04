package Week1;

public class Project {
	//and Project(projectid,projectname,clientname)
	private int pid;
	private String projectName;
	private String clientName;
	
	
	public Project(int pid, String projectName, String clientName) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.clientName = clientName;
	}


	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", clientName=" + clientName + "]";
	}
	
	
	
}
