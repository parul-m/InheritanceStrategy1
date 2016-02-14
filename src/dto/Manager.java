package dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "mgr")

public class Manager extends Employee{
    float da, ta;

    public Manager() {
    }

    public Manager(float da, float ta, int id, String name, float salary) {
        super(id, name, salary);
        this.da = da;
        this.ta = ta;
    }

    public float getDa() {
        return da;
    }

    public void setDa(float da) {
        this.da = da;
    }

    public float getTa() {
        return ta;
    }

    public void setTa(float ta) {
        this.ta = ta;
    }
}
