package HotExample;

import java.util.Objects;

public class Department {

	private int did;
	private String dname;

	public Department(int did, String dname) {

		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}

	@Override
	public int hashCode() {

		return Objects.hash(did, dname);
	}

	public boolean equals(Department dept) {
		return this.did == dept.did && this.dname.equals(dept.dname);

	}

}
