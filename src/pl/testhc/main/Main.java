package pl.testhc.main;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import pl.testhc.utils.*;

public class Main extends JavaPlugin implements Listener{
	
	private static Economy economy = null;
	
	private boolean SetupEconomy() {
		RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
		if (rsp != null)
		{
			economy = rsp.getProvider();
		}
		return (economy != null);
	}
	
	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		
		if(!SetupEconomy())
		{
			getLogger().info("[xLonxShopGUI] Nie wykryto ekonomi vault! Wylaczanie pluginu");
			getServer().getPluginManager().disablePlugin(this);
		}
		
		saveDefaultConfig();
		reloadConfig();
		
		getCommand("sklep").setExecutor(this);
		getCommand("sklepReload").setExecutor(this);
		
		getServer().getPluginManager().registerEvents(this, this);
		
		getLogger().info("[xLonxShopGUI] Plugin zaladowany pomyslnie");
		
		super.onEnable();
	}
	
	public FileConfiguration GetConfig() {
		return this.getConfig();
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// TODO Auto-generated method stub
		
		FileConfiguration config = this.getConfig();
		
		Player p = (Player) sender;
		
		if(command.getName().equalsIgnoreCase("sklep"))
		{
			if(p.hasPermission("xLonxShopGUI.use"))
			{
				Inventory gui = Bukkit.createInventory(p, 27, ChatUtil.Color(config.getString("core_gui_title")));
				ItemStack emerald_block = new ItemStack(Material.EMERALD_BLOCK, 32);
				ItemStack string = new ItemStack(Material.STRING, 32);
				ItemStack coal_block = new ItemStack(Material.COAL_BLOCK, 32);
				ItemStack diamond_block = new ItemStack(Material.DIAMOND_BLOCK, 32);
				ItemStack gold_block = new ItemStack(Material.GOLD_BLOCK, 32);
				ItemStack iron_block = new ItemStack(Material.IRON_BLOCK, 32);
				ItemStack lapis_lazuli = new ItemStack(Material.LAPIS_LAZULI, 32);
				ItemStack redstone = new ItemStack(Material.REDSTONE, 32);
				ItemStack bone = new ItemStack(Material.BONE, 32);
				ItemStack oak_planks = new ItemStack(Material.OAK_PLANKS, 32);
				ItemStack arrow = new ItemStack(Material.ARROW, 32);
				ItemStack slime_ball = new ItemStack(Material.DIAMOND_BLOCK, 32);
				ItemStack TNT = new ItemStack(Material.TNT, 32);
				ItemStack apple = new ItemStack(Material.APPLE, 32);
				ItemStack ender_pearl = new ItemStack(Material.ENDER_PEARL, 32);
				ItemStack bookshelf = new ItemStack(Material.BOOKSHELF, 32);
				ItemStack obsidian = new ItemStack(Material.OBSIDIAN, 32);
				
				ItemMeta meta = emerald_block.getItemMeta();
				ItemMeta meta2 = string.getItemMeta();
				ItemMeta meta3 = coal_block.getItemMeta();
				ItemMeta meta4 = diamond_block.getItemMeta();
				ItemMeta meta5 = gold_block.getItemMeta();
				ItemMeta meta6 = iron_block.getItemMeta();
				ItemMeta meta7 = lapis_lazuli.getItemMeta();
				ItemMeta meta8 = bone.getItemMeta();
				ItemMeta meta9 = oak_planks.getItemMeta();
				ItemMeta meta10 = arrow.getItemMeta();
				ItemMeta meta11 = slime_ball.getItemMeta();
				ItemMeta meta12 = redstone.getItemMeta();
				ItemMeta meta13 = TNT.getItemMeta();
				ItemMeta meta14 = apple.getItemMeta();
				ItemMeta meta15 = ender_pearl.getItemMeta();
				ItemMeta meta16 = bookshelf.getItemMeta();
				ItemMeta meta17 = obsidian.getItemMeta();
				List<String> core_lore = config.getStringList("ITEM_LORE");
				
				meta.setLore(core_lore);
				meta2.setLore(core_lore);
				meta3.setLore(core_lore);
				meta4.setLore(core_lore);
				meta5.setLore(core_lore);
				meta6.setLore(core_lore);
				meta7.setLore(core_lore);
				meta8.setLore(core_lore);
				meta9.setLore(core_lore);
				meta10.setLore(core_lore);
				meta11.setLore(core_lore);
				meta12.setLore(core_lore);
				meta13.setLore(core_lore);
				meta14.setLore(core_lore);
				meta15.setLore(core_lore);
				meta16.setLore(core_lore);
				meta17.setLore(core_lore);
				
				emerald_block.setItemMeta(meta);
				string.setItemMeta(meta2);
				coal_block.setItemMeta(meta3);
				diamond_block.setItemMeta(meta4);
				gold_block.setItemMeta(meta5);
				iron_block.setItemMeta(meta6);
				lapis_lazuli.setItemMeta(meta7);
				bone.setItemMeta(meta8);
				oak_planks.setItemMeta(meta9);
				arrow.setItemMeta(meta10);
				slime_ball.setItemMeta(meta11);
				redstone.setItemMeta(meta12);
				TNT.setItemMeta(meta13);
				apple.setItemMeta(meta14);
				ender_pearl.setItemMeta(meta15);
				bookshelf.setItemMeta(meta16);
				obsidian.setItemMeta(meta17);
				
				gui.setItem(0, emerald_block);
				gui.setItem(1, string);
				gui.setItem(2, coal_block);
				gui.setItem(3, diamond_block);
				gui.setItem(4, gold_block);
				gui.setItem(5, iron_block);
				gui.setItem(6, lapis_lazuli);
				gui.setItem(7, bone);
				gui.setItem(8, oak_planks);
				gui.setItem(9, arrow);
				gui.setItem(10, slime_ball);
				gui.setItem(11, redstone);
				gui.setItem(12, TNT);
				gui.setItem(13, apple);
				gui.setItem(14, ender_pearl);
				gui.setItem(15, bookshelf);
				gui.setItem(16, obsidian);
				
				p.openInventory(gui);
			}
			else
			{
				p.sendMessage(ChatUtil.Color(config.getString("core_not_permission")));
			}
		}
		else if(command.getName().equalsIgnoreCase("sklepReload"))
		{
			reloadConfig();
			p.sendMessage(ChatUtil.Color(config.getString("reload")));
		}
		
		return super.onCommand(sender, command, label, args);
	}
	
	@SuppressWarnings("incomplete-switch")
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		FileConfiguration config = this.getConfig();
		if(e.getClickedInventory() != null && e.getView().getTitle().equals(ChatUtil.Color(config.getString("core_gui_title"))))
		{
			ItemStack clickedItem = e.getCurrentItem();
			Player p = (Player) e.getWhoClicked();
			if(e.isLeftClick())
			{
				if(clickedItem.getType() == Material.EMERALD_BLOCK)
				{
					int Price = config.getInt("shop_emerald_block_cost");
					if(economy.getBalance(p) >= Price)
					{
						economy.withdrawPlayer(p, Price);
						p.getInventory().addItem(new ItemStack(Material.EMERALD_BLOCK, 32));
						String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
						String msg_buy = buy_info.replace("%item%", "EMERALD_BLOCK");
						p.sendMessage(msg_buy);
					}
					else
					{
						String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
						String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
						p.sendMessage(msg_not_price);
					}
				}
				else
				{
					if(clickedItem.getType() == Material.STRING)
					{
						int Price = config.getInt("shop_string_cost");
						if(economy.getBalance(p) >= Price)
						{
							economy.withdrawPlayer(p, Price);
							p.getInventory().addItem(new ItemStack(Material.STRING, 32));
							String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
							String msg_buy = buy_info.replace("%item%", "STRING");
							p.sendMessage(msg_buy);
						}
						else
						{
							String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
							String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
							p.sendMessage(msg_not_price);
						}
					}
					else
					{
						if(clickedItem.getType() == Material.COAL_BLOCK)
						{
							int Price = config.getInt("shop_coal_block_cost");
							if(economy.getBalance(p) >= Price)
							{
								economy.withdrawPlayer(p, Price);
								p.getInventory().addItem(new ItemStack(Material.COAL_BLOCK, 32));
								String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
								String msg_buy = buy_info.replace("%item%", "COAL_BLOCK");
								p.sendMessage(msg_buy);
							}
							else
							{
								String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
								String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
								p.sendMessage(msg_not_price);
							}
						}else
						{
							if(clickedItem.getType() == Material.DIAMOND_BLOCK)
							{
								int Price = config.getInt("shop_diamond_block_cost");
								if(economy.getBalance(p) >= Price)
								{
									economy.withdrawPlayer(p, Price);
									p.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK, 32));
									String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
									String msg_buy = buy_info.replace("%item%", "DIAMOND_BLOCK");
									p.sendMessage(msg_buy);
								}
								else
								{
									String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
									String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
									p.sendMessage(msg_not_price);
								}
							}
							else
							{
								if(clickedItem.getType() == Material.GOLD_BLOCK)
								{
									int Price = config.getInt("shop_gold_block_cost");
									if(economy.getBalance(p) >= Price)
									{
										economy.withdrawPlayer(p, Price);
										p.getInventory().addItem(new ItemStack(Material.GOLD_BLOCK, 32));
										String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
										String msg_buy = buy_info.replace("%item%", "GOLD_BLOCK");
										p.sendMessage(msg_buy);
									}
									else
									{
										String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
										String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
										p.sendMessage(msg_not_price);
									}
								}
								else
								{
									if(clickedItem.getType() == Material.IRON_BLOCK)
									{
										int Price = config.getInt("shop_iron_block_cost");
										if(economy.getBalance(p) >= Price)
										{
											economy.withdrawPlayer(p, Price);
											p.getInventory().addItem(new ItemStack(Material.IRON_BLOCK, 32));
											String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
											String msg_buy = buy_info.replace("%item%", "IRON_BLOCK");
											p.sendMessage(msg_buy);
										}
										else
										{
											String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
											String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
											p.sendMessage(msg_not_price);
										}
									}
									else
									{
										if(clickedItem.getType() == Material.LAPIS_LAZULI)
										{
											int Price = config.getInt("shop_lapis_lazuli_cost");
											if(economy.getBalance(p) >= Price)
											{
												economy.withdrawPlayer(p, Price);
												p.getInventory().addItem(new ItemStack(Material.LAPIS_LAZULI, 32));
												String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
												String msg_buy = buy_info.replace("%item%", "LAPIS_LAZULI");
												p.sendMessage(msg_buy);
											}
											else
											{
												String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
												String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
												p.sendMessage(msg_not_price);
											}
										}
										else
										{
											if(clickedItem.getType() == Material.REDSTONE)
											{
												int Price = config.getInt("shop_redstone_cost");
												if(economy.getBalance(p) >= Price)
												{
													economy.withdrawPlayer(p, Price);
													p.getInventory().addItem(new ItemStack(Material.REDSTONE, 32));
													String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
													String msg_buy = buy_info.replace("%item%", "REDSTONE");
													p.sendMessage(msg_buy);
												}
												else
												{
													String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
													String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
													p.sendMessage(msg_not_price);
												}
											}
											else
											{
												if(clickedItem.getType() == Material.BONE)
												{
													int Price = config.getInt("shop_bone_cost");
													if(economy.getBalance(p) >= Price)
													{
														economy.withdrawPlayer(p, Price);
														p.getInventory().addItem(new ItemStack(Material.BONE, 32));
														String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
														String msg_buy = buy_info.replace("%item%", "BONE");
														p.sendMessage(msg_buy);
													}
													else
													{
														String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
														String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
														p.sendMessage(msg_not_price);
													}
												}
												else
												{
													if(clickedItem.getType() == Material.OAK_PLANKS)
													{
														int Price = config.getInt("shop_oak_planks_cost");
														if(economy.getBalance(p) >= Price)
														{
															economy.withdrawPlayer(p, Price);
															p.getInventory().addItem(new ItemStack(Material.OAK_PLANKS, 32));
															String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
															String msg_buy = buy_info.replace("%item%", "OAK_PLANKS");
															p.sendMessage(msg_buy);
														}
														else
														{
															String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
															String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
															p.sendMessage(msg_not_price);
														}
													}
													else
													{
														if(clickedItem.getType() == Material.ARROW)
														{
															int Price = config.getInt("shop_arrow_cost");
															if(economy.getBalance(p) >= Price)
															{
																economy.withdrawPlayer(p, Price);
																p.getInventory().addItem(new ItemStack(Material.ARROW, 32));
																String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
																String msg_buy = buy_info.replace("%item%", "ARROW");
																p.sendMessage(msg_buy);
															}
															else
															{
																String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
																String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
																p.sendMessage(msg_not_price);
															}
														}
														else
														{
															if(clickedItem.getType() == Material.SLIME_BALL)
															{
																int Price = config.getInt("shop_slime_ball_cost");
																if(economy.getBalance(p) >= Price)
																{
																	economy.withdrawPlayer(p, Price);
																	p.getInventory().addItem(new ItemStack(Material.SLIME_BALL, 32));
																	String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
																	String msg_buy = buy_info.replace("%item%", "SLIME_BALL");
																	p.sendMessage(msg_buy);
																}
																else
																{
																	String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
																	String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
																	p.sendMessage(msg_not_price);
																}
															}
															else
															{
																if(clickedItem.getType() == Material.TNT)
																{
																	int Price = config.getInt("shop_tnt_cost");
																	if(economy.getBalance(p) >= Price)
																	{
																		economy.withdrawPlayer(p, Price);
																		p.getInventory().addItem(new ItemStack(Material.TNT, 32));
																		String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
																		String msg_buy = buy_info.replace("%item%", "TNT");
																		p.sendMessage(msg_buy);
																	}
																	else
																	{
																		String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
																		String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
																		p.sendMessage(msg_not_price);
																	}
																}
																else
																{
																	if(clickedItem.getType() == Material.APPLE)
																	{
																		int Price = config.getInt("shop_apple_cost");
																		if(economy.getBalance(p) >= Price)
																		{
																			economy.withdrawPlayer(p, Price);
																			p.getInventory().addItem(new ItemStack(Material.APPLE, 32));
																			String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
																			String msg_buy = buy_info.replace("%item%", "APPLE");
																			p.sendMessage(msg_buy);
																		}
																		else
																		{
																			String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
																			String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
																			p.sendMessage(msg_not_price);
																		}
																	}
																	else
																	{
																		if(clickedItem.getType() == Material.ENDER_PEARL)
																		{
																			int Price = config.getInt("shop_ender_pearl_cost");
																			if(economy.getBalance(p) >= Price)
																			{
																				economy.withdrawPlayer(p, Price);
																				p.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 32));
																				String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
																				String msg_buy = buy_info.replace("%item%", "ENDER_PEARL");
																				p.sendMessage(msg_buy);
																			}
																			else
																			{
																				String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
																				String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
																				p.sendMessage(msg_not_price);
																			}
																		}
																		else
																		{
																			if(clickedItem.getType() == Material.BOOKSHELF)
																			{
																				int Price = config.getInt("shop_bookshelf_cost");
																				if(economy.getBalance(p) >= Price)
																				{
																					economy.withdrawPlayer(p, Price);
																					p.getInventory().addItem(new ItemStack(Material.BOOKSHELF, 32));
																					String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
																					String msg_buy = buy_info.replace("%item%", "BOOKSHELF");
																					p.sendMessage(msg_buy);
																				}
																				else
																				{
																					String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
																					String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
																					p.sendMessage(msg_not_price);
																				}
																			}
																			else
																			{
																				if(clickedItem.getType() == Material.OBSIDIAN)
																				{
																					int Price = config.getInt("shop_obsidian_cost");
																					if(economy.getBalance(p) >= Price)
																					{
																						economy.withdrawPlayer(p, Price);
																						p.getInventory().addItem(new ItemStack(Material.OBSIDIAN, 32));
																						String buy_info = ChatUtil.Color(config.getString("core_player_buy"));
																						String msg_buy = buy_info.replace("%item%", "OBSIDIAN");
																						p.sendMessage(msg_buy);
																					}
																					else
																					{
																						String not_price = ChatUtil.Color(config.getString("core_player_not_price"));
																						String msg_not_price = not_price.replace("%need%", Integer.toString(Price));
																						p.sendMessage(msg_not_price);
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				e.setCancelled(true);
			}else
			{
				if(e.isRightClick())
				{
					switch (clickedItem.getType())
					{
						case EMERALD_BLOCK:
							int Price = config.getInt("shop_emerald_block_cost");
							ItemStack del_emeblock = new ItemStack(Material.EMERALD_BLOCK, 32);
							
							int emeraldInInventory = countItemsInInventory(p, del_emeblock);
							
							if (emeraldInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.EMERALD_BLOCK, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, Price);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "EMERALD_BLOCK");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "EMERALD_BLOCK");
								p.sendMessage(msg_not_have);
							}
							break;
						case STRING:
							int StringPrice = config.getInt("shop_string_cost");
							ItemStack del_string = new ItemStack(Material.EMERALD_BLOCK, 32);
							
							int StringInInventory = countItemsInInventory(p, del_string);
							
							if (StringInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.STRING, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, StringPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "STRING");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "STRING");
								p.sendMessage(msg_not_have);
							}
							break;
						case COAL_BLOCK:
							int CoalPrice = config.getInt("shop_coal_block_cost");
							ItemStack del_Coal = new ItemStack(Material.COAL_BLOCK, 32);
							
							int CoalInInventory = countItemsInInventory(p, del_Coal);
							
							if (CoalInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.COAL_BLOCK, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, CoalPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "STRING");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "COAL_BLOCK");
								p.sendMessage(msg_not_have);
							}
							break;
						case DIAMOND_BLOCK:
							int DiamondPrice = config.getInt("shop_diamond_block_cost");
							ItemStack del_Diamond = new ItemStack(Material.DIAMOND_BLOCK, 32);
							
							int DiamondInInventory = countItemsInInventory(p, del_Diamond);
							
							if (DiamondInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.DIAMOND_BLOCK, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, DiamondPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "DIAMOND_BLOCK");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "DIAMOND_BLOCK");
								p.sendMessage(msg_not_have);
							}
							break;
						case GOLD_BLOCK:
							int GoldPrice = config.getInt("shop_gold_block_cost");
							ItemStack del_Gold = new ItemStack(Material.GOLD_BLOCK, 32);
							
							int GoldInInventory = countItemsInInventory(p, del_Gold);
							
							if (GoldInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.GOLD_BLOCK, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, GoldPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "GOLD_BLOCK");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "GOLD_BLOCK");
								p.sendMessage(msg_not_have);
							}
							break;
						case IRON_BLOCK:
							int IronPrice = config.getInt("shop_iron_block_cost");
							ItemStack del_Iron = new ItemStack(Material.IRON_BLOCK, 32);
							
							int IronInInventory = countItemsInInventory(p, del_Iron);
							
							if (IronInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.IRON_BLOCK, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, IronPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "IRON_BLOCK");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "IRON_BLOCK");
								p.sendMessage(msg_not_have);
							}
							break;
						case LAPIS_LAZULI:
							int LapisPrice = config.getInt("shop_lapis_lazuli_cost");
							ItemStack del_Lapis = new ItemStack(Material.LAPIS_LAZULI, 32);
							
							int LapisInInventory = countItemsInInventory(p, del_Lapis);
							
							if (LapisInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.LAPIS_LAZULI, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, LapisPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "LAPIS_LAZULI");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "LAPIS_LAUZULI");
								p.sendMessage(msg_not_have);
							}
							break;
						case REDSTONE:
							int RedstonePrice = config.getInt("shop_redstone_cost");
							ItemStack del_Redstone = new ItemStack(Material.REDSTONE, 32);
							
							int RedstoneInInventory = countItemsInInventory(p, del_Redstone);
							
							if (RedstoneInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.REDSTONE, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, RedstonePrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "REDSTONE");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "REDSTONE");
								p.sendMessage(msg_not_have);
							}
							break;
						case BONE:
							int BonePrice = config.getInt("shop_bone_cost");
							ItemStack del_Bone = new ItemStack(Material.BONE, 32);
							
							int BoneInInventory = countItemsInInventory(p, del_Bone);
							
							if (BoneInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.BONE, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, BonePrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "BONE");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "BONE");
								p.sendMessage(msg_not_have);
							}
							break;
						case OAK_PLANKS:
							int PlankPrice = config.getInt("shop_oak_planks_cost");
							ItemStack del_OakPlanks = new ItemStack(Material.OAK_PLANKS, 32);
							
							int OakPlanksInInventory = countItemsInInventory(p, del_OakPlanks);
							
							if (OakPlanksInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.OAK_PLANKS, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, PlankPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "OAK_PLANKS");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "OAK_PLANKS");
								p.sendMessage(msg_not_have);
							}
							break;
						case ARROW:
							int ArrowPrice = config.getInt("shop_arrow_cost");
							ItemStack del_Arrow = new ItemStack(Material.ARROW, 32);
							
							int ArrowInInventory = countItemsInInventory(p, del_Arrow);
							
							if (ArrowInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.ARROW, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, ArrowPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "ARROW");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "ARROW");
								p.sendMessage(msg_not_have);
							}
							break;
						case SLIME_BALL:
							int SlimePrice = config.getInt("shop_slime_ball_cost");
							ItemStack del_SlimeBall = new ItemStack(Material.SLIME_BALL, 32);
							
							int SlimeBallInInventory = countItemsInInventory(p, del_SlimeBall);
							
							if (SlimeBallInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.SLIME_BALL, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, SlimePrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "SLIME_BALL");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "SLIME_BALL");
								p.sendMessage(msg_not_have);
							}
							break;
						case TNT:
							int TNTPrice = config.getInt("shop_tnt_cost");
							ItemStack del_TNT = new ItemStack(Material.TNT, 32);
							
							int TNTInInventory = countItemsInInventory(p, del_TNT);
							
							if (TNTInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.TNT, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, TNTPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "TNT");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "TNT");
								p.sendMessage(msg_not_have);
							}
							break;
						case APPLE:
							int ApplePrice = config.getInt("shop_apple_cost");
							ItemStack del_Apple = new ItemStack(Material.APPLE, 32);
							
							int AppleInInventory = countItemsInInventory(p, del_Apple);
							
							if (AppleInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.APPLE, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, ApplePrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "APPLE");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "APPLE");
								p.sendMessage(msg_not_have);
							}
							break;
						case ENDER_PEARL:
							int EnderPearlPrice = config.getInt("shop_ender_pearl_cost");
							ItemStack del_EnderPearl = new ItemStack(Material.ENDER_PEARL, 32);
							
							int EnderpearlInInventory = countItemsInInventory(p, del_EnderPearl);
							
							if (EnderpearlInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.ENDER_PEARL, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, EnderPearlPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "ENDER_PEARL");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "ENDER_PEARL");
								p.sendMessage(msg_not_have);
							}
							break;
						case BOOKSHELF:
							int BookShelfPrice = config.getInt("shop_bookshelf_cost");
							ItemStack del_BookShelf = new ItemStack(Material.BOOKSHELF, 32);
							
							int BookShelfInInventory = countItemsInInventory(p, del_BookShelf);
							
							if (BookShelfInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.BOOKSHELF, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, BookShelfPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "BOOKSHELF");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "BOOKSHELF");
								p.sendMessage(msg_not_have);
							}
							break;
						case OBSIDIAN:
							int ObsidianPrice = config.getInt("shop_obsidian_cost");
							ItemStack del_Obsidian = new ItemStack(Material.OBSIDIAN, 32);
							
							int ObsidanInInventory = countItemsInInventory(p, del_Obsidian);
							
							if (ObsidanInInventory >= 32)
							{
								ItemStack ooIadNNN = new ItemStack(Material.OBSIDIAN, 32);
								p.getInventory().removeItem(ooIadNNN);
								economy.depositPlayer(p, ObsidianPrice);
								String sell = (ChatUtil.Color(config.getString("sell_item")));
								String msg_sell = sell.replace("%item%", "OBSIDIAN");
								p.sendMessage(msg_sell);
							}
							else
							{
								String reguire_not_have = (ChatUtil.Color(config.getString("dont_have_minimum_item")));
								String msg_not_have = reguire_not_have.replace("%item%", "OBSIDIAN");
								p.sendMessage(msg_not_have);
							}
							break;
					}
					e.setCancelled(true);
				}
			}
		}
	}
	
    private int countItemsInInventory(Player player, ItemStack itemStack) {
        int count = 0;
        for (ItemStack item : player.getInventory().getContents()) {
            if (item != null && item.isSimilar(itemStack)) {
                count += item.getAmount();
            }
        }
        return count;
    }
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}
}
