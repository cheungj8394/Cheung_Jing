import java.util.*;
public class Toyota2 extends Car
{
	public Toyota2(String l)
	{
		super();
		ArrayList<String> loc = new ArrayList<>(Arrays.asList(l.split(", ")));
		Double x = Double.parseDouble(loc.get(0));
		Double y = Double.parseDouble(loc.get(1));
		super.move(x, y);
	}
}