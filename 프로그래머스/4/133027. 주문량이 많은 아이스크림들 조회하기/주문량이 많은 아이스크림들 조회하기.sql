-- 코드를 입력하세요
SELECT flavor
FROM (
    SELECT flavor, total_order
    FROM first_half

    UNION ALL

    SELECT flavor, total_order
    FROM july
) t
group by flavor
order by sum(total_order) desc
limit 3;