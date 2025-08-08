class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String regex = "[^" + skill + "]";
        for (String skill_tree : skill_trees) {
            skill_tree = skill_tree.replaceAll(regex, "");
            boolean check = true;
            for (int i = 0; i < skill_tree.length(); i++) {
                if (skill_tree.charAt(i) != skill.charAt(i)) {
                    check = false;
                    break;
                }
            }
            if (check) answer++;
        }
        return answer;
    }
}