-- 코드를 작성해주세요
select count(*) fish_count, n.fish_name
from fish_info f join fish_name_info n on f.fish_type = n.fish_type
group by 2
order by 1 desc;