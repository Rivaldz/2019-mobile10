package id.ac.polinema.colorchangernormal.models;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class ColorModel extends AndroidViewModel {

    private int color = 0xfff;

    public ColorModel(@NonNull Application application) {
        super(application);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
