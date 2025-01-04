
public class clsCar extends clsVehicle{

	
	private String m_strHowToDrive;
	private int m_intPrice;
	
	/**
	 * Starters
	 * @param  String strMake, String strModel, int intYear, String strColor, int intWheels, int intMPG
	 */
	public clsCar( String strMake, String strModel, int intYear, String strColor, int intMPG, int intWheels) {
		SetMake(strMake);
        SetModel(strModel);
        SetYear(intYear);
        SetColor(strColor);
        SetMPG(intMPG);
        SetWheels(intWheels);
        SetHowToDrive();
        SetPrice();
	}
	
	public clsCar( String strMake, String strModel, int intYear, String strColor, int intWheels) {
		SetMake(strMake);
        SetModel(strModel);
        SetYear(intYear);
        SetColor(strColor);
        SetWheels(intWheels);
        SetMPG(0);
        SetHowToDrive();
        SetPrice();
	}
	
	public clsCar( String strMake, String strModel, int intYear, String strColor) {
		SetMake(strMake);
        SetModel(strModel);
        SetYear(intYear);
        SetColor(strColor);
        SetMPG(0);
        SetWheels(4);
        SetHowToDrive();
        SetPrice();
	}
	
	public clsCar( String strMake, String strModel, int intYear) {
		SetMake(strMake);
        SetModel(strModel);
        SetYear(intYear);
        SetColor("none");
        SetMPG(0);
        SetWheels(4);
        SetHowToDrive();
        SetPrice();
	}
	
	public clsCar( String strMake, String strModel) {
		SetMake(strMake);
        SetModel(strModel);
        SetYear(0);
        SetColor("none");
        SetMPG(0);
        SetWheels(4);
        SetHowToDrive();
        SetPrice();
	}
	
	public clsCar( String strMake) {
		SetMake(strMake);
        SetModel("none");
        SetYear(0);
        SetColor("none");
        SetMPG(0);
        SetWheels(4);
        SetHowToDrive();
        SetPrice();
	}
	
	public clsCar() {
		SetMake("none");
        SetModel("none");
        SetYear(0);
        SetColor("none");
        SetMPG(0);
        SetWheels(4);
        SetHowToDrive();
        SetPrice();
	}
	
	
	/**
	 * SetHowToDrive
	 */
	public void SetHowToDrive() {
		
		m_strHowToDrive = "Steering Wheel";
		
	}
	
	/**
	 * GetHowToDrive
	 * @return m_strHowToDrive
	 */
	public String GetHowToDrive() {
		return m_strHowToDrive;
	}
	
	/**
	 * SetPrice
	 * 
	 */
	public void SetPrice() {
		m_intPrice = 15;
	}
	
	/**
	 * GetPrice
	 * @return m_intPrice
	 */
	public int GetPrice() {
		return m_intPrice;
	}
	
	/**
	 * Print
	 */
	public void Print() {
		System.out.println("   Make: " + GetMake());
		System.out.println("   Model: " + GetModel());
		System.out.println("   Year: " + GetYear());
		System.out.println("   Color: " + GetColor());
		System.out.println("   MPG: " + GetMPG());
		System.out.println("   Wheels: " + GetWheels());
		System.out.println("   How To Drive: " + GetHowToDrive());
	}
}
