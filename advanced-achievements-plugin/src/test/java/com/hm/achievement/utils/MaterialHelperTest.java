package com.hm.achievement.utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MaterialHelperTest {

	@Mock
	private ItemStack itemStack;

	@Test
	void shouldReturnFalseForOtherMaterial() {
		when(itemStack.getType()).thenReturn(Material.SPLASH_POTION);
		MaterialHelper underTest = new MaterialHelper(null);

		assertFalse(underTest.isAnyPotionButWater(itemStack));
	}
}
