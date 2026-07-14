package ru.dev;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DClanExpansion extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "SimpleKitPaperPlugin";
    }

    @Override
    public @NotNull String getAuthor() {
        return "destrivate";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0";
    }

    @Override
    public boolean persist() {
        return true;
    }
    @Override
    public String onPlaceholderRequest(Player player, @NotNull String params) {
        if(player == null){return "";}

        if(params.equalsIgnoreCase("name")){
            return "test";
        }

        return null;

    }

}
