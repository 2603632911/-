package peopel;

public class Lesson {
	int lnum;
	String lname;
	String lplace;
	String ltime;
	Lesson(int lnum,String lname,String lplace,String ltime){
		this.lnum=lnum;
		this.lname=lname;
		this.lplace=lplace;
		this.ltime=ltime;
	}
	public String tostring() {
		return lnum+lname+lplace+ltime;
	}
	void show() {
		System.out.println("�γ̱��"+lnum+"�γ�����"+lname+"�Ͽεص�"+lplace+"�Ͽ�ʱ��"+ltime);
	}
	
	
}
