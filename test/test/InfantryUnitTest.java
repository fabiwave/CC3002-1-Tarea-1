package test;

import CC3002.T1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InfantryUnitTest {

    private ArcherUnit archer;
    private Castle castle;
    private CavalryUnit cavalry;
    private InfantryUnit infantry;
    private InfantryUnit auxInfantry;
    private Monk monk;
    private SiegeUnit siege;
    private Villager villager;

    @Before
    public void setUp() throws Exception {

        archer = new ArcherUnit();
        castle = new Castle();
        cavalry = new CavalryUnit();
        infantry = new InfantryUnit();
        auxInfantry = new InfantryUnit();
        monk = new Monk();
        siege = new SiegeUnit();
        villager = new Villager();
    }

    @Test
    public void attack() {
        infantry.attack(monk);
    }

    @Test
    public void attackedByInfantryUnit() {
        infantry.attackedByInfantryUnit(auxInfantry);
        assertEquals(infantry.getHitPoints(), 36);
    }

    @Test
    public void attackedByArcherUnit() {
        infantry.attackedByArcherUnit(archer);
        assertEquals(infantry.getHitPoints(), 36);
    }

    @Test
    public void attackedByCavalry() {
        infantry.attackedByCavalry(cavalry);
        assertEquals(infantry.getHitPoints(), 37);
    }

    @Test
    public void attackedBySiegeUnit() {
        infantry.attackedBySiegeUnit(siege);
        assertEquals(infantry.getHitPoints(), 25);
    }

    @Test
    public void attackedByVillager() {
        infantry.attackedByVillager(villager);
        assertEquals(infantry.getHitPoints(), 39);
    }

    @Test
    public void attackedByMonk() {
        infantry.attackedByMonk(monk);
        assertEquals(infantry.getHitPoints(), 45);
    }

    @Test
    public void attackedByCastle() {
        infantry.attackedByCastle(castle);
        assertEquals(infantry.getHitPoints(), 16);
    }
}