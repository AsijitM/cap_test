package pdf;

import java.util.Vector;

public class LineList implements ListOfLines {
	public Vector<Line> list_of_lines=new Vector<>();
	public LineList(Vector<Line>lines) {
		this.list_of_lines=lines;
	}
	

	@Override
	public Line getLineWithMaxLength() {
		Line longestLine=null;
		double maxLength = Double.MIN_VALUE;
		for(Line line:list_of_lines) {
			double length=line.getLineLength();
			if(length>maxLength) {
				maxLength=length;
				longestLine=line;
			}
		}
		return longestLine;
	}

	@Override
	public Vector<Line> getLinesStartingFromPoint(Point p) {
		Vector<Line> linesStartingFromPoint=new Vector<>();
		for(Line line: list_of_lines) {
			if(line.getStart().getX()==p.getX() && line.getStart().getY()==p.getY()) {
				linesStartingFromPoint.add(line);
			}
		}
		return linesStartingFromPoint;
	}

}
