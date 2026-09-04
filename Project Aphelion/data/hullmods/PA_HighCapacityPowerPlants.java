package data.hullmods;

import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.MutableShipStatsAPI;
import com.fs.starfarer.api.combat.ShipAPI.HullSize;
import com.fs.starfarer.api.impl.campaign.ids.Stats;

public class PA_HighCapacityPowerPlants extends BaseHullMod {

	public static final float COST_REDUCTION_HEAVY  = 10;
	public static final float COST_REDUCTION_MEDIUM = 5;
	public static final float COST_REDUCTION_SMALL = 2;
	
	public void applyEffectsBeforeShipCreation(HullSize hullSize, MutableShipStatsAPI stats, String id) {
		stats.getDynamic().getMod(Stats.LARGE_ENERGY_MOD).modifyFlat(id, -COST_REDUCTION_HEAVY);
		stats.getDynamic().getMod(Stats.MEDIUM_ENERGY_MOD).modifyFlat(id, -COST_REDUCTION_MEDIUM);
		stats.getDynamic().getMod(Stats.SMALL_ENERGY_MOD).modifyFlat(id, -COST_REDUCTION_SMALL);
	}
	
	public String getDescriptionParam(int index, HullSize hullSize) {
		if (index == 0) return "" + (int) COST_REDUCTION_HEAVY + "";
		if (index == 1) return "" + (int) COST_REDUCTION_MEDIUM + "";
		if (index == 2) return "" + (int) COST_REDUCTION_SMALL + "";
		return null;
	}

	@Override
	public boolean affectsOPCosts() {
		return true;
	}

}








