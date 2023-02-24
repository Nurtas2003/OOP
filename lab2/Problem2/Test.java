package Problem2;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID number: ");
		int id = sc.nextInt();
		System.out.println("FirstName: ");
		String firstName = sc.next();
		System.out.println("phoneNumber: ");
		String phoneNumber = sc.next();
		Contact c1 = new Contact(1, "Nurtas", "8-700-515-10-17");
		Contact c2 = new Contact(2, "Aibergen", "8-700-525-10-17");
		Contact c3 = new Contact(3, "Adema", "8-778-525-10-17");
		Contact c4 = new Contact(4, "Madi", "8-707-525-18-17");
		Contact c5 = new Contact(id, firstName, phoneNumber);
		Contact c6 = new ContactFriends(6, "Ulagat", "8-777-525-18-78", 2003, Gender.MAN);
		HashSet<Contact> hs = new HashSet<Contact>();
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		hs.add(c5);
		hs.add(c6);
		
		System.out.println("Contacts: ");
		for(Contact c:hs) {
			System.out.println(c);
		}
		
		sc.close();
	}

}
