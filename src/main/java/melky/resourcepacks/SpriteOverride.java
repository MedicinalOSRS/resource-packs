/*
 * Copyright (c) 2020, melky <https://github.com/melkypie>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package melky.resourcepacks;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.SpriteID;

@Getter
@RequiredArgsConstructor
enum SpriteOverride
{
	TAB_COMBAT(SpriteID.TAB_COMBAT, Folder.TAB),
	TAB_STATS(SpriteID.TAB_STATS, Folder.TAB),
	TAB_QUESTS(SpriteID.TAB_QUESTS, Folder.TAB),
	TAB_QUESTS_PURPLE_KOUREND(SpriteID.TAB_QUESTS_PURPLE_KOUREND, Folder.TAB),
	TAB_QUESTS_RED_MINIGAMES(SpriteID.TAB_QUESTS_RED_MINIGAMES, Folder.TAB),
	TAB_QUESTS_GREEN_ACHIEVEMENT_DIARIES(SpriteID.TAB_QUESTS_GREEN_ACHIEVEMENT_DIARIES, Folder.TAB),
	TAB_INVENTORY(SpriteID.TAB_INVENTORY, Folder.TAB),
	TAB_EQUIPMENT(SpriteID.TAB_EQUIPMENT, Folder.TAB),
	TAB_PRAYER(SpriteID.TAB_PRAYER, Folder.TAB),
	TAB_MAGIC(SpriteID.TAB_MAGIC, Folder.TAB),
	TAB_MAGIC_SPELLBOOK_ANCIENT_MAGICKS(SpriteID.TAB_MAGIC_SPELLBOOK_ANCIENT_MAGICKS, Folder.TAB),
	TAB_MAGIC_SPELLBOOK_LUNAR(SpriteID.TAB_MAGIC_SPELLBOOK_LUNAR, Folder.TAB),
	TAB_MAGIC_SPELLBOOK_ARCEUUS(SpriteID.TAB_MAGIC_SPELLBOOK_ARCEUUS, Folder.TAB),
	TAB_CLAN_CHAT(SpriteID.TAB_CLAN_CHAT, Folder.TAB),
	TAB_FRIENDS(SpriteID.TAB_FRIENDS, Folder.TAB),
	TAB_IGNORES(SpriteID.TAB_IGNORES, Folder.TAB),
	TAB_LOGOUT(SpriteID.TAB_LOGOUT, Folder.TAB),
	TAB_OPTIONS(SpriteID.TAB_OPTIONS, Folder.TAB),
	TAB_EMOTES(SpriteID.TAB_EMOTES, Folder.TAB),
	TAB_MUSIC(SpriteID.TAB_MUSIC, Folder.TAB),

	TAB_STONE_TOP_LEFT_SELECTED(SpriteID.TAB_STONE_TOP_LEFT_SELECTED, Folder.TAB),
	TAB_STONE_TOP_RIGHT_SELECTED(SpriteID.TAB_STONE_TOP_RIGHT_SELECTED, Folder.TAB),
	TAB_STONE_BOTTOM_LEFT_SELECTED(SpriteID.TAB_STONE_BOTTOM_LEFT_SELECTED, Folder.TAB),
	TAB_STONE_BOTTOM_RIGHT_SELECTED(SpriteID.TAB_STONE_BOTTOM_RIGHT_SELECTED, Folder.TAB),
	TAB_STONE_MIDDLE_SELECTED(SpriteID.TAB_STONE_MIDDLE_SELECTED, Folder.TAB),

	BUTTON_FRIENDS(SpriteID.BUTTON_FRIENDS, Folder.BUTTON),
	BUTTON_IGNORES(SpriteID.BUTTON_IGNORES, Folder.BUTTON),

	SKILL_ATTACK(SpriteID.SKILL_ATTACK, Folder.SKILL),
	SKILL_STRENGTH(SpriteID.SKILL_STRENGTH, Folder.SKILL),
	SKILL_DEFENCE(SpriteID.SKILL_DEFENCE, Folder.SKILL),
	SKILL_RANGED(SpriteID.SKILL_RANGED, Folder.SKILL),
	SKILL_PRAYER(SpriteID.SKILL_PRAYER, Folder.SKILL),
	SKILL_MAGIC(SpriteID.SKILL_MAGIC, Folder.SKILL),
	SKILL_HITPOINTS(SpriteID.SKILL_HITPOINTS, Folder.SKILL),
	SKILL_AGILITY(SpriteID.SKILL_AGILITY, Folder.SKILL),
	SKILL_HERBLORE(SpriteID.SKILL_HERBLORE, Folder.SKILL),
	SKILL_THIEVING(SpriteID.SKILL_THIEVING, Folder.SKILL),
	SKILL_CRAFTING(SpriteID.SKILL_CRAFTING, Folder.SKILL),
	SKILL_FLETCHING(SpriteID.SKILL_FLETCHING, Folder.SKILL),
	SKILL_MINING(SpriteID.SKILL_MINING, Folder.SKILL),
	SKILL_SMITHING(SpriteID.SKILL_SMITHING, Folder.SKILL),
	SKILL_FISHING(SpriteID.SKILL_FISHING, Folder.SKILL),
	SKILL_COOKING(SpriteID.SKILL_COOKING, Folder.SKILL),
	SKILL_FIREMAKING(SpriteID.SKILL_FIREMAKING, Folder.SKILL),
	SKILL_WOODCUTTING(SpriteID.SKILL_WOODCUTTING, Folder.SKILL),
	SKILL_RUNECRAFT(SpriteID.SKILL_RUNECRAFT, Folder.SKILL),
	SKILL_SLAYER(SpriteID.SKILL_SLAYER, Folder.SKILL),
	SKILL_FARMING(SpriteID.SKILL_FARMING, Folder.SKILL),
	SKILL_HUNTER(SpriteID.SKILL_HUNTER, Folder.SKILL),
	SKILL_CONSTRUCTION(SpriteID.SKILL_CONSTRUCTION, Folder.SKILL),

	COMPASS(SpriteID.COMPASS_TEXTURE, Folder.OTHER),
	WINDOW_CLOSE_BUTTON_RED_X(SpriteID.WINDOW_CLOSE_BUTTON_RED_X, Folder.OTHER),
	WINDOW_CLOSE_BUTTON_RED_X_HOVERED(SpriteID.WINDOW_CLOSE_BUTTON_RED_X_HOVERED, Folder.OTHER),
	WINDOW_CLOSE_BUTTON_BROWN_X(SpriteID.WINDOW_CLOSE_BUTTON_BROWN_X, Folder.OTHER),
	WINDOW_CLOSE_BUTTON_BROWN_X_HOVERED(SpriteID.WINDOW_CLOSE_BUTTON_BROWN_X_HOVERED, Folder.OTHER),
	MINIMAP_ORB_FRAME(SpriteID.MINIMAP_ORB_FRAME, Folder.OTHER),
	MINIMAP_ORB_FRAME_HOVERED(SpriteID.MINIMAP_ORB_FRAME_HOVERED, Folder.OTHER),
	MINIMAP_ORB_XP(SpriteID.MINIMAP_ORB_XP, Folder.OTHER),
	MINIMAP_ORB_XP_ACTIVATED(SpriteID.MINIMAP_ORB_XP_ACTIVATED, Folder.OTHER),
	MINIMAP_ORB_XP_HOVERED(SpriteID.MINIMAP_ORB_XP_HOVERED, Folder.OTHER),
	MINIMAP_ORB_XP_ACTIVATED_HOVERED(SpriteID.MINIMAP_ORB_XP_ACTIVATED_HOVERED, Folder.OTHER),
	MINIMAP_ORB_WORLD_MAP_FRAME(SpriteID.MINIMAP_ORB_WORLD_MAP_FRAME, Folder.OTHER),
	MINIMAP_ORB_WORLD_MAP_PLANET(SpriteID.MINIMAP_ORB_WORLD_MAP_PLANET, Folder.OTHER),
	MINIMAP_ORB_WORLD_MAP_PLANET_HOVERED(SpriteID.MINIMAP_ORB_WORLD_MAP_PLANET_HOVERED, Folder.OTHER),

	OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_LEFT_UPPER(SpriteID.OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_LEFT_UPPER, Folder.OTHER),
	OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_LEFT_LOWER(SpriteID.OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_LEFT_LOWER, Folder.OTHER),
	OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_RIGHT(SpriteID.OLD_SCHOOl_MODE_SIDE_PANEL_EDGE_RIGHT, Folder.OTHER),

	CHATBOX_BACKGROUND(SpriteID.CHATBOX, Folder.CHATBOX),
	CHATBOX_BUTTONS_BACKGROUND_STONES(SpriteID.CHATBOX_BUTTONS_BACKGROUND_STONES, Folder.CHATBOX),
	CHATBOX_BUTTON(SpriteID.CHATBOX_BUTTON, Folder.CHATBOX),
	CHATBOX_BUTTON_HOVERED(SpriteID.CHATBOX_BUTTON_HOVERED, Folder.CHATBOX),
	CHATBOX_BUTTON_NEW_MESSAGES( SpriteID.CHATBOX_BUTTON_NEW_MESSAGES, Folder.CHATBOX),
	CHATBOX_BUTTON_SELECTED(SpriteID.CHATBOX_BUTTON_SELECTED, Folder.CHATBOX),
	CHATBOX_BUTTON_SELECTED_HOVERED(SpriteID.CHATBOX_BUTTON_SELECTED_HOVERED, Folder.CHATBOX),
	CHATBOX_REPORT_BUTTON(SpriteID.CHATBOX_REPORT_BUTTON, Folder.CHATBOX),
	CHATBOX_REPORT_BUTTON_HOVERED(SpriteID.CHATBOX_REPORT_BUTTON_HOVERED, Folder.CHATBOX),

	SCROLLBAR_ARROW_UP(SpriteID.SCROLLBAR_ARROW_UP, Folder.SCROLLBAR),
	SCROLLBAR_ARROW_DOWN(SpriteID.SCROLLBAR_ARROW_DOWN, Folder.SCROLLBAR),
	SCROLLBAR_THUMB_TOP(SpriteID.SCROLLBAR_THUMB_TOP, Folder.SCROLLBAR),
	SCROLLBAR_THUMB_MIDDLE(SpriteID.SCROLLBAR_THUMB_MIDDLE, Folder.SCROLLBAR),
	SCROLLBAR_THUMB_BOTTOM(SpriteID.SCROLLBAR_THUMB_BOTTOM, Folder.SCROLLBAR),
	SCROLLBAR_THUMB_MIDDLE_DARK(SpriteID.SCROLLBAR_THUMB_MIDDLE_DARK, Folder.SCROLLBAR),

	FIXED_MODE_SIDE_PANEL_BACKGROUND(SpriteID.FIXED_MODE_SIDE_PANEL_BACKGROUND, Folder.FIXED_MODE),
	FIXED_MODE_TABS_ROW_BOTTOM(SpriteID.FIXED_MODE_TABS_ROW_BOTTOM, Folder.FIXED_MODE),
	FIXED_MODE_TABS_TOP_ROW(SpriteID.FIXED_MODE_TABS_TOP_ROW, Folder.FIXED_MODE),
	FIXED_MODE_MINIMAP_LEFT_EDGE(SpriteID.FIXED_MODE_MINIMAP_LEFT_EDGE, Folder.FIXED_MODE),
	FIXED_MODE_MINIMAP_RIGHT_EDGE(SpriteID.FIXED_MODE_MINIMAP_RIGHT_EDGE, Folder.FIXED_MODE),
	FIXED_MODE_WINDOW_FRAME_EDGE_TOP(SpriteID.FIXED_MODE_WINDOW_FRAME_EDGE_TOP, Folder.FIXED_MODE),
	FIXED_MODE_MINIMAP_AND_COMPASS_FRAME(SpriteID.FIXED_MODE_MINIMAP_AND_COMPASS_FRAME, Folder.FIXED_MODE),
	FIXED_MODE_MINIMAP_FRAME_BOTTOM(SpriteID.FIXED_MODE_MINIMAP_FRAME_BOTTOM, Folder.FIXED_MODE),
	FIXED_MODE_TOP_RIGHT_CORNER(SpriteID.FIXED_MODE_TOP_RIGHT_CORNER, Folder.FIXED_MODE),

	RESIZEABLE_MODE_TABS_TOP_ROW(SpriteID.RESIZEABLE_MODE_TABS_TOP_ROW, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_TABS_BOTTOM_ROW(SpriteID.RESIZEABLE_MODE_TABS_BOTTOM_ROW, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_SIDE_PANEL_EDGE_LEFT(SpriteID.RESIZEABLE_MODE_SIDE_PANEL_EDGE_LEFT, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_SIDE_PANEL_EDGE_RIGHT(SpriteID.RESIZEABLE_MODE_SIDE_PANEL_EDGE_RIGHT, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_MINIMAP_AND_COMPASS_FRAME(SpriteID.RESIZEABLE_MODE_MINIMAP_AND_COMPASS_FRAME, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_TAB_STONE_MIDDLE(SpriteID.RESIZEABLE_MODE_TAB_STONE_MIDDLE, Folder.RESIZEABLE_MODE),
	RESIZEABLE_MODE_TAB_STONE_MIDDLE_SELECTED(SpriteID.RESIZEABLE_MODE_TAB_STONE_MIDDLE_SELECTED, Folder.RESIZEABLE_MODE),
	;

	private final int spriteID;
	private final Folder folder;


	enum Folder {
		BUTTON,
		CHATBOX,
		FIXED_MODE,
		RESIZEABLE_MODE,
		SCROLLBAR,
		SKILL,
		TAB,
		OTHER,
	}
}