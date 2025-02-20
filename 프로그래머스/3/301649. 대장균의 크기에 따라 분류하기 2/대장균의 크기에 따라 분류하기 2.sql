-- 코드를 작성해주세요
select id, case when n_rank = 1 then 'CRITICAL' when n_rank = 2 then 'HIGH' when n_rank = 3 then 'MEDIUM' else 'LOW' end colony_name
from (
    select id, ntile(4) over (order by size_of_colony desc) n_rank 
    from ecoli_data
) rank_data
order by 1;