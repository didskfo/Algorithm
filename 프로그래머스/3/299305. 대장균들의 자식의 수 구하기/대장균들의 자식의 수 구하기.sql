-- 코드를 작성해주세요
select a.id, count(b.parent_id) child_count
from ecoli_data a left join ecoli_data b on a.id = b.parent_id
group by 1
order by 1;