package api.objecapi.stringapi;

public class StringMethod {

	public static void main(String[] args) {
		// CharAt:문자열의 특전 위치(index)의 문자(char)를 반환
		System.out.println("010624-1230123".charAt(0));
		if("010624-1230123".charAt(7)=='1') {
			
		}
		//getBytes():문자열을 byte 배열로 반환
		String str ="안녕하세요";
		byte[] bytes1 =str.getBytes();//문자열을 byte 배열로 반환
		System.out.println("str저장된 문자열의 길이는?"+ str.length()+"\nstr 저장 문자열의 byte배열의 원소수는"+bytes1.length);
		//byte배열을 문자열로 변환
		String str2 = new String(bytes1);
	    System.out.println(str2);	
	    
	    String subject = "자바 프로그램";
	    System.out.println(subject.indexOf("프로그래밍"));//index3반환
	    System.out.println(subject.indexOf("프로그램"));

	    
	}
	

}
