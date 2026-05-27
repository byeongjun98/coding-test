class Solution {
    public String solution(String[] id_pw, String[][] db) {

        for (int i = 0; i < db.length; i++) {

            // 아이디가 같은 경우
            if (db[i][0].equals(id_pw[0])) {

                // 비밀번호까지 같으면 로그인 성공
                if (db[i][1].equals(id_pw[1])) {
                    return "login";
                }

                // 아이디는 맞는데 비밀번호 틀림
                return "wrong pw";
            }
        }

        // 일치하는 아이디 없음
        return "fail";
    }
}