package eBanking;

public class Run_Ebanking {

	public static void main(String[] args) throws Exception 
	{
		
		Helper obj = new Helper();
		obj.Launch_Browser();
		obj.Load_Webpage();
		
		obj.Admin_Login();
		obj.Branches_button();
		obj.New_Branch_Button();
		obj.Branch_Details();
		obj.New_Branch_submit();
		obj.Close_Alert();
		
		obj.Admin_Home();
		obj.Roles_button();
		obj.New_Role_Button();
		obj.New_Role_Insertion();
		obj.New_Role_Submit();
		obj.Close_Alert();
		
		obj.Admin_Home();
		obj.Employee_button();
		obj.New_Employee_Button();
		obj.New_Employee_Creation();
		obj.New_Employee_Submit();
		obj.Close_Alert();
		

		

		

	}

}
