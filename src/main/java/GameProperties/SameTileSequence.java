package main.java.GameProperties;

public class SameTileSequence implements TileSequence{
    private Tile tile;
    
    @Override
    public TileSequenceType getType() {
        return TileSequenceType.SAME;
    }
}
