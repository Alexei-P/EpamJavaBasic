package by.epam.tr.lesson6;

public class Work {
	private String workName;
	private String workType;
	
	
	public Work(String workName, String workType) {
		this.workName = workName;
		this.workType = workType;
	}
	
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((workName == null) ? 0 : workName.hashCode());
		result = prime * result + ((workType == null) ? 0 : workType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Work other = (Work) obj;
		if (workName == null) {
			if (other.workName != null)
				return false;
		} else if (!workName.equals(other.workName))
			return false;
		if (workType == null) {
			if (other.workType != null)
				return false;
		} else if (!workType.equals(other.workType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Work [workName=" + workName + ", workType=" + workType + "]";
	}
	
	
	

	
	
	
	
	
}
