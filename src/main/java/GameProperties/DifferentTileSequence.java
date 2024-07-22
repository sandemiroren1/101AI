package GameProperties;

import GameProperties.Enums.TileAddResponse;
import GameProperties.Enums.TileColor;
import GameProperties.Enums.TileSequenceType;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
public class DifferentTileSequence implements TileSequence {
    private List<Tile> tiles;
    private TileSequenceType tileSequenceType;

    public DifferentTileSequence(List<Tile> tiles) {
        if(tiles.size()<3){
            throw new IllegalArgumentException("Different Tile Sequence cannot have less than 3 tiles in it!");
        }
        List<Byte> tileNumbers = tiles.stream().map(Tile::getNumber).toList();
        this.tiles = tiles;
        boolean allOfThemTheSameNumber = tileNumbers.stream()
            .allMatch(n -> n.equals(tileNumbers.get(0)));

        if(allOfThemTheSameNumber){
            HashSet<TileColor> colorsInTheSequence = new HashSet<>(4);
            if(tiles.size()>4){
                throw new IllegalArgumentException("More Than 4 of the Same Number Does Not Make a Sequence!");
            }
            if(!tiles.stream().allMatch(x->colorsInTheSequence.add(x.getTileColor()))){
                throw new IllegalArgumentException("Not all in same sequence are different");
            }
            tileSequenceType = TileSequenceType.SAME_NUMBER;
            return;
        }

        boolean isSortedAscending = IntStream.range(0, tileNumbers.size() - 1)
            .allMatch(i -> tileNumbers.get(i) == tileNumbers.get(i + 1)-1);
        boolean isSameColor = tiles.stream().allMatch(x->x.getTileColor().equals(tiles.get(0).getTileColor()));
        if(isSortedAscending&&isSameColor){
            tileSequenceType = TileSequenceType.ASCENDING;
        }



    }

    @Override
    public TileSequenceType getType() {
        return null;
    }

    public List<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(List<Tile> tiles) {
        this.tiles = tiles;
    }

    /**
     * Method for possibly adding a tile to the list
     * @param tile The tile to possibly add the to the list
     * @return
     */
    public TileAddResponse addTile(Tile tile){
        if(tile == null){
            throw new IllegalArgumentException("Null Tile Attempted to be added!");
        }

        // TODO;
        throw new RuntimeException("TODO");
    }

    public TileAddResponse isTileCompatibleWithSequence(Tile tile){
        if(tile == null){
            throw new IllegalArgumentException("Null Tile!");
        }
        TileColor tileColor = tile.getTileColor();
        //TODO
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DifferentTileSequence that)) return false;
        return getTiles().equals(that.getTiles());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTiles());
    }
}
