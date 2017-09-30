package emotionfox.emomod.blocks;

import java.util.List;

import emotionfox.emomod.init.EmotionItem;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FossilOre extends Block
{
	protected String[] customType =
	{ "Skull", "Jowl", "Thighbone", "Rib", "Shinbone", "Scapula", "Collarbone" };
	protected String[] customName1 =
	{ "Diplodo", "Allo", "Stego", "Nago", "Tyranno", "Plateo", "Lesotho", "Procompso", "Tricerato", "Ankylo", "Parasaurolo" };
	protected String[] customName2 =
	{ "cus", "saure", "tops", "saurus", "gnathus", "phus" };

	public FossilOre()
	{
		super(Material.GROUND);
		this.setSoundType(SoundType.GROUND);
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
	{
		String randType = customType[RANDOM.nextInt(customType.length)];
		String randName1 = customName1[RANDOM.nextInt(customName1.length)];
		String randName2 = customName2[RANDOM.nextInt(customName2.length)];

		List<ItemStack> list = new java.util.ArrayList<ItemStack>();

		list.add(new ItemStack(EmotionItem.FOSSIL, 1).setStackDisplayName(randType + " Of " + randName1 + randName2));

		return list;
	}
}
