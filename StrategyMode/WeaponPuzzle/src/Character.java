import WeaponBehavior.WeaponBehavior;

/**
 * 类名:     Character
 * 描述:
 * 隶属于:   WeaponPuzzle
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
abstract public class Character {
    private WeaponBehavior weaponBehavior;

    abstract public void fight();

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public final void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public final void useWeapon() {
        this.weaponBehavior.fight();
    }
}
