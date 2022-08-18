package in10s;

public class StringReplace {
public static void main(String[] args) {
	String s1="asdsfabcsds  asaddabcds jfdkjdjkabc"
			+ " sdskjeu djfj "
			+ "sdjhfhlsabc dfslfhabchddlh abcdhdfw";
	String finala="";
	int count =0;
	for (int i=0; i<s1.length()-2;i++) {
		String output="";
			output=output+s1.charAt(i);
			output=output+s1.charAt(i+1);
			output=output+s1.charAt(i+2);
			//System.out.println(output);
		
	if(output.equals("abc")) {
		finala=s1.replaceAll("abc", "xyz");
		count++;
	}
	}
	System.out.println(count);
	System.out.println(finala);
	
	
 	}


}
