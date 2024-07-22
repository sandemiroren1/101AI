package main.java;


import GameProperties.Tile;
import GameProperties.TileSequence;

import java.util.HashSet;

public class GameState {
    private Tile joker;
    private HashSet<Tile> discardedTiles;
    private Tile lastDiscardedTile;
    private byte currentPlayer; // Number from 0 to 4 to indicate whose turn it is.
    private HashSet<TileSequence> middleTileSets; // For the sequences of tiles that the players may have
}
