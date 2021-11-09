package org.idnp.mvvmsample.model;

import java.util.ArrayList;
import java.util.List;

public class UnitHelper {
    private List<UnitEntity> units;
    private int current_position = 0;

    public UnitHelper() {
        units = new ArrayList<>();
        UnitEntity unitEntity = new UnitEntity();
        unitEntity.setCode(100);
        unitEntity.setName("Calculo");
        unitEntity.setCredit(4);
        units.add(unitEntity);

        unitEntity = new UnitEntity();
        unitEntity.setCode(101);
        unitEntity.setName("Programacion 1");
        unitEntity.setCredit(5);
        units.add(unitEntity);

        unitEntity = new UnitEntity();
        unitEntity.setCode(102);
        unitEntity.setName("Calidad de software");
        unitEntity.setCredit(4);
        units.add(unitEntity);
    }

    public List<UnitEntity> getUnits() {

        return units;
    }

    public UnitEntity firstUnit() {
        return units.get(0);
    }

    public UnitEntity nextUnit() {
        if (current_position < units.size() - 1)
            return units.get(++current_position);
        else
            return units.get(units.size() - 1);
    }

    public UnitEntity previousUnit() {
        if (current_position > 0)
            return units.get(--current_position);
        else
            return units.get(0);
    }

    public UnitEntity findUnit(int unitCode) {
        UnitEntity unit = null;
        for (int i = 0; i < units.size(); i++) {

            if (unitCode == units.get(i).getCode()) {
                unit = units.get(i);
                break;
            }
        }
        return unit;
    }

    public void addUnit(UnitEntity unit) {
        units.add(unit);
    }
}
