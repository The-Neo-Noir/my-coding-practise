package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;
import java.util.Map;

public class AlphabetBoardPath {
    public static void main(String[] args) {
        AlphabetBoardPath alphabetBoardPath = new AlphabetBoardPath();
        String agz = alphabetBoardPath.alphabetBoardPath("aza");
        System.out.println(agz);

    }

    public String alphabetBoardPath(String target) {
        HashMap<Character, Position> map = new HashMap<>();
        buildMap(map);
        StringBuffer sb = new StringBuffer();
        Position current = new Position(0, 0);
        for (Character ch : target.toCharArray()) {
            Position newC = new Position(map.get(ch).row, map.get(ch).col);
            move(current, newC, sb);
            current = newC;
        }
        return sb.toString();
    }

    private void move(Position current, Position newCrr, StringBuffer sb) {
        boolean taken = true;
        if (current.equals(newCrr)) {
            sb.append("!");
        } else {
            moveRow(current, newCrr, sb);
            if (newCrr.row == 5 && newCrr.col == 0) {
                System.out.println("en");

                // TODO: this portion needs to be done.
                sb.replace(sb.lastIndexOf("D"), sb.lastIndexOf("D") + 1, "");
                current.row = newCrr.row - 1;
                current.col = current.col;
                newCrr.row = 4;
                newCrr.col = 0;
                moveCol(current, newCrr, sb);
                sb.append("D");
                taken = false;
                newCrr.row = 5;
                newCrr.col = 0;
            }
            if (taken) {
                moveCol(current, newCrr, sb);
            }
            sb.append("!");
        }

    }

    private void moveRow(Position current, Position newCrr, StringBuffer sb) {
        int times = current.row - newCrr.row;
        if (times < 0) {
            for (int i = 0; i < Math.abs(times); i++) {
                sb.append("D");
            }
            newCrr.row = current.row + Math.abs(times);

        } else {
            for (int i = 0; i < times; i++) {
                sb.append("U");
            }
            newCrr.row = current.row - times;
        }
    }

    private void moveCol(Position current, Position newCrr, StringBuffer sb) {
        int times = current.col - newCrr.col;
        if (times < 0) {
            for (int i = 0; i < Math.abs(times); i++) {
                sb.append("R");
            }
            newCrr.col = current.col + Math.abs(times);
        } else {
            for (int i = 0; i < times; i++) {
                sb.append("L");
            }
            newCrr.col = current.col - times;
        }
    }

    private void buildMap(Map<Character, Position> map) {
        int a = 97;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                map.put((char) a++, new Position(i, j));
            }
        }

        map.put('z', new Position(5, 0));
    }

    class Position {
        int row;
        int col;

        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public boolean equals(Object that) {
            if (that == null) return false;
            if (!(that instanceof Position)) return false;
            Position p = (Position) that;
            return this.row == p.row && this.col == p.col;
        }
    }
}
