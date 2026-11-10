package net.mcreator.idlerpg.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.idlerpg.procedures.Swordcustom1PriUdariePoSushchnostiPriedmietomProcedure;
import net.mcreator.idlerpg.procedures.Swordcustom1DopolnitielnaiaInformatsiiaProcedure;
import net.mcreator.idlerpg.init.IdleRpgModAttributes;

import java.util.UUID;
import java.util.List;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class Swordcustom1Item extends Item {
	public Swordcustom1Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 14;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}

	private static final UUID UUID_0 = UUID.fromString("cc13d099-19ea-311f-923d-eb16df809484");
	private static final UUID UUID_1 = UUID.fromString("d06b5d43-f6c2-32fa-84da-8f37aa385a3c");
	private static final UUID UUID_2 = UUID.fromString("1e737a16-9662-3df7-8681-bcdb825ecb3c");

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getAttributeModifiers(equipmentSlot, stack));
			builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(UUID_0, "Item modifier", 6, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(UUID_1, "Item modifier", 1.5, AttributeModifier.Operation.ADDITION));
			builder.put(IdleRpgModAttributes.CRITCHANCE.get(), new AttributeModifier(UUID_2, "Item modifier", 30, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getAttributeModifiers(equipmentSlot, stack);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		String hoverText = Swordcustom1DopolnitielnaiaInformatsiiaProcedure.execute();
		if (hoverText != null) {
			for (String line : hoverText.split("\n")) {
				list.add(Component.literal(line));
			}
		}
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		Swordcustom1PriUdariePoSushchnostiPriedmietomProcedure.execute(entity.level(), entity);
		return retval;
	}
}