# -
Java课程项目仓库
#学生模拟选课系统
##实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性及方法：
掌握面向对象的类设计方法：
掌握类的继承用法，通过狗仔方法实力化对象：
学会使用super（），用于实例化子类
掌握使用object根类的toString（）方法，应用在相关对象的信息输出中。
##实验过程
考虑到是学生选课模拟系统，应该有教师，课程以及学生这三个类
每个类下面都有对应的对象，学生应该有学号姓名性别
老师应该有姓名编号和性别
课程应该有名称上课时间和上课地点。
最后分别输出
##核心方法
Lesson(int lnum,String lname,String lplace,String ltime){
		this.lnum=lnum;
		this.lname=lname;
		this.lplace=lplace;
		this.ltime=ltime;
    
    Student(int snum,String sname,String ssex){
		this.snum=snum;
		this.sname=sname;
		this.ssex=ssex;
	}
  
  Teacher(int tnum,String tname,String tsex,String tlesson){
			this.tnum=tnum;
			this.tname=tname;
			this.tsex=tsex;
			this.tlesson=tlesson;
		}
##实验感想
通过本次实验，对类的定义，让我能够更灵活的对不同类型定义不同的方法，有了更深刻的印象，同时也运用了实例化的方法，
