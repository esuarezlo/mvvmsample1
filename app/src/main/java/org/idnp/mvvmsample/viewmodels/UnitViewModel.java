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
    private UnitEntity unitEntity;
    private UnitEntity unitNewEntity;

    @Bindable
    public String code;
    @Bindable
    public String name;
    @Bindable
    public String credit;

    public UnitViewModel() {
        unitHelper = new UnitHelper();
        unitEntity = unitHelper.firstUnit();
        Log.d(TAG, unitEntity.getName());
    }

    public void setUnitCode(String value) {
        unitNewEntity.setCode(Integer.parseInt(value));
    }

    @Bindable
    public String getUnitCode() {
        if (unitNewEntity != null)
        return String.valueOf(unitNewEntity.getCode());
        else
            return "";
    }

    public void setUnitName(String value) {
        unitNewEntity.setName(value);
    }

    @Bindable
    public String getUnitName() {
        if (unitNewEntity != null)
            return unitNewEntity.getName();
        else
            return "";
    }

    public void setUnitCredit(String value) {
        unitNewEntity.setCredit(Integer.parseInt(value));
    }

    @Bindable
    public String getUnitCredit() {
        if (unitNewEntity != null)
            return String.valueOf(unitNewEntity.getCredit());
        else
            return "";
    }

    public void setUnit(UnitEntity unitEntity) {

        unitHelper.addUnit(unitEntity);
        //unitEntity=unitNewEntity;
        this.unitEntity=unitEntity;
        notifyPropertyChanged(BR.unit);
    }

    @Bindable
    public UnitEntity getUnit() {
        return unitEntity;
    }

    public void onClickPrevious() {
        unitEntity = unitHelper.previousUnit();
        notifyPropertyChanged(BR.unit);
    }

    public void onClickNext() {
        unitEntity = unitHelper.nextUnit();
        notifyPropertyChanged(BR.unit);
    }

    public void onClickSave() {
        Log.d(TAG, "-----------" + code);
        try {
//            unitEntity = new UnitEntity();
//            unitEntity.setCode(Integer.parseInt(code));
//            unitEntity.setName(name);
//            unitEntity.setCredit(Integer.parseInt(credit));
//            setUnit(unitEntity);
            if (unitNewEntity != null)
                setUnit(unitNewEntity);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void onClickNewItem() {
        unitNewEntity = new UnitEntity();
    }


}
