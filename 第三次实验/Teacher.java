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
			System.out.println("���"+tnum +" ��ʦ����"+tname+ " ��ʦ�Ա�"+tsex+ " �ڿ�"+tlesson);
		}
}
