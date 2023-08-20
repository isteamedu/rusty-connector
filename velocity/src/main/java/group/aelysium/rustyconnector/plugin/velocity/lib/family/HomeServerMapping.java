package group.aelysium.rustyconnector.plugin.velocity.lib.family;

import com.velocitypowered.api.proxy.Player;
import group.aelysium.rustyconnector.plugin.velocity.lib.module.PlayerServer;

import java.util.Objects;

public final class HomeServerMapping {
    private final Player player;
    private final PlayerServer server;
    private final StaticServerFamily family;

    public HomeServerMapping(Player player, PlayerServer server, StaticServerFamily family) {
        this.player = player;
        this.server = server;
        this.family = family;
    }

    public Player player() {
        return player;
    }

    public PlayerServer server() {
        return server;
    }

    public StaticServerFamily family() {
        return family;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (HomeServerMapping) obj;
        return Objects.equals(this.player, that.player) &&
                Objects.equals(this.server, that.server) &&
                Objects.equals(this.family, that.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, server, family);
    }

    @Override
    public String toString() {
        return "HomeServerMapping[" +
                "player=" + player + ", " +
                "server=" + server + ", " +
                "family=" + family + ']';
    }
}
