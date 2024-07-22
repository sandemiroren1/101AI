package main.java.GameProperties;

import java.util.Objects;

public class Tile{
    private TileColor tileColor;
    private byte number;

    public TileColor getTileColor() {
        return tileColor;
    }

    public void setTileColor(TileColor tileColor) {
        this.tileColor = tileColor;
    }

    public byte getNumber() {
        return number;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return number == tile.number && tileColor == tile.tileColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tileColor, number);
    }
}