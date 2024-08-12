package fudge.notenoughcrashes.mixins.client;

import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.util.BufferAllocator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//@Mixin(BufferBuilder.class)
//public abstract class MixinBufferBuilder implements StateManager.IResettable {
//
//    @Shadow private boolean building;
//
//    @Shadow public abstract BuiltBuffer end();
//
//    @Inject(method = "<init>", at = @At("RETURN"))
//    public void onInit(BufferAllocator allocator, VertexFormat.DrawMode drawMode, VertexFormat format, CallbackInfo ci) {
////        register();
//    }
//
//    @Override
//    public void resetState() {
//        if (building) {
//            end();
//        }
//    }
//}
