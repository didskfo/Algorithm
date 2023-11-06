// - Array.prototype.forEach()

function solution(s){
    var answer = true;
    let open = 0;
    let list = s.split("");
    console.log(list);
    list.forEach(a => {
        if(a === "("){
            open += 1;
        } else if (a === ")"){
            open -= 1;
        }
        if(open < 0){
            answer = false;
        }
    })
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    if (open !== 0) {
        return false;
    }
    return answer;
}