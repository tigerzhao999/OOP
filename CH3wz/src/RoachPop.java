
public class RoachPop {
	private int roachCount;
	
	public RoachPop(int amount){
		roachCount = amount;
	}
	public void waitForDouble(){
		roachCount = roachCount * 2;
	}
	public void spray(){
		roachCount = (roachCount*9)/10;
	}
	public int getRoach(){
		return roachCount;
	}
	

}
