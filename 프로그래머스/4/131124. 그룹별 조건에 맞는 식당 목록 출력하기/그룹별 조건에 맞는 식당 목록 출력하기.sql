-- 코드를 입력하세요
SELECT m.member_name, r.review_text, r.review_date
from member_profile m join rest_review r on m.member_id = r.member_id
where m.member_id in (
    select member_id 
    from rest_review 
    group by member_id
    having count(*) = (
        select max(cnt)
        from (
            select count(*) as cnt
            from rest_review
            group by member_id
        ) c
    )
)
order by 3, 2;