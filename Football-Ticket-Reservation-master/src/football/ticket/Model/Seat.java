package football.ticket.Model;

public class Seat {
	private Integer Index;
	private String Stadium;

	public Seat(Integer index, String stadium) {
		Index = index;
		Stadium = stadium;
	}

	public Integer getIndex() {
		return Index;
	}

	public void setIndex(Integer index) {
		Index = index;
	}

	public String getStadium() {
		return Stadium;
	}

	public void setStadium(String stadium) {
		Stadium = stadium;
	}
}
