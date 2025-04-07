package com.keletu.kpack;

import com.github.alexthe666.iceandfire.IceAndFire;
import com.keletu.kpack.item.ItemWizardArmorSpecial;
import com.keletu.kpack.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(
        modid = KPack.MOD_ID,
        name = KPack.MOD_NAME,
        version = KPack.VERSION,
        dependencies = "required-after:iceandfire;required-after:ebwizardry"
)
public class KPack {

    public static final String MOD_ID = "kpack";
    public static final String MOD_NAME = "Keletu's Pack Gears";
    public static final String VERSION = "1.0.0";

    public static CreativeTabs tabKPG = new CreativeTabs("tabKeletuPackGears") {
        @SideOnly(Side.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(CommonProxy.HelmFireBattleMage);
        }
    };


    @SidedProxy(clientSide = "com.keletu.kpack.proxy.ClientProxy", serverSide = "com.keletu.kpack.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {

        @SubscribeEvent
        public static void addBlock(RegistryEvent.Register<Block> event) {
            proxy.registerBlocks(event);
        }

        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event) {
            proxy.registerItems(event);
        }

        @SubscribeEvent
        @SideOnly(Side.CLIENT)
        public static void modelRegistryEvent(ModelRegistryEvent event) {
            proxy.modelRegistryEvent(event);
        }

        @SubscribeEvent
        public static void entities(RegistryEvent.Register<EntityEntry> event) {
        }

        @SubscribeEvent
        public static void onLivingHurt(LivingHurtEvent event) {
            DamageSource source = event.getSource();
            EntityLivingBase victim = event.getEntityLiving();

            if (source == IceAndFire.dragonFire || source == IceAndFire.dragonIce || source == IceAndFire.dragonLightning) {
                float multi = 1;
                if (victim.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof ItemWizardArmorSpecial) {
                    multi -= 0.1;
                }
                if (victim.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof ItemWizardArmorSpecial) {
                    multi -= 0.3;
                }
                if (victim.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof ItemWizardArmorSpecial) {
                    multi -= 0.2;
                }
                if (victim.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ItemWizardArmorSpecial) {
                    multi -= 0.1;
                }
                event.setAmount(event.getAmount() * multi);
            }
        }
    }
}
