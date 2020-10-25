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
		System.out.println("课程编号"+lnum+"课程名称"+lname+"上课地点"+lplace+"上课时间"+ltime);
	}
	
	
}
