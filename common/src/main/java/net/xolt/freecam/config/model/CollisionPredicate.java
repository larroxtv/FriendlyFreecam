package net.xolt.freecam.config.model;

import net.minecraft.world.level.block.Block;
import net.xolt.freecam.config.model.ModConfigDTO.CollisionConfig;

import static net.xolt.freecam.config.model.CollisionPredicates.*;

@FunctionalInterface
public interface CollisionPredicate {

    boolean shouldIgnore(Block block);

    @SuppressWarnings("unused")
    static CollisionPredicate create(CollisionConfig unusedConfig) {
        // Hardcoded: no block is ignored for collision.
        return COLLIDE;
    }
}
