-- 코드를 입력하세요
SELECT u.user_id, u.nickname, concat(u.city, ' ', u.street_address1, ' ', u.street_address2) 전체주소, concat(substring(u.tlno, 1, 3), '-', substring(u.tlno, 4, 4), '-', substring(u.tlno, 8, 4)) 전화번호
from used_goods_board b join used_goods_user u on b.writer_id = u.user_id
group by b.writer_id having count(*) >= 3
order by 1 desc;