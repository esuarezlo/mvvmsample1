package org.idnp.mvvmsample.viewmodels;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import org.idnp.mvvmsample.model.UnitEntity;
import org.idnp.mvvmsample.model.UnitHelper;

public class UnitViewModel extends BaseObservable {

    private static final String TAG = "UnitViewModel";
    private UnitHelper unitHelper;
    private UnitEntity unit;

    @Bindable
    public String code;
    @Bindable
    public String name;
    @Bindable
    public String credit;

    public UnitViewModel() {
        unitHelper = new UnitHelper();
        unit = unitHelper.firstUnit();
        Log.d(TAG, unit.getName());
    }

    @Bindable
    public UnitEntity getUnit() {
        return unit;
    }

    public void onClickPrevious() {
        unit = unitHelper.previousUnit();
        notifyPropertyChanged(BR.unit);
    }

    public void onClickNext() {
        unit = unitHelper.nextUnit();
        notifyPropertyChanged(BR.unit);
    }

    public void onClickSave() {
        Log.d(TAG, "-----------" + code);
        try {
            unit = new UnitEntity();
            unit.setCode(Integer.parseInt(code));
            unit.setName(name);
            unit.setCredit(Integer.parseInt(credit));
            unitHelper.addUnit(unit);
            notifyPropertyChanged(BR.unit);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
