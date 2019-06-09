package com.aneonoir.dsalgo.practise.graph;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * link: https://app.codesignal.com/arcade/graphs-arcade/kingdom-roads/CSzczQWdnYwmyEjvv
 * <p>
 * Struggle: Few struggle in generally where the k++ should happen. etc. Weakness is esstentially break
 * ing the problem down, and each assumption made has implecations.
 * <p>
 * tag: graph
 */
public class FindingMissingRoad {


    @Test
    public void test() {
        int input[][] = new int[][]

                {{5, 8},
                        {6, 0},
                        {0, 5},
                        {4, 1},
                        {0, 1},
                        {7, 0},
                        {6, 8},
                        {7, 3},
                        {2, 6},
                        {0, 2},
                        {0, 3},
                        {8, 7},
                        {5, 4},
                        {8, 4},
                        {8, 2},
                        {7, 1},
                        {4, 6},
                        {5, 6},
                        {4, 2},
                        {4, 7},
                        {2, 7},
                        {3, 6},
                        {8, 0},
                        {1, 6},
                        {3, 2},
                        {3, 4},
                        {4, 0},
                        {6, 7},
                        {5, 7}};
        int[][] ints = roadsBuilding(9, input);
        // System.out.println(ints);
    }


    int[][] roadsBuilding(int cities, int[][] roads) {
        int totalNumberOfRoads = ((cities - 1) * (cities)) / 2;
        int[][] result = new int[totalNumberOfRoads - roads.length][2];
        int k = 0, l = 0;
        for (int i = 0; i < cities; i++) {
            for (int j = i + 1; j < cities; j++) {

                if (!matches(roads, i, j)) {
                    result[k][0] = i;
                    result[k][1] = j;
                    k++;
                }
            }
        }

        return result;
    }

    @Test
    public void testMatches() {

        assertTrue(matches(new int[][]{{1, 2}}, 2, 1));
        assertTrue(matches(new int[][]{{2, 1}}, 1, 2));

    }

    boolean matches(int roads[][], int i, int j) {
        boolean result = false;

        for (int k = 0; k < roads.length; k++) {
            if ((i == roads[k][0] || i == roads[k][1]) && (j == roads[k][0] || j == roads[k][1])) {
                result = true;
                break;
            }

        }
        return result;
    }


}
