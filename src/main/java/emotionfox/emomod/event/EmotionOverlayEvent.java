package emotionfox.emomod.event;

import java.text.DecimalFormat;

import emotionfox.emomod.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EmotionOverlayEvent
{
	private float width;
    private int height;
    private int color = 14737632; // White
    
	@SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onRenderOverlay(RenderGameOverlayEvent e)
    {
		// Custom Entity Health Bar
        if(!e.isCancelable() && e.getType() == ElementType.EXPERIENCE)
        {
            Minecraft mc = Minecraft.getMinecraft();
            RayTraceResult objectMouseOver = mc.objectMouseOver;

            if(mc.objectMouseOver != null && mc.objectMouseOver.entityHit != null)
            {
                Entity target = objectMouseOver.entityHit;

                if(target instanceof EntityMob || target instanceof EntitySlime || target instanceof EntityGhast)
                {
                    height = 16; // Height on the screen in pixel
                    color = 9520012; // Purple Color
                }
                else
                {
                    height = 9; // Height on the screen in pixel
                    color = 45597; // Lime Color
                }

                if(target instanceof EntityDragon || target instanceof EntityWither)
                {}
                else if(target instanceof EntityLiving)
                {
                    EntityLiving looked = (EntityLiving)target;
                    DecimalFormat df = new DecimalFormat("0.0");
                    float life = looked.getHealth() / looked.getMaxHealth();
                    width = life * 71;

                    if(!mc.player.capabilities.isCreativeMode)
                    {
                        int posX = e.getResolution().getScaledWidth() / 2 - 36;
                        int posY = e.getResolution().getScaledHeight() - 70;

                        mc.renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID + ":textures/gui/icons.png"));

                        mc.ingameGUI.drawTexturedModalRect(posX, posY, 0, 0, 73, 9);
                        mc.ingameGUI.drawTexturedModalRect(posX + 1, posY + 1, 0, height, (int)width, 7);
                        mc.ingameGUI.drawCenteredString(mc.fontRenderer, "" + looked.getDisplayName().getUnformattedText() + " [" + df.format(looked.getHealth()) + "]", posX + 36, posY - 10, color);
                    }
                }
            }
        }
    }
}
