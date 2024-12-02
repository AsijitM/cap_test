package pdf;

import java.util.Vector;

public interface ListOfLines {
	private Vector<Line> list_of_lines;
	public ListOfLines(Vector<Line>list_of_lines) {
		this.list_of_lines=list_of_lines;
		
	}
	Line getLineWithMaxLength();
	Vector<Line> getLinesStartingFromPoint(Point p);

}

