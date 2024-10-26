package net.alvin.tutorialmod.item;

import net.alvin.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MOD_ID);

    public static final DeferredItem<Item> BISCUIT = ITEMS.register("biscuit",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BISCUIT_STICK = ITEMS.register("biscuit_stick",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<PickaxeItem> BISCUIT_PICKAXE = ITEMS.register("biscuit_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BISCUIT, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BISCUIT, 5, 6f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
