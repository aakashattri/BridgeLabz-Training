
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		VesselUtil utility=new VesselUtil();
		Scanner sc=new Scanner(System.in);

		int choice=0;

		while(choice!=4){

			System.out.println("Push the number:\n1.Add new Vessel\n2.Check Vessel Speed\n3.high performance Vessels\n4.Exit");
			choice=Integer.parseInt(sc.nextLine());

			switch(choice){

			case 1:
				System.out.println("Enter the number of vessels to be added");
				int vesselCountToBeAdded=Integer.parseInt(sc.nextLine());
				System.out.println("Enter input as: vesselId:vesselName:averageSpeed:vesselType");

				while(vesselCountToBeAdded>0){
					String input=sc.nextLine();
					String[] inp=input.split(":");
					if(inp.length==4){
						Vessel newVessel=new Vessel(inp[0].trim(),inp[1].trim(),Double.parseDouble(inp[2].trim()),inp[3].trim());
						utility.addVesselPerformance(newVessel);
						vesselCountToBeAdded--;
					}
				}
				break;

			case 2:
				System.out.println("Enter the Vessel Id to check speed:");
				String vesselId=sc.nextLine();
				Vessel found=utility.getVesselById(vesselId);
				if(found!=null){
					System.out.println(found.vesselId+" | "+found.vesselName+" | "+found.vesselType+" | "+found.averageSpeed);
				}else{
					System.out.println("vesselId "+vesselId+" not found");
				}
				break;

			case 3:
				System.out.println("High Performance Vessels:");
				utility.getHighPerformanceVessels()
				.forEach(v->System.out.println(v.vesselId+" | "+v.vesselName+" | "+v.vesselType+" | "+v.averageSpeed+" knots"));
				break;

			case 4:
				System.out.println("Exited Successfully.");
				break;

			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
