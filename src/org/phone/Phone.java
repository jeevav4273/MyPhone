package org.phone;

public class Phone {
	public void phoneInfo(int version) {
		System.out.println(version);
		
	}
	public void phoneInfo(String name) {
		System.out.println(name);
	}
		public void phoneInfo(String andriod, String storage) {
			System.out.println(andriod +storage);
		}
		public void phoneInfo(String megapixcel, long phoneimenum) {
			System.out.println(megapixcel+ phoneimenum);

	}
		
		public static void main (String[]args) {
			Phone list = new Phone();
			list.phoneInfo(10);
			list.phoneInfo("samsung");
			list.phoneInfo("kitkat", "64gb");
			list.phoneInfo("64 mp",42152560015l);
			
			
		
		
		}

	
	
}
