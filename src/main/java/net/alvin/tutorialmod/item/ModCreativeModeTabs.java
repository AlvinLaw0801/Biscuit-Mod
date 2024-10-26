package net.alvin.tutorialmod.item;

import net.alvin.tutorialmod.TutorialMod;
import net.alvin.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final Supplier<CreativeModeTab> BISCUIT_ITEMS_TAB = CREATIVE_MODE_TAB.register("biscuit_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BISCUIT.get()))
                    .title(Component.translatable("creativetab.tutorialmodidisenzo.biscuit_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BISCUIT);
                        output.accept(ModItems.BISCUIT_PICKAXE);
                        output.accept(ModItems.BISCUIT_STICK);
                    }).build());

    public static final Supplier<CreativeModeTab> BISCUIT_BLOCKS_TAB = CREATIVE_MODE_TAB.register("biscuit_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.Biscuit_Block.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "biscuit_items_tab"))
                    .title(Component.translatable("creativetab.tutorialmodidisenzo.bi scuit_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.Biscuit_Block);
                        output.accept(ModBlocks.Raw_Biscuit_Block);
                        output.accept(ModBlocks.Raw_Biscuit_Ore);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
