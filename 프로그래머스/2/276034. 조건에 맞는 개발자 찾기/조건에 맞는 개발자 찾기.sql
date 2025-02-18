-- 코드를 작성해주세요
SELECT distinct d.id, d.email, d.first_name, d.last_name
from developers d join skillcodes s on s.name in ("Python", "C#") and d.skill_code & s.code = s.code
order by 1;