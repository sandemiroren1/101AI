package main.java;

import main.java.GameProperties.Tile;

import java.util.HashSet;
import java.util.List;

public class GameState {
    private Tile joker;
    private HashSet<Tile> discardedTiles;
    private Tile lastDiscardedTile;
    private byte currentPlayer; // Number from 0 to 4 to indicate whose turn it is.
    private HashSet<List<Tile>> middleTileSets; // For the sequences of tiles that the players may have
}
