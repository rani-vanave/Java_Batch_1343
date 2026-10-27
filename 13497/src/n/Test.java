package n;

public class Test {
	public static void main(String[] args) {
		Country county =new Country();
		State state=county.getState();
		District district=state.getDistrictName();
		City city=district.getCity();
		String village=city.getVillageName();
		System.out.println(village);
		
		
		
	}

}
