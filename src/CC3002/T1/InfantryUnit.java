package CC3002.T1;

/**
 * Creates an Infantry unit
 *
 * @author Fabiola Rivera
 */
public class InfantryUnit extends Unit {

    /**
     * Constructor of the InfantryUnit, all methods are defined in the parent class
     */
    public InfantryUnit() {
        this.hitPoints = 40;
        this.maxHitPoints = 2 * this.hitPoints;
        this.attackPoints = 4;
    }

    @Override
    public void attack(Attackable something) {
        something.attackedByInfantryUnit(this);
    }

    @Override
    public int getAttackPoints() {
        return super.getAttackPoints();
    }

    public void attackedByInfantryUnit(InfantryUnit soldier) {
        this.getHit(soldier.getAttackPoints(), (float) 1.0);
    }

    public void attackedByArcherUnit(ArcherUnit bowman) {
        this.getHit(bowman.getAttackPoints(), (float) 1.2);
    }

    public void attackedByCavalry(CavalryUnit horseman) {
        this.getHit(horseman.getAttackPoints(), (float) 1.0);
    }

    public void attackedBySiegeUnit(SiegeUnit bigWeapon) {
        this.getHit(bigWeapon.getAttackPoints(), (float) 1.5);
    }

    public void attackedByVillager(Villager peasant) {
        this.getHit(peasant.getAttackPoints(), (float) 0.8);
    }

    public void attackedByMonk(Monk priest) {
        this.getHeal(priest.getAttackPoints(), (float) 0.5);
    }

    public void attackedByCastle(Castle fort) {
        this.getHit(fort.getAttackPoints(), (float) 1.2);
    }

}