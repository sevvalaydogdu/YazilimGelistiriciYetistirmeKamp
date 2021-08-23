 import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Course course1 = new Course ("Yaz�l�m Geli�tirici Yeti�tirme Kamp� 1",100,"C# + Angular", "Engin Demiro�");
		
		Course course2 = new Course ("Yaz�l�m Geli�tirici Yeti�tirme Kamp� 2",101,"Java + React", "Engin Demiro�");
		
		Course [] courses = {course1,course2};
		
		
		User user1 = new User("�evval Aydo�du",100,"sevvalaydogdu","12345","abc@gmail.com");
		
		User user2 = new User("Ali Y�lmaz",101,"aliyilmaz","12346","abc@hotmail.com");
		
		User user3 = new User("Zeynep Do�an",102,"zeynepdogan","12347","abc@yahoo.com");
		
		User [] users = {user1,user2,user3};
		
		for(int i=0; i<users.length;i++) {
			
			 
			for (Course course : courses) {
				System.out.println("--------------------------\n");
				System.out.println(course.courseId+") "+ course.courseName);
				System.out.println(course.courseDetails);
				System.out.println(course.teacher);
			}
		
			Scanner input = new Scanner(System.in);
			System.out.println();
			System.out.println("Kaydolmak istedi�iniz kursun numaras�n� giriniz:");
			int selection = input.nextInt();
			
			if(selection == 100) {
				course1.courseMember.add(users[i]);
				System.out.println("\n"+users[i].getName()+", "+ course1.courseName+" kursuna kaydoldu.");
				
			}else if(selection == 101) {
				
				course2.courseMember.add(users[i]);
				System.out.println("\n"+users[i].getName()+", "+ course2.courseName+" kursuna kaydoldu.");
				
			}else {
				System.out.println("\nHatal� bir numara girdiniz!");
			}
			
		
		}
		
		for(int c=0; c<courses.length; c++) {
			System.out.println("\n-----------------------");
			System.out.print(courses[c].courseName);
			courses[c].courseInfo();
		}
		
		
		
	}

	 

}
