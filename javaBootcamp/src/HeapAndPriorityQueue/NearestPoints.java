package HeapAndPriorityQueue;

import java.util.PriorityQueue;

public class NearestPoints {
    static class Point implements Comparable<Point>{
        int x ;
        int y;
        int disSq;
        int index;
        public Point(int x, int y, int disSq,int index){
            this.x = x;
            this.y= y;
            this.disSq = disSq;
           this.index = index;
        }
        @Override
        public  int compareTo(Point p2){
            return this.disSq-p2.disSq;
        }
    }

    public static void main(String[] args) {
        int[][] pts = {
                {3,3},
                {5,-1},
                {-2,4}
        };
        PriorityQueue<Point> points = new PriorityQueue<>();
        int k = 2;
        for (int i = 0; i <pts.length ; i++) {
            int dist = pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            points.add(new Point(pts[i][0],pts[i][1],dist , i));
        }
        for (int i = 0; i <k; i++) {
            System.out.println("C" + points.remove().index);
        }
    }
}
