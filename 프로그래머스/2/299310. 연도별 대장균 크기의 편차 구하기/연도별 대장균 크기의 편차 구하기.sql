-- 코드를 작성해주세요
SELECT year(differentiation_date) year, (year_max - size_of_colony) year_dev, id
from (select *, max(size_of_colony) over (partition by year(differentiation_date)) year_max from ecoli_data) t
order by 1, 2;