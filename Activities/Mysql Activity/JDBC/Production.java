package com.ltts.productionproject.model;

 

public class Production 
{
	private int Productionid;
	private String Productionname;
	private String Address;
	private int Dateofstarted;
    private String Ownername;

	public Production() 
	{

		super();

	}

	public Production(int Productionid,String Productionname,String Address,int Dateofstarted,String Ownername)
	{

		super();
        this.Productionid = Productionid;
        this.Productionname = Productionname;
        this.Address = Address;
        this.Dateofstarted = Dateofstarted;
        this.Ownername = Ownername;

	}
	public int getProductionid() {
		return Productionid;
	}

	public void setProductionid(int Productionid) {
		this.Productionid = Productionid;
	}

	public String getProductionname() {
		return Productionname;
	}

	public void setProductionName(String ProductionName) {
		this.Productionname = Productionname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getDateofstarted() {
		return Dateofstarted;
	}

	public void setDateofstarted(int dateofstarted) {
		Dateofstarted = dateofstarted;
	}

	public String getOwnername() {
		return Ownername;
	}

	public void setOwnername(String ownername) {
		Ownername = ownername;
	}
	
	public String toString() {

		return "productions [Productionid=" +Productionid + ", Productionname=" +Productionname + ", Address=" +Address + ", Dateofstarted;="

				+ Dateofstarted + ",Ownername=" +Ownername + "]";

	}

}