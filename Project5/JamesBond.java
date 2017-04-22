import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JamesBond 
{
	private static final String regex = "((\\d\\s)*|(\\)\\s)*)*\\(\\s((\\d\\s)*|(\\(\\s)*|(\\)\\s)*)*0\\s0\\s7\\s((\\d\\s)|(\\(\\s))*\\)\\s((\\d\\s)|(\\(\\s)|(\\)\\s))*";
	public boolean bondRegex(String input)
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}
}
