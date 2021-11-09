package org.idnp.mvvmsample.viewmodels;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import org.idnp.mvvmsample.BR;
import org.idnp.mvvmsample.model.UnitEntity;
import org.idnp.mvvmsample.model.UnitHelper;

public class UnitDetailViewModel extends BaseObservable {

    private static final String TAG = "UnitViewModel";
    private int unitCode;
    private UnitEntity unitEntity;
    private UnitHelper unitHelper;

    public UnitDetailViewModel() {
        unitHelper = new UnitHelper();
        unitEntity = new UnitEntity();
        //unit = unitHelper.findUnit(100);
    }

    public void onClickFind() {
        UnitHelper unitHelper = new UnitHelper();

        unitEntity = unitHelper.findUnit(unitEntity.getCode());
        if (unitEntity != null) {
            notifyPropertyChanged(BR.unitName);
            notifyPropertyChanged(BR.unitCode);
            notifyPropertyChanged(BR.unitCredit);
        }
    }

    public void onClickNew() {
        unitEntity = new UnitEntity();
    }

    public void onClickSave() {
        unitHelper.addUnit(unitEntity);
    }

    public void setUnitCode(String value) {
        Log.d(TAG, value);
        unitEntity.setCode(Integer.parseInt(value));
    }

    @Bindable
    public String getUnitCode() {
        return String.valueOf(unitEntity.getCode());
    }

    public void setUnitName(String value) {
        unitEntity.setName(value);
    }

    @Bindable
    public String getUnitName() {
        return unitEntity.getName();
    }

    public void setUnitCredit(String value) {
        unitEntity.setCredit(Integer.parseInt(value));
    }

    @Bindable
    public String getUnitCredit() {
        return String.valueOf(unitEntity.getCredit());
    }
}
