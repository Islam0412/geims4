

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info() {
        return " uron boss " + getDamage() + "\n xp boss " + getHealth() + "\n weapon boss: " + weapon.getWeaponType()
                + "\n weapon: " + weapon.getWeapon();


    }
}

