-- 코드를 작성해주세요
SELECT count(id) as FISH_COUNT
from fish_info
where date_format(time, '%Y') = '2021'