-- 코드를 작성해주세요
SELECT sum(g.score) as score, e.emp_no, e.emp_name, e.position, e.email
from hr_employees e join hr_grade g on e.emp_no = g.emp_no
where g.year = 2022
group by g.emp_no having score = (select max(total_score) from (select sum(hr.score) as total_score from hr_grade hr where hr.year = 2022 group by hr.emp_no) as total)