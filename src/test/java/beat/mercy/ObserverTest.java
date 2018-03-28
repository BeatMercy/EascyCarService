package beat.mercy;

import java.util.Vector;

public class ObserverTest {

	public static void main(String[] args) {
		ObserverTest instance = new ObserverTest();
		Vector students = new Vector();
		Teacher t = instance.getTeacher();
		for (int i = 0; i < 10; i++) {
			Student st = instance.getStudent(i,t);
			students.add(st);
			t.attach(st);
		}
		
		t.setPhone("之前");
		for (int i = 0; i < 10; i++)
			((Student) students.get(i)).show();
		
		t.setPhone("之后");
		for (int i = 0; i < 10; i++)
			((Student) students.get(i)).show();
	}
	
	public Teacher getTeacher() {
		return new Teacher();
	}
	public Student getStudent(int i,Teacher t) {
		return  new Student("lili" + i, t);
	}

	public interface Subject {
		public void attach(Observer o);

		public void detach(Observer o);

		public void notice();
	}

	// Observer代码：
	public interface Observer {
		public void update();
	}

	// Teacher代码；
	public class Teacher implements Subject {
		private String phone;
		private Vector students;

		public Teacher() {
			phone = "";
			students = new Vector();
		}

		public void attach(Observer o) {
			students.add(o);
		}

		public void detach(Observer o) {
			students.remove(o);
		}

		public void notice() {
			for (int i = 0; i < students.size(); i++)
				((Observer) students.get(i)).update();
		}

		public void setPhone(String phone) {
			this.phone = phone;
			notice(); // --关键
		}

		public String getPhone() {
			return phone;
		}
	}

	// Student代码：
	public class Student implements Observer {
		private String name;
		private String phone;
		private Teacher teacher;

		public Student(String name, Teacher t) {
			this.name = name;
			teacher = t;
		}

		public void show() {
			System.out.println("Name:" + name + "\nTeacher'sphone:" + phone);
		}

		public void update() {
			phone = teacher.getPhone();
		}
	}
}
