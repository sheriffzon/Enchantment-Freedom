package com.sheriffzon.enchantmentfreedom.mixin;

import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public abstract class EnchantmentMixin {

    @Inject(
        method = "getMaxLevel",
        at = @At("RETURN"),
        cancellable = true
    )
    private void enchantmentFreedom$setMaxLevelToTen(
            CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(10);
    }
}
