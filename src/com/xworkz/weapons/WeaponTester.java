package com.xworkz.weapons;

import com.xworkz.weapons.brahmos.MissleBrahmosWeapon;
import com.xworkz.weapons.gun.Weapon;
import com.xworkz.weapons.gunweapon.Ak47;
import com.xworkz.weapons.gunweapon.MachineGunWeapon;

public class WeaponTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		MachineGunWeapon gun=new MachineGunWeapon();
		gun.abort();
		gun.damage();
		gun.trigger();
		gun.toString();
		System.out.println(MachineGunWeapon.country);
		
		Ak47 weapon=new Ak47();
		weapon.abort();
		weapon.damage();
		weapon.trigger();
		System.out.println(Ak47.country);
		
		MissleBrahmosWeapon missle=new MissleBrahmosWeapon();
		missle.abort();
		missle.damage();
		missle.dontknow();
		System.out.println(MachineGunWeapon.country);
		
		MissleBrahmosWeapon missle1=missle.clone();
		System.out.println(MissleBrahmosWeapon.country);
		
		Weapon name=new Ak47();
		name.abort();
		name.damage();
		
		System.out.println("************************");
		
		Weapon brahmos=new MachineGunWeapon();
		brahmos.abort();
		brahmos.damage();
		System.out.println(Weapon.country);
		}
}
