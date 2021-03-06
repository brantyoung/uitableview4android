package fr.days.android.uitableview.model;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class UITableCellItem extends UITableItem {

	public String subtitle;
    public String badger;

	public int imageInt;
	public Drawable imageDrawable;
	public Bitmap imageBitmap;

	public AccessoryType accessory = AccessoryType.NONE;
	public Drawable accessoryDrawable;

	public UITableCellItem() {
		super(null);
	}

	public UITableCellItem(String title, String subtitle, String badger) {
		super(title);
		this.subtitle = subtitle;
        this.badger = badger;
	}

}
