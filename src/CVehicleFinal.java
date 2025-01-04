/**
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */
public class CVehicleFinal {

	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to Seth's Rentals! Please follow the directions below to complete up to 5 orders");
		System.out.println("------------------------------------------------------------------------------------------");
		int intCustomers = 0;
		while (intCustomers <= 0 || intCustomers >= 5) {
			System.out.printf("Enter Number of Customers to create: ");
			intCustomers = ReadIntegerFromUser();
		}
		
		int intCounter = 0;
		clsCustomer[] aclsCustomerArray = new clsCustomer[ intCustomers ];
		
		for (clsCustomer customer  : aclsCustomerArray) {
			System.out.println("");System.out.println("");System.out.println("");
			System.out.println("Enter your information below");
			System.out.println("------------------------------------");
			customer = Make_Customer();
			aclsCustomerArray[intCounter] = customer;
			intCounter += 1;
		}
		
		for (int intCounter1 = 0; intCounter1 < intCustomers; intCounter1 += 1) {
			aclsCustomerArray[intCounter1].Print();
		}
		
	}
	
	
	/**
	 * Make_Customer
	 * Gathers inputs to make an instance of a customer
	 * @return Customer
	 */
	private static clsCustomer Make_Customer() {
		
		String strName = Name_Input();
		String strPhone = Phone_Input();
		String strEmail = Email_Input();
		int intNumOfVehicles = NumOfVehicles_Input();
		int intVehicleTypes[] = new int[ intNumOfVehicles ];
		int intDays = RentalDays_Input();
		if (intNumOfVehicles >= 1) {
			for (int intCounter = 0; intCounter < intNumOfVehicles; intCounter += 1) {
				intVehicleTypes[intCounter] = VehicleType_Input();
				System.out.printf("\n\n\n");
			}
		}
		
		switch (intNumOfVehicles) {
		case 1: clsCustomer Customer = new clsCustomer(strName, strPhone, strEmail, 
				intDays, intNumOfVehicles, intVehicleTypes[0]);
			return Customer;
		case 2: clsCustomer Customer1 = new clsCustomer(strName, strPhone, strEmail, 
				intDays, intNumOfVehicles, intVehicleTypes[0], intVehicleTypes[1]);
			return Customer1;
		case 3: clsCustomer Customer2 = new clsCustomer(strName, strPhone, strEmail, 
				intDays, intNumOfVehicles, intVehicleTypes[0], intVehicleTypes[1], intVehicleTypes[2]);
			return Customer2;
		default: clsCustomer Customer3 = new clsCustomer();
			return Customer3;
		}
		
	}
	
	
	/**
	 * Name_input
	 * Validates string then returns it
	 * @return strName
	 */
	private static String Name_Input() {
		int intResult = 0;
		String strName = "";
		while (intResult == 0) {
			System.out.printf("Enter your name: ");
			strName = ReadStringFromUser();
			intResult = clsCustomer.ValidateName(strName);
		}
		return strName;
	}
	
	/**
	 * Phone_Input
	 * Validates string then returns it
	 * @return strPhone
	 */
	private static String Phone_Input() {
		int intValid = 0;
		String strPhone = "";
		while (intValid == 0) {
			System.out.printf("Enter your phone: ");
			strPhone = ReadStringFromUser();
			intValid = clsCustomer.ValidatePhone(strPhone);
		}
		return strPhone;
	}
	
	/**
	 * Email_Input
	 * Validates string then returns it
	 * @return strEmail
	 */
	private static String Email_Input() {
		int intValid = 0;
		String strEmail = "";
		while (intValid == 0) {
			System.out.printf("Enter your email: ");
			strEmail = ReadStringFromUser();
			intValid = clsCustomer.ValidateEmail(strEmail);
		}
		return strEmail;
	}
	
	/**
	 * RentalDays_Input
	 * Validates int then returns it
	 * @return intDays
	 */
	private static int RentalDays_Input() {
		int intValid = 0;
		int intDays = 0;
		while (intValid == 0) {
			System.out.printf("Enter days for your rental: ");
			intDays = ReadIntegerFromUser();
			intValid = clsCustomer.ValidateDays(intDays);
		}
		return intDays;
	}
	
	/**
	 * NumOfVehicles_Input
	 * Validates int then returns it
	 * @return intVehicles
	 */
	private static int NumOfVehicles_Input( ) {
		int intValid = 0;
		int intVehicles = 0;
		while (intValid == 0) {
			System.out.printf("Enter number of Vehicles: ");
			intVehicles = ReadIntegerFromUser();
			intValid = clsCustomer.ValidateNumOfVehicles(intVehicles);
		}
		return intVehicles;
	}
	
	/**
	 * VehicleType_Input
	 * Validates int then returns it
	 * @return intVehicleType
	 */
	private static int VehicleType_Input() {
		int intVehicleType = 0;
		int intValid = 0;
		while (intValid == 0) {
			System.out.printf("Enter the type of vehicles you'll be renting - 1 for 'Car', 2 for 'Motorbike', 3 for 'Trailer': ");
			intVehicleType = ReadIntegerFromUser();
			intValid = clsCustomer.ValidateVehicleType(intVehicleType);
		}
		return intVehicleType;
	}
	
	/**
	 * ReadStringFromUser
	 * @return strBuffer
	 */
	public static String ReadStringFromUser( )
	{			  
		String strBuffer = "";	
		
		try
		{
			
			// Input stream
			BufferedReader burInput = new BufferedReader( new InputStreamReader( System.in ) ) ;

			// Read a line from the user
			strBuffer = burInput.readLine( );
		
		}
		catch( Exception excError )
		{
			System.out.println( excError.toString( ) );
		}
			
		// Return integer value
		return strBuffer;
	}
	
	/**
	 * ReadIntegerFromUser
	 * @return intValue
	 */
	private static int ReadIntegerFromUser() {
		
		try
		{
			String strBuffer = "";
			int intValue = 0;
			
			BufferedReader burInput = new BufferedReader( new InputStreamReader( System.in));
			
			strBuffer = burInput.readLine();
			
			intValue = Integer.parseInt( strBuffer );
			
			return intValue;
			
		}
		catch ( Exception excError )
		{
			System.out.println( excError.toString());
			
			return -1;
		}
	}

}
