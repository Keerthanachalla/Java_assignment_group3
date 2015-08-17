import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.io.IOException;
public class ScoreWords {
	public static void main (String[]args) {
		String wordlist = null;
		try {
			wordlist = new String(Files.readAllBytes(Paths.get("p022_names.txt")));
			
		}
		catch (IOException ioe)
		{
			ioe.getStackTrace();
		}
		String words[] = wordlist.split("\",\"");
		int total_length = words.length;
		words[0] = words[0].substring(1);
		words[total_length-1]= words[total_length-1].substring(0,words[total_length-1].length()-1);
		Arrays.sort(words);
		int productScore = 0;
		int base = 'A'-1;
		for (int i=0;i<total_length;i++) {
			int sum =0;
			int len = words[i].length();
			for (int j=0; j<len;j++) {
				sum+= words[i].charAt(j)-base;
			}
			productScore+= sum*(i+1);
		}
		System.out.println(productScore);
	}

}