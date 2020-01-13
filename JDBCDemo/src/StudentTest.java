import java.sql.Date;
import java.util.ArrayList;
public class StudentTest 
{
	public static void main(String[] args)
	{
		/*Student s = new Student(01,"sandhya",20,new Date(1999,9,17));
		StudentDAO sdao = new StudentDAO();
		if(sdao.insertStudent(s))
			System.out.println("Student record Inserted");
		else
			System.out.println("insertion failed");*/
		/*Student s = new Student(01,"kavya",21,new Date(1999,9,17));
		StudentDAO sdao = new StudentDAO();
		if(sdao.modifyStudent(s))
			System.out.println("student modification sucessfully");
		else
			System.out.println("modification  failed");*/
		StudentDAO sdao =new StudentDAO();
		if(sdao.removeStudent(01))
			System.out.println("student Deleted Sucessfully");
		else
			System.out.println("Student with rno 01 doesnot exist");
	}
}