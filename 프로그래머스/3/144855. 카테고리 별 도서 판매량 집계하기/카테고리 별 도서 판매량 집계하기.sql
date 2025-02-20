-- 코드를 입력하세요
SELECT category, sum(s.sales)
from book b join book_sales s on b.book_id = s.book_id
where s.sales_date like '2022-01%'
group by 1
order by 1;