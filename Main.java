package gq.devmc.score;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public Map<Player, ScoreboardSign> boards = new HashMap<>();
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		ScoreboardSign scoreboard = new ScoreboardSign(player, "§9§lScorename");
		scoreboard.create();
		scoreboard.setLine(0, "§9Informations here");
		scoreboard.setLine(1, "§1 ");
		scoreboard.setLine(2, "§2Informations here");
		scoreboard.setLine(3, "§3 ");
		scoreboard.setLine(4, "§4Informations here");
		boards.put(player, scoreboard);
	}
	
}
