package fr.days.android.uitableview.drawable;

import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;

/**
 * This class will ceate a the cell style at runtime. It's necessary to allow multiple background color in cells
 * 
 * @author dvilleneuve
 * 
 */
public class UITableCellDrawable extends StateListDrawable {

	public UITableCellDrawable(float topRadius, float bottomRadius, int[] colorDefault, int[] colorPressed, int borderColor) {
		addState(new int[] { -android.R.attr.state_pressed }, createGradientDrawable(topRadius, bottomRadius, colorDefault, borderColor));
		addState(new int[] { android.R.attr.state_pressed }, createGradientDrawable(topRadius, bottomRadius, colorPressed, borderColor));
	}

	private ShapeDrawable createGradientDrawable(float topRadius, float bottomRadius, int[] color, int borderColor) {
        // instantiate a rectangle shape
        RectShape rect = new RectShape();

        // make the shape a drawable
        ShapeDrawable shapeDrawable = new ShapeDrawable(rect);

        // get paint
        Paint paint = shapeDrawable.getPaint();

// set border color, stroke and stroke width
        paint.setColor(borderColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0);

		return shapeDrawable;
	}

	private float[] getRadii(float top, float bottom) {
		return new float[] { top, top, //
				top, top, //
				bottom, bottom, //
				bottom, bottom //
		};
	}
}
