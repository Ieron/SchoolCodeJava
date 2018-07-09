import java.util.Comparator;

public class StateComparator implements Comparator<Board>{

	@Override
	public int compare(Board b1, Board b2) {
		
		if (b1.getFValue() < b2.getFValue())
			return -1;
		if (b1.getFValue() > b2.getFValue())
			return 1;
		
		return 0;
	}

}
