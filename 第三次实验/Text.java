package peopel;

public class Text {
public static void main(String[] args) {
	Student yang=new Student(1,"yangtianmin","m");
	Teacher zsb=new Teacher(3,"zhangshibo","m","java") ;
	
	Lesson java=new Lesson(2,"java","classroom","µÚÊ®½Ú¿Î");
	yang.show();
	zsb.show();
	java.show();
	}
}
