/**
 * 
 */

/**
 * 
 */
public class clsCustomer {

	
	private String m_strName;
	private String m_strPhone;
	private String m_strEmail;
	private int m_intRentalDays;
	private int m_intVehicles;
	private String[] m_strVehicleType = new String[3];
	
	
	/**
	 * Starter
	 * @param String strName, String strPhone, String strEmail, int intDays, int intVehicles, int... intVehicleType
	 */
	public clsCustomer (String strName, String strPhone, String strEmail, int intDays, int intVehicles, int... intVehicleType) {
		SetName(strName);
		SetPhone(strPhone);
		SetEmail(strEmail);
		SetDays(intDays);
		SetNumOfVehicles(intVehicles);
		SetVehicleType(intVehicleType);
	}
	
	public clsCustomer() {
		
	}
	
	/**
	 * SetName
	 * @param strName
	 */
	public void SetName (String strName) {
		
		m_strName = strName;
		
	}
	
	
	/**
	 * ValidateName
	 * @param strName
	 * @return 0 for invalid or 1 for valid
	 */
	public static int ValidateName(String strName) {
		int intLength = 0;
		intLength = strName.length();
		if (intLength > 0 && intLength <= 30) {
			return 1;
		} else {
			System.out.println("Name invalid.");
			return 0;
		}
	}
	
	
	/**
	 * GetName
	 * @return m_strname
	 */
	public String GetName() {
		return m_strName;
	}
	
	/**
	 * SetPhone
	 * @param strPhone
	 */
	public void SetPhone(String strPhone) {
		
		m_strPhone = strPhone;
	}
	
	/**
	 * ValidatePhone
	 * @param strPhone
	 * @return 0 for invalid or 1 for valid
	 */
	public static int ValidatePhone(String strPhone) {
		
		int intLength = 0;
		long lngPhone = 0;
		
		intLength = strPhone.length();
		if (intLength == 13) {
			String strAreacode = strPhone.substring(1, 4);
			String strParttwo = strPhone.substring(5, 8);
			String strPartthree = strPhone.substring(9, 13);
			strPhone = strAreacode + strParttwo + strPartthree;
		} 
		
		intLength = strPhone.length();
		
		if (intLength == 10) {
			
			lngPhone = Integer.parseInt(strPhone);
		}
		
		if (lngPhone > 0000000001 && lngPhone < 9999999999l) {
			return 1;
		}
		else {
			System.out.println("Phone invalid.");
			return 0;
		}
	}
	
	/**
	 * GetPhone
	 * @return m_intPhone
	 */
	public String GetPhone() {
		
		return m_strPhone;
		
	}
	
	/**
	 * SetEmail
	 * @param strEmail
	 */
	public void SetEmail(String strEmail) {
		m_strEmail = strEmail;
	}
	
	/**
	 * ValidateEmail
	 * @param strEmail
	 * @return strEmail or ""
	 */
	public static int ValidateEmail(String strEmail) {
		
		int intIndex = 0;
		intIndex = strEmail.indexOf('@');
		if (intIndex > 0) {
			int intLength = 0;
			String strSubstring = "";
			strSubstring = strEmail.substring(intIndex + 1);
			intLength = strSubstring.length();
			if (intLength >= 2 && intLength <= 6) {
				return 1;
			}
			else {
				System.out.println("Email invalid.");
				return 0;
			}
		} else {
			System.out.println("Email invalid.");
			return 0;
		}
		
	}
	
	/**
	 * GetEmail
	 * @return m_strEmail
	 */
	public String GetEmail() {
		return m_strEmail;
	}
	
	/**
	 * SetDays
	 * @param intDays
	 */
	public void SetDays(int intDays) {
		
		m_intRentalDays = intDays;
		
	}
	
	/**
	 * ValidateDays
	 * @param intDays
	 * @return 0 if invalid or 1 if valid
	 */
	public static int ValidateDays(int intDays) {
		if (intDays > 0 && intDays <= 365) {
			return 1;
		} else {
			System.out.println("Days invalid.");
			return 0;
		}
	}
	
	/**
	 * GetDays
	 * @return m_intRentalDays
	 */
	public int GetDays() {
		
		return m_intRentalDays;
		
	}
	
	/**
	 * SetNumOfVehicles
	 * @param intVehicles
	 */
	public void SetNumOfVehicles( int intVehicles) {
		
		m_intVehicles = intVehicles;
		
	}
	
	/**
	 * ValidateNumOfVehicles
	 * @param intVehicles
	 * @return 0 for invalid or 1 for valid
	 */
	public static int ValidateNumOfVehicles(int intVehicles) {
		if (intVehicles > 0 && intVehicles < 4) {
			return 1;
		} else {
			System.out.println("Number Of Vehicles invalid.");
			return 0;
		}
	}
	
	/**
	 * GetNumOfVehicles
	 * @return m_intVehicles
	 */
	public int GetNumOfVehicles() {
		return m_intVehicles;
	}

	
	/**
	 * SetVehicleType
	 * @param intVehicleType
	 */
	public void SetVehicleType( int... intVehicleType) {
		int intCounter = 0;
		for (int i : intVehicleType) {
			switch (i) {
			case 1: m_strVehicleType[intCounter] = "Car";
				break;
			case 2: m_strVehicleType[intCounter] = "Motorbike";
				break;
			case 3: m_strVehicleType[intCounter] = "Trailer";
				break;
			default: m_strVehicleType[intCounter] = "";
				break;
			}
			intCounter += 1;
		}
	}
	
	/**
	 * ValidateVehicleType
	 * @param intVT (VehicleType)
	 * @return 0 for invalid or 1 for valid
	 */
	public static int ValidateVehicleType(int intVT) {
		if (intVT == 1 || intVT == 2 || intVT == 3) {
			return 1;
		} else {
			System.out.println("Vehicle Type invalid.");
			return 0;
		}
	}
	
	/**
	 * GetVehicleType
	 * @return m_strVehicleType[]
	 */
	public String[] GetVehicleType() {
		
		return m_strVehicleType;
	}
	
	/**
	 * Print
	 */
	public void Print() {
		
		clsCar clsMustang = new clsCar("Ford", "Mustang", 1989, "Black", 7);
		clsMotorbike clsHarley = new clsMotorbike("Harley Davidson", "Street Glide", 2017, "Crimson", 13);
		clsTrailer clsTiltdeck = new clsTrailer("Peterbilt", "Tilt Deck Pro", 2020);
		
		float sngRental = 0;
		float sngRentalTotal = 0;
		
		System.out.println("Name: " + GetName());
		System.out.println("Phone: " + GetPhone());
		System.out.println("Email: " + GetEmail());
		System.out.println("Days: " + GetDays());
		System.out.println("Number of Vehicles: " + GetNumOfVehicles());
		System.out.println("");
		String[] astrTypes = new String[ 3 ];
		astrTypes = GetVehicleType();
		for (int intCounter = 0; intCounter < 3; intCounter += 1) {
			if (astrTypes[intCounter] != null) {
				System.out.println("Vehicle #" + (intCounter + 1) + " : " + astrTypes[intCounter]);
				System.out.println("");
				switch (astrTypes[intCounter]) {
				case "Car": clsMustang.Print();
					sngRental = clsMustang.GetPrice() * GetDays();
					break;
				case "Motorbike": clsHarley.Print();
					sngRental = clsHarley.GetPrice() * GetDays();
					break;
				case "Trailer": clsTiltdeck.Print();
					sngRental = clsTiltdeck.GetPrice() * GetDays();
					break;
				}
				System.out.println("");
				System.out.printf("Price for this rental: $%.2f\n", sngRental );
				System.out.println("");System.out.println("");
				sngRentalTotal += sngRental;
				sngRental = 0;
			}
		}
		System.out.println("");
		System.out.printf("Total Price for Rental(s): $%.2f\n", sngRentalTotal);
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("");
	}
	
	
}
