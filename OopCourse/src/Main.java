import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		AddCourse addCourse =new AddCourse();
		RegisterToCourse register =new RegisterToCourse();
		Vector<Courses> courses = new Vector();
		
		Instructors instructor = new Instructors("Engin Demirog"," ","engindemirog@engindemirog.com");
		
		Students student1 =new Students("Arman Gokdemir","armangokdemir@arm.com");
		Students student2 =new Students("Mehmet Nemrut","mehmetnemrut@nemrut.com");
		Students student3 =new Students("Ayse Yildirim","ayseyildirim@yildirim.com");
		Students student4 =new Students("Meliha Kiraz","melihakiraz@kiraz.com");
		
		Courses course =new Courses("Yazilim Gelistirici Yetistirme Kampi (JAVA + REACT)","21/04/2021","2 ay surecek ucretsiz ve profesyonel bir programla, sifirdan yazilim gelistirme ögreniyoruz.");
		Courses course2=addCourse.NewCourse("Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)", "01/01/2021", "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz");
		
		register.AddInstructor(course, instructor);
		register.AddInstructor(course2, instructor);
		
		register.RegisterToCourse(course2, student4);
		register.RegisterToCourse(course2, student3);
		register.RegisterToCourse(course, student4);
		register.RegisterToCourse(course, student1);
		register.RegisterToCourse(course, student2);
		courses.add(course2);
		courses.add(course);
		
		for(var i:courses) {
			System.out.println("Kurs adi: "+i.name+" Tarih:  "+i.date+" İcerik :"+i.details+" Egitmen: "+i.instructorVector);
			for(var k : i.instructorVector)
				System.out.println("Egitmen: "+ k.name);
			System.out.println("-Kayitli Ogrenciler-");
			for(var k : i.studentsVector)
				System.out.println(k.name);
				
			
		}
		
		

	}

}
