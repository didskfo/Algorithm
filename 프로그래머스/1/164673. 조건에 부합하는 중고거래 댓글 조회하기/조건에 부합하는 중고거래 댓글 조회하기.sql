-- 코드를 입력하세요
SELECT b.title, b.board_id, r.reply_id, r.writer_id, r.contents, substring(r.created_date, 1, 10)
from used_goods_board b inner join used_goods_reply r on b.board_id = r.board_id
where b.created_date like '2022-10%'
order by r.created_date asc, b.title asc