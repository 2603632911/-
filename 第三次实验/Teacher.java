package peopel;

public class Teacher {
		int tnum;
		String tname;
		String tsex;
		String tlesson;
		Teacher(int tnum,String tname,String tsex,String tlesson){
			this.tnum=tnum;
			this.tname=tname;
			this.tsex=tsex;
			this.tlesson=tlesson;
		}
		public String tostring(){
			return tnum+tname+tsex+tlesson;
		}
		void show(){
			System.out.println("编号"+tnum +" 教师姓名"+tname+ " 教师性别"+tsex+ " 授课"+tlesson);
		}
}
