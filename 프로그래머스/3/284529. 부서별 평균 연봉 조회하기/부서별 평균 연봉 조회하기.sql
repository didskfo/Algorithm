-- 코드를 작성해주세요
select d.dept_id, d.dept_name_en, round(avg(sal), 0) avg_sal
from hr_department d join hr_employees e on d.dept_id = e.dept_id
group by 1
order by 3 desc;