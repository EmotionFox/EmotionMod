package emotionfox.emomod.main;

import org.lwjgl.opengl.GL11;

import emotionfox.emomod.util.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiBackPack extends GuiContainer
{
    public static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/gui/backpack.png");
    protected InventoryBackPack inv;
    protected InventoryPlayer playerInv;
    public int rows;

    public GuiBackPack(InventoryPlayer playerInv, InventoryBackPack inv)
    {
        super(new ContainerBackPack(playerInv, inv));

        this.playerInv = playerInv;
        this.inv = inv;
        this.allowUserInput = false;
        this.rows = inv.getSizeInventory() / 9;
        this.ySize = 114 + this.rows * 18;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y)
    {
        String s = this.playerInv.getDisplayName().getUnformattedText();
        this.fontRenderer.drawString(I18n.format(this.inv.getDisplayName().getUnformattedText(), new Object[0]), 8, 6, 7746725);
        this.fontRenderer.drawString(this.playerInv.hasCustomName() ? s : I18n.format(this.playerInv.getDisplayName().getUnformattedText(), new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float prt, int x, int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        
        this.mc.getTextureManager().bindTexture(texture);

        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;

        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.rows * 18 + 17);
        this.drawTexturedModalRect(k, l + this.rows * 18 + 17, 0, 35, this.xSize, 97);
    }
}
