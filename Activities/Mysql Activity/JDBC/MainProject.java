package com.ltts.productionproject.main;
import java.util.List;
import java.util.Scanner;
import com.ltts.productionproject.bo.ProductionBo;
import com.ltts.productionproject.model.Production;
public class MainProject {
	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("1. Insert");
		System.out.println("2. View Productionid");
		System.out.println("3. View Productionname");
		System.out.println("4. Update productions1 ");
		System.out.println("5. Delete productions1");
		ProductionBo pb= new ProductionBo();

		int n=s.nextInt();
		switch(n) {

			case 1:

				System.out.println("INSERT Production INFO");

				System.out.println("Enter the Production ID");

				int pno=s.nextInt();

				System.out.println("Enter the Production Name");

			    String pname=s.next();

				

				System.out.println("Enter the Address");

				String Address=s.next();

				System.out.println("Enter the Date Of started");

				int Dateofstarted=s.nextInt();

				

				System.out.println("Enter the Owner Name");

				String Ownername=s.next();

				//Write the DB logic

				Production p1=new Production(pno,pname,Address,Dateofstarted,Ownername);

				boolean b=pb.insertProductions1(p1);

				if(b==false) {

					System.out.println("Value inserted...");
				}
				break;

			case 2:

				System.out.println("Productions Id are");

			

				List<Production> li=pb.getAllproduction();

				for(Production p2:li) {

					System.out.println(p2);

				}

				break;

			case 3:

				System.out.println("Enter the production name");

				String sk=s.next();

				//DB logic

				break;

			case 4:

				System.out.println("Enter the production Address");

				String pno1=s.next();

				//DB Logic

				break;

			case 5:

				System.out.println("Enter the player number to REmove from the list");

				int pno2=s.nextInt();

				//DB Logic

				break;

			}
		}	 

	}