package maths;

import java.util.Random;
import java.util.stream.DoubleStream;

/**
 * 
 * 
 * Generate Random Point in a Circle
 * 
 * @author eaukjam
 *
 */
public class PointInCircle {
	private double radius, x_center, y_center;

	public PointInCircle(double radius, double x_center, double y_center) {
		this.radius = radius;
		this.x_center = x_center;
		this.y_center = y_center;

	}

	public double[] randPoint() {

		return new double[] { Math.random() * (x_center + radius - (x_center - radius)) + (x_center - radius),
				Math.random() * (y_center + radius-( y_center - radius)) + (y_center - radius) };
	}
}
