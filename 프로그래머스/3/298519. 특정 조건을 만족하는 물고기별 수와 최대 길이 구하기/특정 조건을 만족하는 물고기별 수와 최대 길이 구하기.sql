-- 코드를 작성해주세요
select count(*) fish_count, max(length) max_length, fish_type
from fish_info
where fish_type in (select fish_type from fish_info group by 1 having avg(ifnull(length, 10))>=33)
group by 3
order by 3;