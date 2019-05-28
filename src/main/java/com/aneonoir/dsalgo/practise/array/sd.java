//package com.aneonoir.dsalgo.practise.array;
//
//import org.junit.Test;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import static org.junit.Assert.assertTrue;
//
//public class sd {
//    @Test
//    public void test() {
//        assertTrue(robotWalk(new int[]{4, 4, 3, 2, 2, 3}));
//
//    }
//
//
//    boolean robotWalk(int[] a) {
//        Stream.of(inputStr.split("\\s+")).collect(Collectors.joining());
//    }
//        Point starting = new Point(0, 0);
//        HashMap<Point, Integer> map = new HashMap<>();
//        map.put(starting, 1);
//        for (int i = 0; i < a.length; i++) {
//            //  up: 0,lasty+a[i]       0
//            // right: lastx+a[i],lasty1
//            //  down: lastx,lasty-a[i];2
//            //  left: lastx-a[i],lasty 3
//            switch (i % 4) {
//                case 0:
//                    Point p1 = new Point(starting.x, starting.y + a[i]);
//
//                    populateMap(map, starting, p1, "yinc");
//                    starting = p1;
//                    break;
//                case 1:
//                    Point p2 = new Point(starting.x + a[i], starting.y);
//                    populateMap(map, starting, p2, "xinc");
//                    starting = p2;
//                    break;
//                case 2:
//                    Point p3 = new Point(starting.x, starting.y - a[i]);
//                    populateMap(map, starting, p3,  "ydec");
//                    starting = p3;
//                    break;
//                case 3:
//                    Point p4 = new Point(starting.x - a[i], starting.y);
//                    populateMap(map, starting, p4, "xdec");
//                    starting = p4;
//                default:
//            }
//
//        }
//        return map.values().stream().anyMatch(integer -> integer > 1);
//    }
//
//
//    void populateMap(Map<Point, Integer> map, Point starting, Point p, String instruction) {
//        if (instruction.equals("xinc")) {
//            for (int i = starting.x + 1; i < p.x; i++) {
//                Point pL = new Point(i, p.y);
//                map(map, pL);
//            }
//        } else if (instruction.equals("yinc")) {
//            for (int i = starting.y + 1; i < p.y; i++) {
//                Point pL = new Point(p.x, i);
//                map(map, pL);
//            }
//        } else if (instruction.equals("xdec")) {
//            for (int i = starting.x - 1; i >= p.x; i--) {
//                Point pL = new Point(i, p.y);
//                map(map, pL);
//            }
//        } else {
//            for (int i = starting.y - 1; i >= p.y; i--) {
//                Point pL = new Point(p.x, i);
//                map(map, pL);
//            }
//        }
//
//
//    }
//
//    void map(Map<Point, Integer> map, Point p) {
//        if (map.containsKey(p)) {
//            map.put(p, map.get(p) + 1);
//        } else {
//            map.put(p, 1);
//        }
//    }
//
//    class Point {
//        int x;
//        int y;
//
//        public Point(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            Point point = (Point) o;
//
//            if (x != point.x) return false;
//            return y == point.y;
//        }
//
//        @Override
//        public int hashCode() {
//            int result = x;
//            result = 31 * result + y;
//            return result;
//        }
//    }
//}
//
//
