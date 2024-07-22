package GameProperties;


import GameProperties.Enums.TileSequenceType;
import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class SameTileSequence implements TileSequence {
    private Tile tile;

    @Override
    public TileSequenceType getType() {
        return TileSequenceType.SAME_TILE;
    }

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SameTileSequence that)) return false;
        return getTile().equals(that.getTile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTile());
    }
}
