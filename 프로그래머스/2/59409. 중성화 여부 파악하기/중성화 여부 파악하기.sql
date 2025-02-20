-- 코드를 입력하세요
SELECT animal_id, name, if(sex_upon_intake regexp '^neutered|^spayed', 'O', 'X')
from animal_ins
order by 1;