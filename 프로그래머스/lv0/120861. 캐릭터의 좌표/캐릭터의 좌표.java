class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] place = {0, 0};
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")) {
                place[1]++;
                if (place[1] > board[1] / 2) {
            place[1] = board[1] / 2;
        }
            } else if (keyinput[i].equals("down")) {
                place[1]--;
                if (place[1] < -1 * (board[1] / 2)) {
            place[1] = -1 * (board[1] / 2);
        } 
            } else if (keyinput[i].equals("left")) {
                place[0]--;
                if (place[0] < -1 * (board[0] / 2)) {
            place[0] = -1 * (board[0] / 2);
        }
            } else {
                place[0]++;
                if (place[0] > board[0] / 2) {
            place[0] = board[0] / 2;
        }
            }
        }
        // if (place[0] < -1 * (board[0] / 2)) {
        //     place[0] = -1 * (board[0] / 2);
        // } else if (place[0] > board[0] / 2) {
        //     place[0] = board[0] / 2;
        // }
        // if (place[1] < -1 * (board[1] / 2)) {
        //     place[1] = -1 * (board[1] / 2);
        // } else if (place[1] > board[1] / 2) {
        //     place[1] = board[1] / 2;
        // }
        int[] answer = place;
        return answer;
    }
}