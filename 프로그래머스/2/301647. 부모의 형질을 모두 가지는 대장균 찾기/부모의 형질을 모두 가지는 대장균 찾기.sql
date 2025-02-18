-- 코드를 작성해주세요
SELECT a.id, a.genotype, b.genotype as parent_genotype
from ecoli_data a left join ecoli_data b on a.parent_id = b.id
where a.genotype & b.genotype = b.genotype
order by 1;