/*
 * This file is part of the Ptolemy project at Iowa State University.
 *
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/.
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 * 
 * For more details and the latest version of this code please see
 * http://www.cs.iastate.edu/~ptolemy/
 *
 * Contributor(s):
 */
public class AppEntry {
	public static void main(String args[]) {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,100);
		Point p3 = new Point(100,0);
		Line yAxis = new Line(p1, p2);
		Line xAxis = new Line(p1,p3);
		yAxis.draw();
		xAxis.draw();
		new DisplayUpdate();
		p1.moveBy(50,50);
		yAxis.moveBy(50,50);
	}
}

