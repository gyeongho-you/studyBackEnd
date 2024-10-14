package c07.poly2;

public class HankookTire extends Tire{

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		setAccumulatedRotation(getAccumulatedRotation()+1);
		if(getAccumulatedRotation()<getMaxRotation()) {
			System.out.println(getLocation()+" HankookTire수명: "+
				(getMaxRotation()-getAccumulatedRotation())+"회");
			return true;
		}else {
			System.out.println(getLocation()+
					"HankookTire 펑크 또는 수명이 다함");
			return false;
		}
	}

}
