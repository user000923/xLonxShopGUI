package pl.testhc.utils;

import org.bukkit.ChatColor;

public class ChatUtil {
	public static String Color(String text)
	{
		return ChatColor.translateAlternateColorCodes('&', text);
	}
}
