package s0518;

public class Add {

	String sum(String s1, String s2) {
		//ex) "abc", "def" ==> "abcdef"
		//ex) "3","5" ==> "35"
		return s1+s2;
	}
	
	int sum(int s1, int s2) {
		//3,5==>8
		return s1+s2;
	}
		
	int sum(int s1, int s2, int s3) {
		//3,4,5==>12
		return s1+s2+s3;
	}
	
}
