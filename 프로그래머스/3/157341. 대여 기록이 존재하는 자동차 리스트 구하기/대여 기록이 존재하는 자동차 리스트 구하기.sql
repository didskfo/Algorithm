-- 코드를 입력하세요
SELECT distinct(c.car_id)
from car_rental_company_car c join car_rental_company_rental_history h on c.car_id = h.car_id
where c.car_type = '세단' and month(h.start_date) = 10
order by 1 desc;