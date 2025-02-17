-- 코드를 작성해주세요
SELECT count(id) as COUNT
from ecoli_data
where genotype & 2 = 0 and (genotype & 1 = 1 or genotype & 4 = 4)