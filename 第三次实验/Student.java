package peopel;

public class Student {
	int snum;
	String sname;
	String ssex;
	Student(int snum,String sname,String ssex){
		this.snum=snum;
		this.sname=sname;
		this.ssex=ssex;
	}
	public String tostring() {
		return snum+sname+ssex;
	}
	void show() {
		System.out.println("���"+snum+"ѧ������"+sname+"ѧ���Ա�"+ssex);
	}

}
