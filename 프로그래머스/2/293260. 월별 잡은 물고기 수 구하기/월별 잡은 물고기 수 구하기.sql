-- 코드를 작성해주세요
select count(*) fish_count, month(time) month
from fish_info
group by 2
order by 2;