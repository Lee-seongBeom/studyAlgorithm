import java.util.HashSet;
import java.util.Set;

public class Solution {
    // 방향 벡터를 정의합니다.
    private static final int[][] DIRECTIONS = {
        {0, 1}, {1, 1}, {1, 0}, {1, -1},
        {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}
    };

    public static int solution(int[] arrows) {
        // 방문한 노드와 간선을 저장할 셋
        Set<String> visitedNodes = new HashSet<>();
        Set<String> visitedEdges = new HashSet<>();

        // 현재 위치
        int x = 0, y = 0;
        visitedNodes.add(x + "," + y);

        // 방의 개수
        int rooms = 0;

        // 이동 방향을 따라가면서 경로를 계산합니다.
        for (int arrow : arrows) {
            // 각 방향으로 2번씩 이동 (교차점을 고려하여)
            for (int i = 0; i < 2; i++) {
                int nextX = x + DIRECTIONS[arrow][0];
                int nextY = y + DIRECTIONS[arrow][1];

                // 현재 노드와 다음 노드 사이의 간선
                String edge = x + "," + y + "," + nextX + "," + nextY;
                String reverseEdge = nextX + "," + nextY + "," + x + "," + y;

                // 새로운 노드를 방문하는 경우
                if (!visitedNodes.contains(nextX + "," + nextY)) {
                    visitedNodes.add(nextX + "," + nextY);
                } 
                // 방문한 적 있는 노드인데 새로운 간선을 지나는 경우
                else if (!visitedEdges.contains(edge)) {
                    rooms++;
                }

                // 간선 방문 표시
                visitedEdges.add(edge);
                visitedEdges.add(reverseEdge);

                // 위치 이동
                x = nextX;
                y = nextY;
            }
        }

        return rooms;
    }

    public static void main(String[] args) {
        int[] arrows = {6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0};
        System.out.println(solution(arrows));  // 예상 출력: 3
    }
}
