package uiTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import board.BoxType;
import ui.TextureLocation;

class TextureTest {

	@Test
	void testTexureLocation() {
		String location = "./Textures/empty.png";
		assertEquals(location,BoxType.NORMAL.getUrl());
	}

}
