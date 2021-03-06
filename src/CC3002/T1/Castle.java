package CC3002.T1;

/**
 * Creates a Castle
 *
 * @author Fabiola Rivera
 */

public class Castle extends Building implements Attacker {

    private int attackPoints;

    /**
     * Constructor of the Castle, all methods are defined in the parent class or the Attacker interface
     */

    public Castle() {
        this.hitPoints = 4800;
        this.maxHitPoints = this.hitPoints;
        this.attackPoints = 20;
    }

    @Override
    public void attack(Attackable something) {
        if (this.isAlive()) {
            something.attackedByCastle(this);
        }
    }

    @Override
    public int getAttackPoints() {
        return attackPoints;
    }

    public void attackedByInfantryUnit(InfantryUnit soldier) {
        this.getHit(soldier.getAttackPoints(), (float) 0.3);
    }

    public void attackedByArcherUnit(ArcherUnit bowman) {
        this.getHit(bowman.getAttackPoints(), (float) 0.1);
    }

    public void attackedByCavalry(CavalryUnit horseman) {
        this.getHit(horseman.getAttackPoints(), (float) 0.3);
    }

    public void attackedBySiegeUnit(SiegeUnit bigWeapon) {
        this.getHit(bigWeapon.getAttackPoints(), (float) 2.0);
    }

    public void attackedByVillager(Villager peasant) {
        this.getHeal(peasant.getAttackPoints(), (float) 0.3);
    }

    public void attackedByMonk(Monk priest) {
        ;
    }

    public void attackedByCastle(Castle fort) {
        this.getHit(fort.getAttackPoints(), (float) 0.1);
    }
}
