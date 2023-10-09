


	

import java.util.Scanner;                                                                                     

                                                                                                              

public class Login {                                                                                          

                                                                                                              

	public static void main(String[] args) {                                                                  

		// TODO Auto-generated method stub                                                                    

                                                                                                              

		// first name; last name; domain of company                                                           

		// first name given? If not then: "Error! First and/or last name missing"                             

		// two methods: GenerateEmail and GenerateUsername                                                    

                                                                                                              

		Scanner in = new Scanner(System.in);                                                                  

		String Fname;                                                                                         

		System.out.println("First Name?");                                                                    

		Fname = in.nextLine();                                                                                

                                                                                                              

		String Lname;                                                                                         

		System.out.println("Last Name?");                                                                     

		Lname = in.nextLine();                                                                                

                                                                                                              

		String domain;                                                                                        

		System.out.println("Buisness domain name?");                                                          

		domain = in.nextLine();                                                                               

                                                                                                              

		if (Fname.equals("") || Lname.equals("")) {                                                           

			System.out.println("Error! First and/or last name missing.");                                     

			System.exit(0);                                                                                   

		}                                                                                                     

		GenerateEmail(Fname, Lname, domain);                                                                  

		GenerateUsername(Fname, Lname);                                                                       

                                                                                                              

		                                                                                                      

	}                                                                                                         

	//Uppercase to Lowercase                                                                                  

	public static void GenerateUsername(String Fname, String Lname) {                                         

		Fname = Fname.toLowerCase();                                                                          

		Lname = Lname.toLowerCase();                                                                          

		//printing out where it starts and ends                                                               

		System.out.println(Fname.substring(0, 4) + Lname.substring(Lname.length() - 4, Lname.length()));      

                                                                                                              

	}                                                                                                         

                                                                                                              

	public static void GenerateEmail(String Fname, String Lname, String domain) {                             

		Fname = Fname.toLowerCase();                                                                          

		Lname = Lname.toLowerCase();                                                                          

		domain = domain.toLowerCase();                                                                        

		//printing out the email                                                                              

		System.out.println(Fname + "." + Lname + "@" + domain);                                               

	}                                                                                                         

                                                                                                              

}                                                                                                             

  
