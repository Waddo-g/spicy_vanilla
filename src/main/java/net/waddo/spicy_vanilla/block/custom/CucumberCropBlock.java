package net.waddo.spicy_vanilla.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.waddo.spicy_vanilla.item.ModItems;

public class CucumberCropBlock extends CropBlock {
    private static int max_age = 3;
    public static final IntegerProperty AGE = IntegerProperty.create("age",0,max_age);
    public CucumberCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId(){
        return ModItems.CUCUMBER_SEEDS.get();
    }
    @Override
    public IntegerProperty getAgeProperty(){
        return AGE;
    }
    @Override
    public int getMaxAge(){
        return max_age;
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder){
        builder.add(AGE);
    }



}
