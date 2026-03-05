-- 코드를 입력하세요
SELECT p.product_code, sum(p.price * o.sales_amount) as SALES
from product p join offline_sale o on p.product_id = o.product_id
group by 1
order by 2 desc, 1;