/*must have methods
 * atleast one constructor inputs have to be different
 * mutators
 * selectors
 */
public class Robot {
	private String name;
	private double size;
	private String color;
	private int serialNumber;
	
	public Robot(){
		name = "bill";
		size = 762.51;
		color = "0x42y356";
		serialNumber = 5;

	}
	public Robot(String names){
		name = names;
		size = 762.51;
		color = "0x42y356";
		serialNumber = 5;
		}
	
	public Robot(String names, double sizes, String colors){
		name = names;
		size = sizes;
		color = colors;
		serialNumber = 5;
	}
	//accessor function gets size of robot in double
	public double getSize(){
		size = size*2;
		size = size/2;
		return size;
	}
	
	

}
