-- 코드를 입력하세요
SELECT history_id, car_id, date_format(start_date, '%Y-%m-%d'), date_format(end_date, '%Y-%m-%d'), if(datediff(end_date, start_date)<29, '단기 대여', '장기 대여') as RENT_TYPE
from car_rental_company_rental_history
where date_format(start_date, '%Y-%m') = '2022-09'
order by 1 desc;