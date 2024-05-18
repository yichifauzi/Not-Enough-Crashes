package fudge.notenoughcrashes.mixins;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.crash.CrashReportSection;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = BlockEntity.class, priority = 10000)
public class MixinTileEntity {

    private boolean noNBT = false;

    @SuppressWarnings("UnreachableCode")
    @Inject(method = "populateCrashReport", at = @At("TAIL"))
    private void onPopulateCrashReport(CrashReportSection section, CallbackInfo ci) {
        if (!noNBT) {
            noNBT = true;
            var self = (BlockEntity) (Object) this;
            var world = self.getWorld();
            if (world != null) {
                section.add("Block Entity NBT", () -> self.createNbt(world.getRegistryManager()).toString());
            }
            noNBT = false;
        }
    }
}
