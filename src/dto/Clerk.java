package dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "clr")
public class Clerk extends Employee{
    float hra;

    public Clerk() {
    }

    public Clerk(float hra, int id, String name, float salary) {
        super(id, name, salary);
        this.hra = hra;
    }

    public float getHra() {
        return hra;
    }

    public void setHra(float hra) {
        this.hra = hra;
    }
}
