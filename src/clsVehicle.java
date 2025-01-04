
public class clsVehicle {
	
	private String m_strMake;
	private String m_strModel;
	private int m_intYear;
	private String m_strColor;
	private int m_intWheels;
	public int m_intMPG;
	
	
	/**
	 * Starters
	 * @param  String strMake, String strModel, int intYear, String strColor, int intMPG, int intWheels
	 */
	public clsVehicle( String strMake, String strModel, int intYear, String strColor, int intMPG, int intWheels) {
		SetMake(strMake);
        SetModel(strModel);
        SetYear(intYear);
        SetColor(strColor);
        SetWheels(intWheels);
        SetMPG(intMPG);
	}
	
	public clsVehicle( String strMake, String strModel, int intYear, String strColor, int intMPG) {
		SetMake(strMake);
        SetModel(strModel);
        SetYear(intYear);
        SetColor(strColor);
        SetMPG(0);
        SetWheels(0);
	}
	
	public clsVehicle( String strMake, String strModel, int intYear, String strColor) {
		SetMake(strMake);
        SetModel(strModel);
        SetYear(intYear);
        SetColor(strColor);
        SetMPG(0);
        SetWheels(0);
	}
	
	public clsVehicle( String strMake, String strModel, int intYear) {
		SetMake(strMake);
        SetModel(strModel);
        SetYear(intYear);
        SetColor("none");
        SetMPG(0);
        SetWheels(0);
	}
	
	public clsVehicle( String strMake, String strModel) {
		SetMake(strMake);
        SetModel(strModel);
        SetYear(0);
        SetColor("none");
        SetMPG(0);
        SetWheels(0);
	}
	
	public clsVehicle( String strMake) {
		SetMake(strMake);
        SetModel("none");
        SetYear(0);
        SetColor("none");
        SetMPG(0);
        SetWheels(0);
	}
	
	public clsVehicle() {
		SetMake("none");
        SetModel("none");
        SetYear(0);
        SetColor("none");
        SetMPG(0);
        SetWheels(0);
	}
	
	
	
	/**
     * SetMake
     * @param strMake
     */
    public void SetMake(String strMake) {
        if (strMake.length() > 50) {
            m_strMake = strMake.substring(0, 50);
        } else {
            m_strMake = strMake;
        }
    }

    /**
     * GetMake
     * @return m_strMake
     */
    public String GetMake() {
        return m_strMake;
    }

    /**
     * SetModel
     * @param strModel
     */
    public void SetModel(String strModel) {
        if (strModel.length() > 50) {
            m_strModel = strModel.substring(0, 50);
        } else {
            m_strModel = strModel;
        }
    }

    /**
     * GetModel
     * @return m_strModel
     */
    public String GetModel() {
        return m_strModel;
    }

    /**
     * SetYear
     * @param intYear
     */
    public void SetYear(int intYear) {
        if (intYear >= 1886 && intYear <= java.time.Year.now().getValue()) {
            m_intYear = intYear;
        } else {
            m_intYear = 0;
        }
    }

    /**
     * GetYear
     * @return m_intYear
     */
    public int GetYear() {
        return m_intYear;
    }

    /**
     * SetColor
     * @param strColor
     */
    public void SetColor(String strColor) {
        if (strColor.length() > 50) {
            m_strColor = strColor.substring(0, 50);
        } else {
            m_strColor = strColor;
        }
    }

    /**
     * GetColor
     * @return m_strColor
     */
    public String GetColor() {
        return m_strColor;
    }


	/**
	 * SetWheels
	 * @param intWheels
	 */
	public void SetWheels( int intWheels ) {
		if (intWheels >= 2) {
			m_intWheels = intWheels;
		}
		
	}
	
	/**
	 * GetWheels
	 * @return m_intWheels
	 */
	public int GetWheels() {
		return m_intWheels;
	}
	
	/**
	 * SetMPG
	 * @param intMPG
	 */
	public void SetMPG( int intMPG) {
		
		if (intMPG > 99) {
			intMPG = 99;
		} else if (intMPG < 0) {
			intMPG = 0;
		}
		
		m_intMPG = intMPG;
	}
	
	/**
	 * GetMPG
	 * @return m_intMPG
	 */
	public int GetMPG() {
		return m_intMPG;
	}

}
