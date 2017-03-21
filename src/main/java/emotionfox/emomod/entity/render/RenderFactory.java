package emotionfox.emomod.entity.render;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderFactory implements IRenderFactory
{
	private Class classRender;
	private RenderFactory.Type type;

	private ModelBase model;
	private float shadowSize;
	private ResourceLocation texture;
	private ResourceLocation textureBaby;

	public RenderFactory(String classNameIn)
	{
		this.type = RenderFactory.Type.BASIC;

		this.nameToClass(classNameIn);
	}

	public RenderFactory(String classNameIn, ModelBase modelIn, float shadowsizeIn, ResourceLocation textureIn)
	{
		this.type = RenderFactory.Type.EXTEND;

		this.model = modelIn;
		this.shadowSize = shadowsizeIn;
		this.texture = textureIn;

		this.nameToClass(classNameIn);
	}

	private void nameToClass(String classNameIn)
	{
		try
		{
			classRender = Class.forName(classNameIn);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public Render createRenderFor(RenderManager manager)
	{
		Class[] param;
		Constructor constructorRender;

		try
		{
			if (this.type == RenderFactory.Type.BASIC)
			{
				param = new Class[]
				{ RenderManager.class };

				constructorRender = classRender.getConstructor(param);
				Object instance = constructorRender.newInstance(manager);

				return (Render) instance;
			}
			else if (this.type == RenderFactory.Type.EXTEND)
			{
				param = new Class[]
				{ RenderManager.class, ModelBase.class, float.class, ResourceLocation.class };

				constructorRender = classRender.getConstructor(param);
				Object instance = constructorRender.newInstance(manager, model, shadowSize, texture);

				return (Render) instance;
			}
		} catch (SecurityException e)
		{
			e.printStackTrace();
		} catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		} catch (InstantiationException e)
		{
			e.printStackTrace();
		} catch (IllegalAccessException e)
		{
			e.printStackTrace();
		} catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		} catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}

		return null;
	}

	private enum Type
	{
		BASIC, EXTEND;
	}
}
