package net.alvin.tutorialmod.item;

import net.alvin.tutorialmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {

    public static final Tier BISCUIT = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BISCUIT_TOOL,
            1400, 6f, 3f, 28, () -> Ingredient.of(ModItems.BISCUIT));

}
